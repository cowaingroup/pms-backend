package com.cowain.pms.common.utils;

import com.cowain.pms.modules.wms.entity.PrintContentsEntity;
import com.cowain.pms.modules.wms.entity.PrinterEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsInDocDetailEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsQulityCheckDocDetailEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsReceivDocDetailEntity;
import com.cowain.pms.modules.wms.entity.outerentity.WmsErpOuinfoEntity;
import com.cowain.pms.modules.wms.entity.outerentity.WmsTaskDetailEntity;
import com.cowain.pms.modules.wms.syn.DocType;
import com.cowain.pms.modules.wms.syn.OutTaskStatus;
import com.cowain.pms.modules.wms.syn.WmsOutStatus;
import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.List;


public class PdfUtils {
    /**
     * 收货单模板
     */
    public  void createReceiv(List<WmsReceivDocDetailEntity> listEntity) throws Exception {
        if (listEntity.size()>0){
            PrintContentsEntity print = new PrintContentsEntity();
            print.setqRCodeString("Tra2019090023");
            print.setPath("D://print.pdf");
            print.setCompanyName("江苏科瑞恩自动化科技有限公司");
            print.setName("加工件收料单");
            List<Map<String, String>> detilsList = new ArrayList<Map<String, String>>();
            Map<String, String> detilsMap = new LinkedHashMap<>();
            detilsMap.put("供应商ID：", listEntity.get(0).getSupplyId());
            detilsMap.put("单据日期：", DateUtils.format(new Date()));
            detilsMap.put("WMS订单号：", listEntity.get(0).getWmsDocNo());
            detilsList.add(detilsMap);
            detilsMap = new LinkedHashMap<>();

            detilsMap.put("厂商名称：", listEntity.get(0).getSupplyName());
            detilsMap.put("打印次数：", "1");
            detilsMap.put("页    次：", "1/1");
            detilsList.add(detilsMap);

            detilsMap = new LinkedHashMap<>();
            String docType ="";
            if (listEntity.get(0).getDocType() == 1){
                docType = "标准收货";
            }else if (listEntity.get(0).getDocType() == 2){
                docType = "杂收";
            }else if (listEntity.get(0).getDocType() == 3){
                docType = "机加工收货";
            }else if (listEntity.get(0).getDocType() == 4){
                docType = "材料入库";
            }else {
                docType = "销售退回";
            }
            detilsMap.put("单据类型：", docType);
            detilsList.add(detilsMap);

            print.setDetailsList(detilsList);
            print.setColumnList(new float[]{30, 90, 114, 64, 50, 80, 50, 50});
            print.setHeaderList(new String[]{"序号", "料号", "物料描述", "单位", "到货数量", "项目", "质检员", "质检结论",});
            List<String> tabContent = new ArrayList<String>();
            List<List<String>> list = new ArrayList<>();
            String status;
            for (int i = 0; i < listEntity.size(); i++) {
                tabContent.add(String.valueOf(i+1));
                tabContent.add(listEntity.get(i).getItemCode());
                tabContent.add(listEntity.get(i).getItemDesc());
                tabContent.add(listEntity.get(i).getItemUnit());
                tabContent.add(String.valueOf(listEntity.get(i).getItemNum()));
                tabContent.add(listEntity.get(i).getProjectName());
                tabContent.add(listEntity.get(i).getUserId());
                if (listEntity.get(i).getStatus() == null){
                    status = "";
                }else if (listEntity.get(i).getStatus() == 1) {
                    status = "合格";
                }else{
                    status = "不合格";
                }
                tabContent.add(status);
            }
            list.add(tabContent);
            print.setTableList(list);
            print.setSignList(new String[]{"入库：", "品鉴：", "制单："});
            print.setRemark("一式四联：白（仓库）;红（采购）;黄（品检）;绿（厂商）;" + DateUtils.getCurrentDate());
            createPDF(print);
            System.out.print(DateUtils.getCurrentDate());
       }
    }
    /**
     * 质检单模板
     */
    public  void createQulityCheck(List<WmsReceivDocDetailEntity> listEntity) throws Exception{
        if (listEntity.size()>0){
            PrintContentsEntity print = new PrintContentsEntity();
            print.setqRCodeString("Tra2019090023");
            print.setPath("D://print.pdf");
            print.setCompanyName("江苏科瑞恩自动化科技有限公司");
            print.setName("进料拒收单");
            List<Map<String,String>> detilsList = new ArrayList<Map<String,String>>();
            Map<String,String> detilsMap = new LinkedHashMap<>();
            detilsMap.put("供应商ID：",listEntity.get(0).getSupplyId());
            detilsMap.put("单据日期：",DateUtils.format(new Date()));
            detilsMap.put("WMS订单号：",listEntity.get(0).getWmsDocNo());
            detilsList.add(detilsMap);
            detilsMap = new LinkedHashMap<>();

            detilsMap.put("厂商名称：",listEntity.get(0).getSupplyName());
            detilsMap.put("打印次数：","1");
            detilsMap.put("页    次：","1/1");
            detilsList.add(detilsMap);

            detilsMap = new LinkedHashMap<>();
            String docType ="";
            if (listEntity.get(0).getDocType() == 1){
                docType = "标准收货";
            }else if (listEntity.get(0).getDocType() == 2){
                docType = "杂收";
            }else if (listEntity.get(0).getDocType() == 3){
                docType = "机加工收货";
            }else if (listEntity.get(0).getDocType() == 4){
                docType = "材料入库";
            }else {
                docType = "销售退回";
            }
            detilsMap.put("单据类型：",docType);
            detilsList.add(detilsMap);

            print.setDetailsList(detilsList);
            print.setColumnList(new float[]{30, 75, 104, 64, 30,30,30, 70, 45, 50});
            print.setHeaderList(new String[]{"序号","料号","物料描述","单位","到货数量","实收数量","拒收数量","项目","质检员","质检结论",});
            List<String> tabContent = new ArrayList<String>();
            int netReceipts = 0;//实收
            int rejection = 0;//拒收
            String status;
            for (int i=0;i<listEntity.size();i++){
                tabContent.add(String.valueOf(i+1));
                tabContent.add(listEntity.get(i).getItemCode());
                tabContent.add(listEntity.get(i).getItemDesc());
                tabContent.add(listEntity.get(i).getItemUnit());
                tabContent.add(String.valueOf(listEntity.get(i).getItemNum()));
                if (listEntity.get(i).getStatus() == 3){
                    rejection = listEntity.get(i).getItemNum();
                }else{
                    netReceipts = listEntity.get(i).getItemNum();
                }
                tabContent.add(String.valueOf(netReceipts));
                tabContent.add(String.valueOf(rejection));
                tabContent.add(listEntity.get(i).getProjectName());
                tabContent.add(listEntity.get(i).getUserId());
                if (listEntity.get(i).getStatus() == null){
                    status = "待质检";
                }else if (listEntity.get(i).getStatus() == 1) {
                    status = "合格";
                }else if (listEntity.get(i).getStatus() == null){
                    status = "待质检";
                } else {
                    status = "不合格";
                }
                tabContent.add(status);
            }

            List<List<String>> list = new ArrayList<>();
            list.add(tabContent);
            print.setTableList(list);
            print.setSignList(new String[]{"厂商：","采购：","品检：","仓库："});
            print.setRemark("一式四联：白（仓库）;红（采购）;黄（品检）;绿（厂商）;" + DateUtils.getCurrentDate());
            createPDF(print);
            System.out.print(DateUtils.getCurrentDate());
        }
    }

