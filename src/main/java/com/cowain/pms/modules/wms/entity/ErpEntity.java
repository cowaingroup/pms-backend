package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;
import java.util.Date;

/**
 * ERP 公共实体
 */
public class ErpEntity implements Serializable {

    private Integer id;

    private String erpDocNo;

    private String wmsDocNo;

    private String docNo;

    /**
     * 状态 1 正常 2.不正常
     */
    private Integer erpStatus;

    /**
     * 收货状态
     */
    private Integer wmsStatus;


    /**
     * 仓库管理员名称
     */
    private String whManName;


    /**
     * 料号id
     */
    private Long itemId;
    /**
     * 料号编码
     */
    private String itemCode;
    /**
     * 料号名称
     */
    private String itemName;

    /**
     * 料箱code
     */
    private String boxCode;
    /**
     * 库位id--先做冗余处理
     */
    private Long positionId;
    /**
     * 库位code
     */
    private String positionCode;
    /**
     * 仓库管理员编码
     */
    private String whManCode;
    /**
     * 仓位
     */
    private Long boxId;
    /**
     * 插入时间
     */
    private Date insertTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 数据来源
     */
    private String dataSource;
    /**
     * 父阶2id
     */
    private Long parentItemId2;
    /**
     * 父阶2编号
     */
    private String parentItemCode2;
    /**
     * 父阶2名称
     */
    private String parentItemName2;
    /**
     * 父阶3id
     */
    private Long parentItemId3;
    /**
     * 父阶3编号
     */
    private String parentItemCode3;
    /**
     * 父阶2名称
     */
    private String parentItemName3;
    /**
     * 出货类型
     */
    private String docType;
    /**
     * 仓库管理员id
     */
    private Long whManId;

    private String itemSpec;

    private String itemDesc;

    /**
     * 数量
     */
    private Integer itemNum;
    /**
     * 单位id
     */
    private Long itemUnitId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String itemUnitCode;

    public String getItemUnitCode() {
        return itemUnitCode;
    }

    public void setItemUnitCode(String itemUnitCode) {
        this.itemUnitCode = itemUnitCode;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    public Long getItemUnitId() {
        return itemUnitId;
    }

    public void setItemUnitId(Long itemUnitId) {
        this.itemUnitId = itemUnitId;
    }

    public String getItemSpec() {
        return itemSpec;
    }

    public void setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getErpDocNo() {
        return erpDocNo;
    }

    public void setErpDocNo(String erpDocNo) {
        this.erpDocNo = erpDocNo;
    }

    public String getWmsDocNo() {
        return wmsDocNo;
    }

    public void setWmsDocNo(String wmsDocNo) {
        this.wmsDocNo = wmsDocNo;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public Integer getErpStatus() {
        return erpStatus;
    }

    public void setErpStatus(Integer erpStatus) {
        this.erpStatus = erpStatus;
    }

    public Integer getWmsStatus() {
        return wmsStatus;
    }

    public void setWmsStatus(Integer wmsStatus) {
        this.wmsStatus = wmsStatus;
    }

    public String getWhManName() {
        return whManName;
    }

    public void setWhManName(String whManName) {
        this.whManName = whManName;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBoxCode() {
        return boxCode;
    }

    public void setBoxCode(String boxCode) {
        this.boxCode = boxCode;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getWhManCode() {
        return whManCode;
    }

    public void setWhManCode(String whManCode) {
        this.whManCode = whManCode;
    }

    public Long getBoxId() {
        return boxId;
    }

    public void setBoxId(Long boxId) {
        this.boxId = boxId;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public Long getParentItemId2() {
        return parentItemId2;
    }

    public void setParentItemId2(Long parentItemId2) {
        this.parentItemId2 = parentItemId2;
    }

    public String getParentItemCode2() {
        return parentItemCode2;
    }

    public void setParentItemCode2(String parentItemCode2) {
        this.parentItemCode2 = parentItemCode2;
    }

    public String getParentItemName2() {
        return parentItemName2;
    }

    public void setParentItemName2(String parentItemName2) {
        this.parentItemName2 = parentItemName2;
    }

    public Long getParentItemId3() {
        return parentItemId3;
    }

    public void setParentItemId3(Long parentItemId3) {
        this.parentItemId3 = parentItemId3;
    }

    public String getParentItemCode3() {
        return parentItemCode3;
    }

    public void setParentItemCode3(String parentItemCode3) {
        this.parentItemCode3 = parentItemCode3;
    }

    public String getParentItemName3() {
        return parentItemName3;
    }

    public void setParentItemName3(String parentItemName3) {
        this.parentItemName3 = parentItemName3;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public Long getWhManId() {
        return whManId;
    }

    public void setWhManId(Long whManId) {
        this.whManId = whManId;
    }
}
