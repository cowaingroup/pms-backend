package com.cowain.pms.modules.wms.entity.enterentity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * 料号能否接收数据日志表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-29 16:37:21
 */
@TableName("wms_item_receiv_info")
public class WmsItemReceivInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

    @TableField(exist = false)
	private String t;

    public String getT() {
        return t;
    }
	public void setT(String t){
        this.t = t;
	}
		/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 请求id
	 */
	private Integer requestId;

	private String wmsDocNo;
	/**
	 *行号
	 * */
	private Integer lineNo;

	/**
	 *
	 */
	private String itemId;
	/**
	 *sn码
	 */
	private String itemSn;

	/**
	 * 单据类型
	 */
	private int docType;
	/**
	 * 料号编码
	 */
	private String itemCode;
	/**
	 * 名称
	 */
	private String itemName;
	/**
	 * 描述
	 */
	private String itemDesc;
	/**
	 * 规格
	 */
	private String itemSpec;
	/**
	 * 单位
	 */
	private String itemUnit;
	/**
	 * 发包方式
	 */
	private String deliverType;
	/**
	 * 供应商
	 */
	private String supplyId;
	/**
	 * 
	 */
	private String supplyName;
	/**
	 * 料号可以收的数量
	 */
	private Integer itemNum;
	/**
	 * 1 可以收 2 不可以收
	 */
	private Integer itemStatus;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 采购单号
	 */
	private String poCode;

	/**
	 * 项目id
	 */
	private String projectId;
	/**
	 * 项目名称
	 */
	private String projectName;
	/**
	 * 预期数量
	 */
	private Integer preNum;
	/**
	 * 库位
	 */
	private String positionCode;
	/**
	 * 库区
	 */
	private String areaCode;

	public Integer getLineNo() {
		return lineNo;
	}

	public void setLineNo(Integer lineNo) {
		this.lineNo = lineNo;
	}

	public String getWmsDocNo() {
		return wmsDocNo;
	}

	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getItemSn() {
		return itemSn;
	}

	public void setItemSn(String itemSn) {
		this.itemSn = itemSn;
	}

	public int getDocType() {
		return docType;
	}

	public void setDocType(int docType) {
		this.docType = docType;
	}

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：请求id
	 */
	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}
	/**
	 * 获取：请求id
	 */
	public Integer getRequestId() {
		return requestId;
	}

	/**
	 * 设置：
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	/**
	 * 获取：
	 */
	public String getItemId() {
		return itemId;
	}
	/**
	 * 设置：料号编码
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * 获取：料号编码
	 */
	public String getItemCode() {
		return itemCode;
	}
	/**
	 * 设置：名称
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：名称
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 设置：描述
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	/**
	 * 获取：描述
	 */
	public String getItemDesc() {
		return itemDesc;
	}
	/**
	 * 设置：规格
	 */
	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}
	/**
	 * 获取：规格
	 */
	public String getItemSpec() {
		return itemSpec;
	}
	/**
	 * 设置：单位
	 */
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	/**
	 * 获取：单位
	 */
	public String getItemUnit() {
		return itemUnit;
	}
	/**
	 * 设置：发包方式
	 */
	public void setDeliverType(String deliverType) {
		this.deliverType = deliverType;
	}
	/**
	 * 获取：发包方式
	 */
	public String getDeliverType() {
		return deliverType;
	}
	/**
	 * 设置：供应商
	 */
	public void setSupplyId(String supplyId) {
		this.supplyId = supplyId;
	}
	/**
	 * 获取：供应商
	 */
	public String getSupplyId() {
		return supplyId;
	}
	/**
	 * 设置：
	 */
	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}
	/**
	 * 获取：
	 */
	public String getSupplyName() {
		return supplyName;
	}
	/**
	 * 设置：料号可以收的数量
	 */
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	/**
	 * 获取：料号可以收的数量
	 */
	public Integer getItemNum() {
		return itemNum;
	}
	/**
	 * 设置：1 可以收 2 不可以收
	 */
	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
	}
	/**
	 * 获取：1 可以收 2 不可以收
	 */
	public Integer getItemStatus() {
		return itemStatus;
	}
	/**
	 * 设置：插入时间
	 */
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	/**
	 * 获取：插入时间
	 */
	public Date getInsertTime() {
		return insertTime;
	}
	/**
	 * 设置：采购单号
	 */
	public void setPoCode(String poCode) {
		this.poCode = poCode;
	}
	/**
	 * 获取：采购单号
	 */
	public String getPoCode() {
		return poCode;
	}
	/**
	 * 设置：项目id
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	/**
	 * 获取：项目id
	 */
	public String getProjectId() {
		return projectId;
	}
	/**
	 * 设置：项目名称
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * 获取：项目名称
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * 设置：预期数量
	 */
	public void setPreNum(Integer preNum) {
		this.preNum = preNum;
	}
	/**
	 * 获取：预期数量
	 */
	public Integer getPreNum() {
		return preNum;
	}

}