    /**
     * 入库单模板
     */
    public  void createIn(List<WmsInDocDetailEntity> listEntity) throws Exception{
        if (listEntity.size()>0){
            PrintContentsEntity print = new PrintContentsEntity();
            print.setqRCodeString("Tra2019090023");
            print.setPath("D://print.pdf");
            print.setCompanyName("江苏科瑞恩自动化科技有限公司");
            print.setName("入库单");
            List<Map<String,String>> detilsList = new ArrayList<Map<String,String>>();
            Map<String,String> detilsMap = new LinkedHashMap<>();
            detilsMap.put("WMS订单号：",listEntity.get(0).getWmsDocNo());
            detilsMap.put("单据日期：",DateUtils.format(new Date()));
            detilsMap.put("打印次数：","1");
            detilsList.add(detilsMap);

            detilsMap = new LinkedHashMap<>();
            detilsMap.put("ERP订单号：",listEntity.get(0).getErpDocNo());
            detilsMap.put("单据类型：","入库单");
            detilsMap.put("页    次：","1/1");
            detilsList.add(detilsMap);

            print.setDetailsList(detilsList);
            print.setColumnList(new float[]{30, 90, 114, 64, 50, 80, 50, 50});
            print.setHeaderList(new String[]{"序号","料号","物料描述","项目","库位","预期入库数量","单位","实收数量",});
            List<String> tabContent = new ArrayList<String>();
            List<List<String>> list = new ArrayList<>();
            for (int i=0;i<listEntity.size();i++) {
                tabContent.add(String.valueOf(i+1));
                tabContent.add(listEntity.get(i).getItemCode());
                tabContent.add(listEntity.get(i).getItemDesc());
                tabContent.add(listEntity.get(i).getProjectName());
                tabContent.add(listEntity.get(i).getPositionCode());
                tabContent.add(String.valueOf(listEntity.get(i).getPreNum()));
                tabContent.add(listEntity.get(i).getItemUnit());
                tabContent.add(String.valueOf(listEntity.get(i).getActualNum()));
            }
            list.add(tabContent);
            print.setTableList(list);
            print.setSignList(new String[]{"仓库：","OQC：","核准：","审核：","申请："});
            print.setRemark("一式二联：白（仓库）;红（领用单位）;" + DateUtils.getCurrentDate());
            createPDF(print);
            System.out.print(DateUtils.getCurrentDate());
        }

    }

