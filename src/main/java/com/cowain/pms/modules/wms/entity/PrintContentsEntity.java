package com.cowain.pms.modules.wms.entity;

import java.util.List;
import java.util.Map;

/*
    需要的打印信息
 */
public class PrintContentsEntity {

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    //公司名称
    private String companyName;
    //单据名称
    private String name;
    //输出路径PDF
    private String path;
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Map<String, String>> getDetailsList() {
        return detailsList;
    }

    public void setDetailsList(List<Map<String, String>> detailsList) {
        this.detailsList = detailsList;
    }

    public float[] getColumnList() {
        return columnList;
    }

    public void setColumnList(float[] columnList) {
        this.columnList = columnList;
    }

    public String[] getHeaderList() {
        return headerList;
    }

    public void setHeaderList(String[] headerList) {
        this.headerList = headerList;
    }

    public List<List<String>> getTableList() {
        return tableList;
    }

    public void setTableList(List<List<String>> tableList) {
        this.tableList = tableList;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String[] getSignList() {
        return signList;
    }

    public void setSignList(String[] signList) {
        this.signList = signList;
    }

    //细节信息
    private List<Map<String,String>> detailsList;
    //每列的宽度
    private float[] columnList;
    //表头
    private String[] headerList;
    //表格信息
    private List<List<String>> tableList;

    public String getqRCodeString() {
        return qRCodeString;
    }

    public void setqRCodeString(String qRCodeString) {
        this.qRCodeString = qRCodeString;
    }

    //备注
    private String remark;
    //签署信息
    private String[] signList;
    //2微码里面的信息 不要写中文
    private String qRCodeString;

}
