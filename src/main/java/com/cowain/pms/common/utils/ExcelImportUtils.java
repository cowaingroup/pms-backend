package com.cowain.pms.common.utils;


import com.cowain.pms.modules.sys.entity.ExcelColumn;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.CharUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExcelImportUtils {
    private final static Logger log = LoggerFactory.getLogger(ExcelImportUtils.class);

    private final static String EXCEL2003 = "xls";
    private final static String EXCEL2007 = "xlsx";
    private final static String EXCELSM = "xlsm";

    public static <T> Map<String, Object> readExcel(String path, Class<T> cls, MultipartFile file) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> errorList = new ArrayList<>() ;
        map.put("code", 0);
        String fileName = file.getOriginalFilename();
        if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$") && !fileName.matches("^.+\\.(?i)(xlsm)$")) {
            map.put("code", -1) ;
            map.put("msg", "上传文件格式不正确") ;
            return map;
        }
        List<T> dataList = new ArrayList<>();
        Workbook workbook = null;
        try {
            InputStream is = file.getInputStream();
            if (fileName.endsWith(EXCEL2007) || fileName.endsWith(EXCELSM)) {
//                FileInputStream is = new FileInputStream(new File(path));
                workbook = new XSSFWorkbook(is);
            }
            if (fileName.endsWith(EXCEL2003)) {
//                FileInputStream is = new FileInputStream(new File(path));
                workbook = new HSSFWorkbook(is);
            }
            if (workbook != null) {
                //类映射  注解 value-->bean columns
                Map<String, List<Field>> classMap = new HashMap<>();
                List<Field> fields = Stream.of(cls.getDeclaredFields()).collect(Collectors.toList());

                fields.forEach(
                        field -> {
                            ExcelColumn annotation = field.getAnnotation(ExcelColumn.class);
                            if (annotation != null) {
                                String value = annotation.columnName();
                                if (StringUtils.isBlank(value)) {
                                    return;//return起到的作用和continue是相同的 语法
                                }
                                if (!classMap.containsKey(value)) {
                                    classMap.put(value, new ArrayList<>());
                                }
                                field.setAccessible(true);
                                classMap.get(value).add(field);
                            }
                        }
                );
                //索引-->columns
                Map<Integer, List<Field>> reflectionMap = new HashMap<>(16);
                //默认读取第一个sheet
                Sheet sheet = workbook.getSheetAt(0);
                boolean firstRow = true;
                log.error("sheet.getLastRowNum():"+sheet.getLastRowNum());

                for (int i = sheet.getFirstRowNum(); i <=sheet.getLastRowNum(); i++) {
                    int errorRow = i + 1 ;
                    Row row = sheet.getRow(i);
                    log.error("classMap.size():"+classMap.size());
                    log.error("row.getLastCellNum():"+row.getLastCellNum());
                    if(classMap.size()!=row.getLastCellNum()){
                        map.put("code", -1);
                        map.put("msg", "上传格式与模板不一致");
                    }
                    //首行  提取注解
                    else if (firstRow) {
                        for (int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++) {
                            Cell cell = row.getCell(j);
                            String cellValue = getCellValue(cell);
                            if (classMap.containsKey(cellValue)) {
                                reflectionMap.put(j, classMap.get(cellValue));
                            } else {
                                map.put("code", -1);
                                map.put("msg", "上传格式与模板不一致");
                            }
                        }
                        firstRow = false;
                    } else {
                        if ((int) map.get("code") == 0) {
                            //忽略空白行
                            if(row != null){
                                try {
                                    T t = cls.newInstance();
                                    //判断是否为空白行
                                    boolean allBlank = true ;
                                    for (int j = row.getFirstCellNum(); j <row.getLastCellNum(); j++) {
                                        if (reflectionMap.containsKey(j)) {
                                            Cell cell = row.getCell(j);
                                            String cellValue = getCellValue(cell);
                                            if (StringUtils.isNotBlank(cellValue)) {
                                                allBlank = false;
                                            }
                                            List<Field> fieldList = reflectionMap.get(j);
                                            for(int m=0; m<fieldList.size(); m++){
                                                Field x = fieldList.get(m) ;
                                                if (x.getAnnotation(ExcelColumn.class).require()) {
                                                    if (StringUtils.isEmpty(cellValue)) {
                                                        errorList.add("第"+errorRow+"行，第"+excelColIndexToStr(j)+"列, 有必填项未填") ;
                                                    }else{
                                                        try {
                                                            Map<String, Object> res1=  handleField(t, cellValue, x);
                                                            if(null!=res1&&0<res1.size()){
                                                                errorList.add("第"+errorRow+"行，第"+excelColIndexToStr(j)+"列, "+res1.get("msg")) ;
                                                            }
                                                        } catch (Exception e) {
                                                            log.error(String.format("reflect field:%s value:%s exception!", x.getName(), cellValue), e);
                                                        }
                                                    }
                                                } else {
                                                    if ((int) map.get("code") == 0) {
                                                        try {
                                                            Map<String, Object> res1=  handleField(t, cellValue, x);
                                                            if(null!=res1&&0<res1.size()){
                                                                errorList.add("第"+errorRow+"行，第"+excelColIndexToStr(j)+"列, "+res1.get("msg")) ;
                                                            }
                                                        } catch (Exception e) {
                                                            log.error(String.format("reflect field:%s value:%s exception!", x.getName(), cellValue), e);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (!allBlank) {
                                        dataList.add(t);
                                    } else {
                                        log.warn(String.format("row:%s is blank ignore!", i));
                                    }
                                } catch (Exception e) {
                                    log.error(String.format("parse row:%s exception!", i), e);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            log.error(String.format("parse excel exception!"), e);
        } finally {
            if (workbook != null) {
                try {
                    workbook.close();
                } catch (Exception e) {
                    log.error(String.format("parse excel exception!"), e);
                }
            }
        }
        map.put("dataList", dataList);
        map.put("errorList", errorList) ;
        return map ;
    }

    private static String getCellValue(Cell cell) {
        if (cell == null) {
            return "";
        }
        if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
            if (DateUtil.isCellDateFormatted(cell)) {
                return HSSFDateUtil.getJavaDate(cell.getNumericCellValue()).toString();
            } else {
                return new BigDecimal(cell.getNumericCellValue()).toString();
            }
        } else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
            return StringUtils.trimToEmpty(cell.getStringCellValue());
        } else if (cell.getCellType() == Cell.CELL_TYPE_FORMULA) {
            return StringUtils.trimToEmpty(cell.getCellFormula());
        } else if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
            return "";
        } else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
            return String.valueOf(cell.getBooleanCellValue());
        } else if (cell.getCellType() == Cell.CELL_TYPE_ERROR) {
            return "ERROR";
        } else {
            return cell.toString().trim();
        }
    }

    private static <T> Map<String, Object> handleField(T t, String value, Field field) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        Class<?> type = field.getType();
        if (type == null || type == void.class || StringUtils.isBlank(value)) {
            return map;
        }
        if (type == Object.class) {
            field.set(t, value);
            //数字类型
        } else if (type.getSuperclass() == null || type.getSuperclass() == Number.class) {
//            if(!isNum1(value)){
//                map.put("code",-1);
//                map.put("msg",value+"整数不正确");
//                return map;
//            }
            if(!isNumeric(value)){
                map.put("code",-1);
                map.put("msg",value+"--"+type.getSimpleName()+"不正确");
                return map;
            }
            if (type == int.class || type == Integer.class) {
                field.set(t, NumberUtils.toInt(value));
            } else if (type == long.class || type == Long.class) {
                field.set(t, NumberUtils.toLong(value));
            } else if (type == byte.class || type == Byte.class) {
                field.set(t, NumberUtils.toByte(value));
            } else if (type == short.class || type == Short.class) {
                field.set(t, NumberUtils.toShort(value));
            } else if (type == double.class || type == Double.class) {
                field.set(t, NumberUtils.toDouble(value));
            } else if (type == float.class || type == Float.class) {
                field.set(t, NumberUtils.toFloat(value));
            } else if (type == char.class || type == Character.class) {
                field.set(t, CharUtils.toChar(value));
            } else if (type == boolean.class) {
                field.set(t, BooleanUtils.toBoolean(value));
            } else if (type == BigDecimal.class) {
                field.set(t, new BigDecimal(value));
            }
        } else if (type == Boolean.class) {
            field.set(t, BooleanUtils.toBoolean(value));
        } else if (type == Date.class) {
            //验证日期有效性
            boolean flag = DateCheckUtils.checkDate(value) ;
            if(flag){
                field.set(t, value);
            }else{
                map.put("code",-1);
                map.put("msg",value+"--"+type.getSimpleName()+"不正确");
            }
        } else if (type == String.class) {
            field.set(t, value);
        } else {
            Constructor<?> constructor = type.getConstructor(String.class);
            field.set(t, constructor.newInstance(value));
        }
        return map;
    }

    //利用自带函数判断
    public static boolean isNum1(String str) {
        boolean b=true;
        for(int i=0;i<str.length();i++) {
            if(Character.isDigit(str.charAt(i))) {
                b= true;
            }else {
                b= false;
            }
            if(b==false)
                break;
        }
        return b;
    }

    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("^(\\-|\\+)?\\d+(\\.\\d+)?$");//这个是对的
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    public static void writeExcel(List<String> errorList, MultipartFile file){
        Workbook workbook = null;
        String fileName = file.getOriginalFilename();
        try {
            InputStream is = file.getInputStream();

            if (fileName.endsWith(EXCEL2007) || fileName.endsWith(EXCELSM)) {
//                FileInputStream is = new FileInputStream(new File(path));
                workbook = new XSSFWorkbook(is);
            }
            if (fileName.endsWith(EXCEL2003)) {
//                FileInputStream is = new FileInputStream(new File(path));
                workbook = new HSSFWorkbook(is);
            }
            if (workbook != null) {
                Sheet sheet = workbook.getSheetAt(0) ;
                int rowsCnt = sheet.getLastRowNum() + 2 ;

                //样式
                CellStyle cellStyle = workbook.createCellStyle();
                Font font = workbook.createFont();
                font.setColor(HSSFColor.RED.index);
                cellStyle.setFont(font);
                if(null!=errorList&&0<errorList.size()){
                    for(int i=0;i<errorList.size();i++){
                        Row row = sheet.createRow(rowsCnt);
                        Cell cell = row.createCell(0);
                        cell.setCellStyle(cellStyle);
                        cell.setCellValue(errorList.get(i));
                        rowsCnt++ ;
                    }

                    buildExcelFile("D:/test1.xlsx", workbook) ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeExcel(HttpServletResponse response, List<String> errorList, MultipartFile file){
        Workbook workbook = null;
        String fileName = file.getOriginalFilename();
        try {
            InputStream is = file.getInputStream();

            if (fileName.endsWith(EXCEL2007) || fileName.endsWith(EXCELSM)) {
//                FileInputStream is = new FileInputStream(new File(path));
                workbook = new XSSFWorkbook(is);
            }
            if (fileName.endsWith(EXCEL2003)) {
//                FileInputStream is = new FileInputStream(new File(path));
                workbook = new HSSFWorkbook(is);
            }
            if (workbook != null) {
                Sheet sheet = workbook.getSheetAt(0) ;
                int rowsCnt = sheet.getLastRowNum() + 2 ;

                //样式
                CellStyle cellStyle = workbook.createCellStyle();
                Font font = workbook.createFont();
                font.setColor(HSSFColor.RED.index);
                cellStyle.setFont(font);
                if(null!=errorList&&0<errorList.size()){
                    for(int i=0;i<errorList.size();i++){
                        Row row = sheet.createRow(rowsCnt);
                        Cell cell = row.createCell(0);
                        cell.setCellStyle(cellStyle);
                        cell.setCellValue(errorList.get(i));
                        rowsCnt++ ;
                    }

//                    buildExcelFile("D:/test1.xlsx", workbook) ;
                    buildExcelDocument("D:/test1.xlsx", workbook, response) ;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 生成excel文件
     *
     * @param path 生成excel路径
     * @param wb
     */
    private static void buildExcelFile(String path, Workbook wb) {

        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        try {
            wb.write(new FileOutputStream(file));
            wb.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Excel column index begin 1
     * @param columnIndex
     * @return
     */
    public static String excelColIndexToStr(int columnIndex) {
        if (columnIndex <= 0) {
            return null;
        }
        String columnStr = "";
        columnIndex--;
        do {
            if (columnStr.length() > 0) {
                columnIndex--;
            }
            columnStr = ((char) (columnIndex % 26 + (int) 'A' + 1)) + columnStr;
            columnIndex = (int) ((columnIndex - columnIndex % 26) / 26);
        } while (columnIndex > 0);
        return columnStr;
    }

    /**
     * Excel column index begin 1
     * @param colStr
     * @param length
     * @return
     */
    public static int excelColStrToNum(String colStr, int length) {
        int num = 0;
        int result = 0;
        for(int i = 0; i < length; i++) {
            char ch = colStr.charAt(length - i - 1);
            num = (int)(ch - 'A' + 1) ;
            num *= Math.pow(26, i);
            result += num;
        }
        return result;
    }

    /**
     * 浏览器下载excel
     *
     * @param fileName
     * @param wb
     * @param response
     */

    private static void buildExcelDocument(String fileName, Workbook wb, HttpServletResponse response) {
        try {
            response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "utf-8"));
            response.flushBuffer();
            wb.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