    /**
     * 出库单模板
     */
    public  void createOut(List<WmsErpOuinfoEntity> listEntity) throws Exception{
        PrintContentsEntity print = new PrintContentsEntity();
        print.setqRCodeString("Tra2019090023");
        print.setPath("D://print.pdf");
        print.setCompanyName("江苏科瑞恩自动化科技有限公司");
        print.setName("出库单");
        List<Map<String,String>> detilsList = new ArrayList<Map<String,String>>();
        Map<String,String> detilsMap = new LinkedHashMap<>();
        detilsMap.put("WMS订单号：",listEntity.get(0).getWmsDocNo());
        detilsMap.put("单据日期：",DateUtils.format(new Date()));
        detilsMap.put("打印次数：","1");
        detilsList.add(detilsMap);

        detilsMap = new LinkedHashMap<>();
        String erpDocNo;
        if (listEntity.get(0).getErpDocNo() == null){
            erpDocNo="";
        }else {
            erpDocNo = listEntity.get(0).getErpDocNo();
        }
        String docType = "";
        if (listEntity.get(0).getDocType() == DocType.STANDARD_OUT.getStatus()){
            docType = DocType.STANDARD_OUT.getDesc();
        }else if (listEntity.get(0).getDocType() == DocType.MATERIAL_OUT.getStatus()){
            docType = DocType.MATERIAL_OUT.getDesc();
        }else if (listEntity.get(0).getDocType() == DocType.MISC_OUT.getStatus()){
            docType = DocType.MISC_OUT.getDesc();
        }else if (listEntity.get(0).getDocType() == DocType.ADJUST_OUT.getStatus()){
            docType = DocType.ADJUST_OUT.getDesc();
        }else if (listEntity.get(0).getDocType() == DocType.BAD_OUT.getStatus()){
            docType = DocType.BAD_OUT.getDesc();
        }
        String status = "";
        if (listEntity.get(0).getStatus() == WmsOutStatus.CREATED.getStatus()){
            status = WmsOutStatus.CREATED.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.PART_ASSIGN.getStatus()){
            status = WmsOutStatus.PART_ASSIGN.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.ALL_ASSIGN.getStatus()){
            status = WmsOutStatus.ALL_ASSIGN.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.WAIT_PICK.getStatus()){
            status = WmsOutStatus.WAIT_PICK.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.PART_PICK.getStatus()){
            status = WmsOutStatus.PART_PICK.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.ALL_PICK.getStatus()){
            status = WmsOutStatus.ALL_PICK.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.WAIT_REVIEW.getStatus()){
            status = WmsOutStatus.WAIT_REVIEW.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.PART_REVIEW.getStatus()){
            status = WmsOutStatus.PART_REVIEW.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.ALL_REVIEW.getStatus()){
            status = WmsOutStatus.ALL_REVIEW.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.CANCEL.getStatus()){
            status = WmsOutStatus.CANCEL.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.SYNED.getStatus()){
            status = WmsOutStatus.SYNED.getDesc();
        }
        detilsMap.put("ERP订单号：",erpDocNo);
        detilsMap.put("单据类型：",docType);
        detilsMap.put("页   次：","1/1");
        detilsList.add(detilsMap);

        detilsMap = new LinkedHashMap<>();
        detilsMap.put("出库状态：",status);
        detilsList.add(detilsMap);

        print.setDetailsList(detilsList);
        print.setColumnList(new float[]{30, 90, 134, 89, 50, 85, 50});
        print.setHeaderList(new String[]{"序号","料号","物料描述","项目","库位","预期出库数量","单位"});
        List<String> tabContent = new ArrayList<String>();
        for (int i=0;i<listEntity.size();i++){
            tabContent.add(String.valueOf(i+1));
            tabContent.add(listEntity.get(i).getItemCode());
            tabContent.add(listEntity.get(i).getItemDesc());
            tabContent.add(listEntity.get(i).getProjectName());
            tabContent.add(listEntity.get(i).getPositionCode());
            tabContent.add(String.valueOf(listEntity.get(i).getItemNum()));
            tabContent.add(listEntity.get(i).getItemUnitCode());
        }
        List<List<String>> list = new ArrayList<>();
        list.add(tabContent);
        list.add(tabContent);
        print.setTableList(list);
        print.setSignList(new String[]{"仓库：","OQC：","核准：","审核：","申请："});
        print.setRemark("一式二联：白（仓库）;红（领用单位）;" + DateUtils.getCurrentDate());
        createPDF(print);
        System.out.print(DateUtils.getCurrentDate());
    }

    /**
     * 拣货单模板
     */
    public void createPick(List<WmsErpOuinfoEntity> listEntity) throws Exception{
        PrintContentsEntity print = new PrintContentsEntity();
        print.setqRCodeString("Tra2019090023");
        print.setPath("D://print.pdf");
        print.setCompanyName("江苏科瑞恩自动化科技有限公司");
        print.setName("拣货单");
        List<Map<String,String>> detilsList = new ArrayList<Map<String,String>>();
        Map<String,String> detilsMap = new LinkedHashMap<>();
        detilsMap.put("WMS订单号：",listEntity.get(0).getWmsDocNo());
        detilsMap.put("单据日期：",DateUtils.format(new Date()));
        detilsMap.put("打印次数：","1");
        detilsList.add(detilsMap);

        detilsMap = new LinkedHashMap<>();
        String erpDocNo;
        if (listEntity.get(0).getErpDocNo() == null){
            erpDocNo="";
        }else {
            erpDocNo = listEntity.get(0).getErpDocNo();
        }
        String docType = "";
        if (listEntity.get(0).getDocType() == DocType.STANDARD_OUT.getStatus()){
            docType = DocType.STANDARD_OUT.getDesc();
        }else if (listEntity.get(0).getDocType() == DocType.MATERIAL_OUT.getStatus()){
            docType = DocType.MATERIAL_OUT.getDesc();
        }else if (listEntity.get(0).getDocType() == DocType.MISC_OUT.getStatus()){
            docType = DocType.MISC_OUT.getDesc();
        }else if (listEntity.get(0).getDocType() == DocType.ADJUST_OUT.getStatus()){
            docType = DocType.ADJUST_OUT.getDesc();
        }else if (listEntity.get(0).getDocType() == DocType.BAD_OUT.getStatus()){
            docType = DocType.BAD_OUT.getDesc();
        }
        detilsMap.put("ERP订单号：",erpDocNo);
        detilsMap.put("单据类型：",docType);
        detilsMap.put("页    次：","1/1");
        detilsList.add(detilsMap);

        detilsMap = new LinkedHashMap<>();
        String status = "";
        if (listEntity.get(0).getStatus() == WmsOutStatus.CREATED.getStatus()){
            status = WmsOutStatus.CREATED.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.PART_ASSIGN.getStatus()){
            status = WmsOutStatus.PART_ASSIGN.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.ALL_ASSIGN.getStatus()){
            status = WmsOutStatus.ALL_ASSIGN.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.WAIT_PICK.getStatus()){
            status = WmsOutStatus.WAIT_PICK.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.PART_PICK.getStatus()){
            status = WmsOutStatus.PART_PICK.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.ALL_PICK.getStatus()){
            status = WmsOutStatus.ALL_PICK.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.WAIT_REVIEW.getStatus()){
            status = WmsOutStatus.WAIT_REVIEW.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.PART_REVIEW.getStatus()){
            status = WmsOutStatus.PART_REVIEW.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.ALL_REVIEW.getStatus()){
            status = WmsOutStatus.ALL_REVIEW.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.CANCEL.getStatus()){
            status = WmsOutStatus.CANCEL.getDesc();
        }else if (listEntity.get(0).getStatus() == WmsOutStatus.SYNED.getStatus()){
            status = WmsOutStatus.SYNED.getDesc();
        }
        detilsMap.put("拣货状态：",status);
        detilsList.add(detilsMap);

        print.setDetailsList(detilsList);
        print.setColumnList(new float[]{30, 90, 134, 74, 40, 50,50, 50});
        print.setHeaderList(new String[]{"序号","料号","物料描述","项目","库位","需拣数量","实拣数量","单位"});
        List<String> tabContent = new ArrayList<String>();
        for (int i=0;i<listEntity.size();i++){
            tabContent.add(String.valueOf(i+1));
            tabContent.add(listEntity.get(i).getItemCode());
            tabContent.add(listEntity.get(i).getItemDesc());
            tabContent.add(listEntity.get(i).getProjectName());
            tabContent.add(listEntity.get(i).getPositionCode());
            tabContent.add(String.valueOf(listEntity.get(i).getAlloNum()));
            tabContent.add(String.valueOf(listEntity.get(i).getPickNum()));
            tabContent.add(listEntity.get(i).getItemUnitCode());
        }
        List<List<String>> list = new ArrayList<>();
        list.add(tabContent);
        print.setTableList(list);
        print.setSignList(new String[]{"仓库：","拣货人：","核准：","审核：","申请："});
        print.setRemark("一式二联：白（仓库）;红（领用单位）;" + DateUtils.getCurrentDate());
        createPDF(print);
        System.out.print(DateUtils.getCurrentDate());
    }

