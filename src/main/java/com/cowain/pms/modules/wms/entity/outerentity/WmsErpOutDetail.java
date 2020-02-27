package com.cowain.pms.modules.wms.entity.outerentity;

import java.util.List;

public class WmsErpOutDetail implements  java.io.Serializable {

    /**
     * erp 出货单号
     */
    private String erpDocNo;
    /**
     * wms 出货单号
     */
    private String wmsDocNo;
    /**
     * 单据类型  1 标准出货 2 杂发 3 材料出库 4 机加工出库
     */
    private Integer docType;
    /**
     * 客户名称
     */
    private String custName;
    /**
     * 送货地址
     */
    private String addressName;
    /**
     * 邮政编码
     */
    private String postCode;
    /**
     * 收货人
     */
    private String receiveName;
    /**
     * 电话号码
     */
    private String phoneName;
    /**
     * 1 创建状态 2 部分出仓 3 全部出仓 4 已复核 5 已发运 6 关闭 7 已经回传
     */
    private Integer status;


    private List<WmsErpOuinfoEntity> detail;

    public String getWmsDocNo() {
        return wmsDocNo;
    }

    public void setWmsDocNo(String wmsDocNo) {
        this.wmsDocNo = wmsDocNo;
    }

    public Integer getDocType() {
        return docType;
    }

    public void setDocType(Integer docType) {
        this.docType = docType;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getErpDocNo() {
        return erpDocNo;
    }

    public void setErpDocNo(String erpDocNo) {
        this.erpDocNo = erpDocNo;
    }

    public List<WmsErpOuinfoEntity> getDetail() {
        return detail;
    }

    public void setDetail(List<WmsErpOuinfoEntity> detail) {
        this.detail = detail;
    }
}