    /**
     * 装箱单模板
     */
    public  void createBox(List<WmsTaskDetailEntity> taskList) throws Exception{
        PrintContentsEntity print = new PrintContentsEntity();
        print.setqRCodeString("Tra2019090023");
        print.setPath("D://print.pdf");
        print.setCompanyName("江苏科瑞恩自动化科技有限公司");
        print.setName("装箱单");
        List<Map<String,String>> detilsList = new ArrayList<Map<String,String>>();
        Map<String,String> detilsMap = new LinkedHashMap<>();
        detilsMap.put("装箱单号：",taskList.get(0).getPackNo());
        detilsMap.put("单据日期：",DateUtils.format(new Date()));
        detilsList.add(detilsMap);

        detilsMap = new LinkedHashMap<>();
        detilsMap.put("客户名称：",taskList.get(0).getCustName());
        detilsMap.put("打印次数：","1");
        detilsMap.put("复核人",taskList.get(0).getUserId());
        detilsList.add(detilsMap);

        print.setDetailsList(detilsList);
        print.setColumnList(new float[]{30, 80, 114, 64, 30, 95,95});
        print.setHeaderList(new String[]{"序号","料号","物料描述","项目","数量","WMS单号","ERP单号"});
        List<String> tabContent = new ArrayList<String>();
        for (int i=0;i<taskList.size();i++){
            tabContent.add(String.valueOf(i+1));
            tabContent.add(taskList.get(i).getItemCode());
            tabContent.add(taskList.get(i).getItemDesc());
            tabContent.add(taskList.get(i).getProjectName());
            tabContent.add(String.valueOf(taskList.get(i).getItemNum()));
            tabContent.add(taskList.get(i).getWmsDocNo());
            tabContent.add(taskList.get(i).getErpDocNo());
        }
        List<List<String>> list = new ArrayList<>();
        list.add(tabContent);
        print.setTableList(list);
        print.setSignList(new String[]{""});
        print.setRemark("" );
        createPDF(print);
        System.out.print(DateUtils.getCurrentDate());
    }

    /**
     * 栈板模板
     */
    public  void createPallet(List<WmsTaskDetailEntity> listEntity) throws Exception{
        PrintContentsEntity print = new PrintContentsEntity();
        print.setqRCodeString("Tra2019090023");
        print.setPath("D://print.pdf");
        print.setCompanyName("江苏科瑞恩自动化科技有限公司");
        print.setName("栈板装箱单");
        List<Map<String,String>> detilsList = new ArrayList<Map<String,String>>();
        Map<String,String> detilsMap = new LinkedHashMap<>();
        detilsMap.put("栈板装箱单号：",listEntity.get(0).getPalletNumber());
        detilsMap.put("单据日期：",DateUtils.format(new Date()));
        detilsMap.put("复核人："," ");
        detilsList.add(detilsMap);

        detilsMap = new LinkedHashMap<>();
        detilsMap.put("客户名称：",listEntity.get(0).getCustName());
        detilsMap.put("打印次数：","1");
        detilsList.add(detilsMap);

        print.setDetailsList(detilsList);
        print.setColumnList(new float[]{30, 99, 94, 80, 55, 90,50,30});
        print.setHeaderList(new String[]{"序号","装箱单号","WMS单号","ERP单号","料号","物料描述","项目","数量"});
        List<String> tabContent = new ArrayList<String>();
        for (int i=0;i<listEntity.size();i++){
            tabContent.add(String.valueOf(i+1));
            tabContent.add(listEntity.get(i).getPackNo());
            tabContent.add(listEntity.get(i).getWmsDocNo());
            tabContent.add(listEntity.get(i).getErpDocNo());
            tabContent.add(listEntity.get(i).getItemCode());
            tabContent.add(listEntity.get(i).getItemDesc());
            tabContent.add(listEntity.get(i).getProjectName());
            tabContent.add(String.valueOf(listEntity.get(i).getItemNum()));
        }
        List<List<String>> list = new ArrayList<>();
        list.add(tabContent);
        print.setTableList(list);
        print.setSignList(new String[]{""});
        print.setRemark("" );
        createPDF(print);
        System.out.print(DateUtils.getCurrentDate());
    }

    /**
     * 装车模板
     */
    public  void createLoad(List<WmsTaskDetailEntity> listEntity) throws Exception{
        PrintContentsEntity print = new PrintContentsEntity();
        print.setqRCodeString("Tra2019090023");
        print.setPath("D://print.pdf");
        print.setCompanyName("江苏科瑞恩自动化科技有限公司");
        print.setName("装车单");
        List<Map<String,String>> detilsList = new ArrayList<Map<String,String>>();
        Map<String,String> detilsMap = new LinkedHashMap<>();
        detilsMap.put("装车单号",listEntity.get(0).getLoadingNumber());
        detilsMap.put("单据日期：",DateUtils.format(new Date()));
        detilsMap.put("车牌号",listEntity.get(0).getLicensePlate());
        detilsList.add(detilsMap);
        System.out.println(listEntity.get(0).getLoadingNumber() +"--"+listEntity.get(0).getLicensePlate());

        detilsMap = new LinkedHashMap<>();
        detilsMap.put("客户地址：",listEntity.get(0).getAddressName());
        detilsMap.put("复核人：","     ");
        detilsMap.put("提货人：",listEntity.get(0).getUserId());
        detilsList.add(detilsMap);
        System.out.println(listEntity.get(0).getUserId());


        detilsMap = new LinkedHashMap<>();
        detilsMap.put("客户名称：",listEntity.get(0).getCustName());
        detilsMap.put("打印次数：","1");
        detilsMap.put("联系方式：",listEntity.get(0).getPhone());
        detilsList.add(detilsMap);
        System.out.println(listEntity.get(0).getCustName()+"--"+listEntity.get(0).getPhone());

        print.setDetailsList(detilsList);
        print.setColumnList(new float[]{30,60, 79, 74, 80, 55, 70,50,30});
        print.setHeaderList(new String[]{"序号","栈板装箱单号","装箱单号","WMS单号","ERP单号","料号","物料描述","项目","数量"});
        List<String> tabContent = new ArrayList<String>();
        for (int i=0;i<listEntity.size();i++){
            tabContent.add(String.valueOf(i+1));
            tabContent.add(listEntity.get(i).getPalletNumber());
            tabContent.add(listEntity.get(i).getPackNo());
            tabContent.add(listEntity.get(i).getWmsDocNo());
            tabContent.add(listEntity.get(i).getErpDocNo());
            tabContent.add(listEntity.get(i).getItemCode());
            tabContent.add(listEntity.get(i).getItemDesc());
            tabContent.add(listEntity.get(i).getProjectName());
            tabContent.add(String.valueOf(listEntity.get(i).getItemNum()));
        }
        List<List<String>> list = new ArrayList<>();
        list.add(tabContent);
        print.setTableList(list);
        print.setSignList(new String[]{""});
        print.setRemark("" );
        createPDF(print);
        System.out.print(DateUtils.getCurrentDate());
    }

    public static void  main(String[] args)throws Exception {
//        createReceiv();
//        createQulityCheck();
//        createIn();
//        createOut();
//        createPick();
//        createBox();
//        createPallet();
//        createLoad();

//        PrintContentsEntity print = new PrintContentsEntity();
//        print.setqRCodeString("Tra2019090023");
//        print.setPath("D://print.pdf");
//        print.setCompanyName("江苏科瑞恩自动化科技有限公司");
//        print.setName("成品预售单(调出)");
//        List<Map<String,String>> detilsList = new ArrayList<Map<String,String>>();
//        Map<String,String> detilsMap = new LinkedHashMap<>();
//        detilsMap.put("预售客户：","达功(上海)电脑有限公司");
//        detilsMap.put("单据类型：","仓库转储");
//        detilsMap.put("调拨单号：","Tra2019090023");
//        detilsList.add(detilsMap);
//        detilsMap = new LinkedHashMap<>();
//
//        detilsMap.put("调出仓库：","加工件仓库");
//        detilsMap.put("调入仓库：","客户成品仓");
//        detilsMap.put("单据日期：","2019.09.12");
//        detilsList.add(detilsMap);
//
//        detilsMap = new LinkedHashMap<>();
//        detilsMap.put("单据状态：","核准中");
//        detilsMap.put("打印次数：","1");
//        detilsMap.put("页   次：","    1/1 ");
//        detilsList.add(detilsMap);
//
//        print.setDetailsList(detilsList);
//        print.setColumnList(new float[]{30, 90, 114, 50, 57, 50, 57, 80});
//       print.setHeaderList(new String[]{"行号","料号","成品名称","转储数量","预调出量","计量单位","项目","备注",});
//       List<String> tabContent = new ArrayList<String>();
//       tabContent.add("1");
//        tabContent.add("M13233958103");
//        tabContent.add("1241-202-0001X03亚克力");
//        tabContent.add("1.00");
//        tabContent.add("1.000000");
//        tabContent.add("ps");
//        tabContent.add("1421-04022");
//        tabContent.add("");
//        List<List<String>> list = new ArrayList<>();
//        list.add(tabContent);
//        list.add(tabContent);
//        print.setTableList(list);
//        print.setSignList(new String[]{"仓库：","OQC：","核准：","审核：","申请："});
//        print.setRemark("启明星团队测试使用单  " + DateUtils.getCurrentDate());
//        createPDF(print);
//        System.out.print(DateUtils.getCurrentDate());
    }
    /**
     * 创建PDF文档
     * @return
     * @throws Exception
     *
     */
    public static String createPDF() throws Exception {

        //输出路径
        String outPath = "D://code.pdf";//DataUtil.createTempPath(".pdf");

        /* 设置纸张 */
        Rectangle rect = new Rectangle(PageSize.A4);

        //创建文档实例
        Document doc=new Document(rect);

        //添加中文字体
        BaseFont bfChinese= BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);

        //设置字体样式
        Font textFont = new Font(bfChinese,11,Font.NORMAL); //正常
        Font boldFont = new Font(bfChinese,11,Font.BOLD); //加粗
        Font firsetTitleFont = new Font(bfChinese,22,Font.BOLD); //一级标题
        Font secondTitleFont = new Font(bfChinese,15,Font.BOLD); //二级标题
        Font underlineFont = new Font(bfChinese,11,Font.UNDERLINE); //下划线斜体

        //手指图片
        Image hand = Image.getInstance("F:\\PDF\\hand.png");
        //创建输出流
        PdfWriter.getInstance(doc, new FileOutputStream(new File(outPath)));
        doc.open();
        doc.newPage();

        //段落
        Paragraph p1 = new Paragraph();
        //短语
        Phrase ph1 = new Phrase();
        p1 = new Paragraph("江苏科瑞恩自动化科技有限公司", firsetTitleFont);
        p1.setLeading(50);
        p1.setAlignment(Element.ALIGN_CENTER);
        doc.add(p1);


        p1 = new Paragraph("成品预售单(调出)", secondTitleFont);
        p1.setLeading(20);
        p1.setAlignment(Element.ALIGN_CENTER);
        doc.add(p1);

        p1 = new Paragraph();
        p1.setLeading(20);
        p1.setAlignment(Element.ALIGN_LEFT);
        ph1 = new Phrase();
        Chunk c3 = new Chunk("预售客户：", textFont) ;
        Chunk c33 = new Chunk("达功(上海)电脑有限公司", textFont) ;
        Chunk c4 = new Chunk(leftPad("单据类型：", 10), textFont) ;
        Chunk c44 = new Chunk("仓库转储", textFont) ;
        Chunk c5 = new Chunk(leftPad("调拨单号：", 30), textFont) ;
        Chunk c55 = new Chunk("Tra2019090023", textFont) ;
        ph1.add(c3);
        ph1.add(c33);
        ph1.add(c4);
        ph1.add(c44);
        ph1.add(c5);
        ph1.add(c55);
        p1.add(ph1);
        doc.add(p1);

        p1 = new Paragraph();
        p1.setLeading(20);
        p1.setAlignment(Element.ALIGN_LEFT);
        ph1 = new Phrase();
        Chunk c6 = new Chunk("调出仓库：", textFont) ;
        Chunk c66 = new Chunk("加工件仓库", textFont) ;
        Chunk c7 = new Chunk(leftPad("调入仓库：", 38), textFont) ;
        Chunk c77 = new Chunk("客户成品仓", textFont) ;
        Chunk c8 = new Chunk(leftPad("单据日期：", 25), textFont) ;
        Chunk c88 = new Chunk("2019.09.12", textFont) ;
        ph1.add(c6);
        ph1.add(c66);
        ph1.add(c7);
        ph1.add(c77);
        ph1.add(c8);
        ph1.add(c88);
        p1.add(ph1);
        doc.add(p1);

        p1 = new Paragraph();
        p1.setLeading(20);
        p1.setAlignment(Element.ALIGN_LEFT);
        ph1 = new Phrase();
        Chunk c9 = new Chunk("单据状态：", textFont) ;
        Chunk c99 = new Chunk("核准中", textFont) ;
        Chunk c10 = new Chunk(leftPad("打印次数：", 48), textFont) ;
        Chunk c100 = new Chunk("1", textFont) ;
        Chunk c11 = new Chunk(leftPad("页   次：", 48), textFont) ;
        Chunk c111 = new Chunk("    1/1 ", textFont) ;
        ph1.add(c9);
        ph1.add(c99);
        ph1.add(c10);
        ph1.add(c100);
        ph1.add(c11);
        ph1.add(c111);
        p1.add(ph1);
        doc.add(p1);

         p1 = new Paragraph("  ");
         p1.setLeading(30);
         doc.add(p1);

        // 创建一个有4列的表格
        PdfPTable table = new PdfPTable(8);
        table.setTotalWidth(new float[]{38, 95, 114, 57, 57, 57, 57, 100}); //设置列宽
        table.setLockedWidth(true); //锁定列宽

        table = createCell(table, new String[]{"行号","料号","成品名称","转储数量","预调出量","计量单位","项目","备注",}, 1, 8);

        String[] contentList = new String[]{"1","M13233958103","1241-202-0001X03亚克力","1.00","1.000000","ps","1421-040"," "};
        PdfPCell cell;
        for (String item:contentList) {
            cell = new PdfPCell(new Phrase(item, boldFont));
            cell.setBorderWidthLeft(1);
            cell.setBorderWidthTop(0);
            cell.setMinimumHeight(30); //设置单元格高度
            cell.setUseAscender(true); //设置可以居中
            cell.setHorizontalAlignment(PdfPTable.ALIGN_CENTER); //设置水平居中
            cell.setVerticalAlignment(PdfPTable.ALIGN_MIDDLE); //设置垂直居中
            table.addCell(cell);
        }
        doc.add(table);

        String[] endList= new String[]{"仓库：","OQC：","核准：","审核：","申请："};
        p1 = new Paragraph();
        p1.setLeading(20);
        p1.setAlignment(Element.ALIGN_LEFT);
        ph1 = new Phrase();
        Chunk end;
        Chunk end1;
        for (String item : endList) {
            end = new Chunk(item,textFont);
            end1 = new Chunk(leftPad("：", 25));
            ph1.add(end);
            ph1.add(end1);
        }
        p1.add(ph1);
        doc.add(p1);
        doc.close();
        return outPath;
    }

    /*
      method
     */
    public static void createPDF(PrintContentsEntity printContents) throws Exception {

        //输出路径
        //String outPath = printContents.getPath();

        /* 设置纸张 */
        Rectangle rect = new Rectangle(new RectangleReadOnly(595.0F, 411.0F));
        //创建文档实例
        Document doc=new Document(rect);
        //添加中文字体
        BaseFont bfChinese= BaseFont.createFont("C:\\Windows\\Fonts\\simsun.ttc,1", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        //设置字体样式
        Font textFont = new Font(bfChinese,11,Font.NORMAL); //正常
        Font boldFont = new Font(bfChinese,11,Font.BOLD); //加粗
        Font firsetTitleFont = new Font(bfChinese,22,Font.BOLD); //一级标题
        Font secondTitleFont = new Font(bfChinese,15,Font.BOLD); //二级标题

        //创建输出流
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        PdfWriter writer = PdfWriter.getInstance(doc, bo);
        doc.open();
        doc.newPage();

        //段落
        Paragraph p1 = new Paragraph();
        //短语
        Phrase ph1 = new Phrase();

        p1 = new Paragraph(printContents.getCompanyName(), firsetTitleFont);
        p1.setLeading(40);
        p1.setAlignment(Element.ALIGN_CENTER);
        doc.add(p1);

        BarcodeQRCode qrcode = new BarcodeQRCode(printContents.getqRCodeString().trim(), 5, 5, null);
        Image qrcodeImage = qrcode.getImage();
        qrcodeImage.setAbsolutePosition(28,300);
        qrcodeImage.scalePercent(250);
        doc.add(qrcodeImage);

        p1 = new Paragraph(printContents.getName(), secondTitleFont);
        p1.setLeading(20);
        p1.setAlignment(Element.ALIGN_CENTER);
        doc.add(p1);
        List<Map<String,String>> detailsList = printContents.getDetailsList();
        for (Map<String,String> item: detailsList) {
            p1 = new Paragraph();
            p1.setAlignment(Element.ALIGN_LEFT);
            ph1 = new Phrase();
            //前面两项的宽度 共500 210
            float length = 0;
            float totle = 0;
            for (String key: item.keySet()) {
                System.out.print(totle+ "--");
                Chunk k = new Chunk(leftPad(key,(int)length), textFont) ;
                Chunk v = new Chunk(item.get(key), textFont) ;
                totle = v.getWidthPoint() + k.getWidthPoint() + totle;
                //System.out.print(totle+"t  ");
                double scale = 5.5;
                if(totle >= 250)
                   length = (float)((370 - totle)/scale);
                else
                    length = (float)((220 - totle)/scale);

                ph1.add(k);
                ph1.add(v);
            }
            System.out.println("");
            p1.add(ph1);
            doc.add(p1);
        }
        p1 = new Paragraph("  ");
        p1.setLeading(10);
        doc.add(p1);

        // 创建一个表格
        PdfPTable table = new PdfPTable(printContents.getColumnList().length);
        table.setTotalWidth(printContents.getColumnList()); //设置列宽
        table.setLockedWidth(true); //锁定列宽

        table = createCell(table,printContents.getHeaderList(), 1, printContents.getColumnList().length);

        PdfPCell cell;
        for (List<String> list: printContents.getTableList()) {
            for (String item:list) {
                cell = new PdfPCell(new Phrase(item, textFont));
                cell.setBorderWidthLeft(0.5f);
                cell.setBorderWidthTop(0);
                cell.setMinimumHeight(30); //设置单元格高度
                cell.setUseAscender(true); //设置可以居中
                cell.setHorizontalAlignment(PdfPTable.ALIGN_CENTER); //设置水平居中
                cell.setVerticalAlignment(PdfPTable.ALIGN_MIDDLE); //设置垂直居中
                table.addCell(cell);
            }
        }
        doc.add(table);
        if(printContents.getRemark() != "" && (!printContents.getRemark().isEmpty()))
        {
           p1 = new Paragraph(printContents.getRemark(),textFont);
           p1.setLeading(20);
           p1.setAlignment(Element.ALIGN_LEFT);
           doc.add(p1);
        }
        String[] endList= printContents.getSignList();
        p1 = new Paragraph();
        p1.setLeading(20);
        p1.setAlignment(Element.ALIGN_LEFT);
        ph1 = new Phrase();
        Chunk end;
        Chunk end1;
        for (String item : endList) {
            end = new Chunk(item,textFont);
            end1 = new Chunk(leftPad("：", 25));
            ph1.add(end);
            ph1.add(end1);
        }
        p1.add(ph1);
        doc.add(p1);
        doc.close();
        FileOutputStream fs = new FileOutputStream(new File(printContents.getPath()));
        bo.writeTo(fs);
        bo.flush();
        InputStream ios=new FileInputStream(new File(printContents.getPath()));
        PrinterUtils.PDFprint(ios,"LQ-630K","","单据");
       // return outPath;

    }
    /**
     * 创建单元格
     * @param table
     * @param row
     * @param cols
     * @return
     * @throws IOException
     * @throws DocumentException
     */
    private static PdfPTable createCell(PdfPTable table, String[] title, int row, int cols) throws DocumentException, IOException{
        //添加中文字体
        BaseFont bfChinese= BaseFont.createFont("C:\\Windows\\Fonts\\simsun.ttc,1", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        Font font = new Font(bfChinese,11,Font.BOLD);

        for(int i = 0; i < row; i++){

            for(int j = 0; j < cols; j++){

                PdfPCell cell = new PdfPCell();

                if(i==0 && title!=null){//设置表头
                    cell = new PdfPCell(new Phrase(title[j], font)); //这样表头才能居中
                    if(table.getRows().size() == 0){
                        cell.setBorderWidthTop(1);
                    }
                }

                if(row==1 && cols==1){ //只有一行一列
                    cell.setBorderWidthTop(1);
                }

                if(j==0){//设置左边的边框宽度
                    cell.setBorderWidthLeft(1);
                }

                if(j==(cols-1)){//设置右边的边框宽度
                    cell.setBorderWidthRight(1);
                }

                if(i==(row-1)){//设置底部的边框宽度
                    cell.setBorderWidthBottom(1);
                }

                cell.setMinimumHeight(40); //设置单元格高度
                cell.setUseAscender(true); //设置可以居中
                cell.setHorizontalAlignment(PdfPTable.ALIGN_CENTER); //设置水平居中
                cell.setVerticalAlignment(PdfPTable.ALIGN_MIDDLE); //设置垂直居中

                table.addCell(cell);
            }
        }

        return table;
    }

    /**
     * 加水印（字符串）
     * @param inputFile 需要加水印的PDF路径
     *
     * @param waterMarkName 水印字符
     */
    public static void stringWaterMark(String inputFile, String waterMarkName) {
        try {
            String[] spe = DateUtils.separatePath(inputFile);
            String outputFile = spe[0] + "_WM." + spe[1];

            PdfReader reader = new PdfReader(inputFile);
            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(outputFile));

            //添加中文字体
            BaseFont bfChinese=BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            int total = reader.getNumberOfPages() + 1;
            PdfContentByte under;
            int j = waterMarkName.length();
            char c = 0;
            int rise = 0;
            //给每一页加水印
            for (int i = 1; i < total; i++) {
                rise = 400;
                under = stamper.getUnderContent(i);
                under.beginText();
                under.setFontAndSize(bfChinese, 30);
                under.setTextMatrix(200, 120);
                for (int k = 0; k < j; k++) {
                    under.setTextRise(rise);
                    c = waterMarkName.charAt(k);
                    under.showText(c + "");
                }
                // 添加水印文字
                under.endText();
            }
            stamper.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 加水印（图片）
     * @param inputFile 需要加水印的PDF路径
     *
     * @param imageFile 水印图片路径
     */
    public static void imageWaterMark(String inputFile, String imageFile) {
        try {
            String[] spe = DateUtils.separatePath(inputFile);
            String outputFile = spe[0] + "_WM." + spe[1];
            PdfReader reader = new PdfReader(inputFile);
            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(outputFile));
            int total = reader.getNumberOfPages() + 1;
            Image image = Image.getInstance(imageFile);
            image.setAbsolutePosition(-100, 0);//坐标
            image.scaleAbsolute(800,1000);//自定义大小
            //image.setRotation(-20);//旋转 弧度
            //image.setRotationDegrees(-45);//旋转 角度
            //image.scalePercent(50);//依照比例缩放
            PdfGState gs = new PdfGState();
            gs.setFillOpacity(0.2f);// 设置透明度为0.2
            PdfContentByte under;
            //给每一页加水印
            for (int i = 1; i < total; i++) {
                under = stamper.getUnderContent(i);
                under.beginText();
                // 添加水印图片
                under.addImage(image);
                under.setGState(gs);
            }
            stamper.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 设置左边距
     * @param str
     * @param i
     * @return
     */
    public static String leftPad(String str, int i) {
        int addSpaceNo = i-str.length();
        String space = "";
        for (int k=0; k<addSpaceNo; k++){
            space= " "+space;
        };
        String result =space + str ;
        return result;
    }

    /**
     * 设置模拟数据
     * @param list
     * @param num
     */
    public static void add(List<String> list,int num){
        for(int i=0;i<num;i++){
            list.add("test"+i);
        }
    }

    /**
     * 设置间距
     * @param tmp
     * @return
     */
    public static String printBlank(int tmp){
        String space="";
        for(int m=0;m<tmp;m++){
            space=space+" ";
        }
        return space;
    }
    /**
     * 转换全部的pdf
     * @param fileAddress 文件地址
     * @param filename PDF文件名
     * @param type 图片类型
     */
    public static void pdf2png(String fileAddress,String filename,String type) {
        // 将pdf装图片 并且自定义图片得格式大小
        File file = new File(fileAddress+"\\"+filename+".pdf");
        try {
            PDDocument doc = PDDocument.load(file);
            PDFRenderer renderer = new PDFRenderer(doc);
            int pageCount = doc.getNumberOfPages();
            for (int i = 0; i < pageCount; i++) {
                BufferedImage image = renderer.renderImageWithDPI(i, 144); // Windows native DPI
                // BufferedImage srcImage = resize(image, 240, 240);//产生缩略图
                ImageIO.write(image, type, new File(fileAddress+"\\"+filename+"_"+(i+1)+"."+type));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
