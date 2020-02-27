package com.cowain.pms.modules.wms.entity.enterentity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-12-06 15:37:12
 */
@TableName("wms_po_detail")
public class WmsPoDetailEntity implements Serializable {
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
	 * po表单号
	 */
	private String poCode;
	/**
	 * 单据类型
	 */
	private Integer docType;
	/**
	 * 行号
	 */
	private Integer lineNo;
	/**
	 * 料号编码
	 */
	private String itemCode;
	/**
	 * 料号描述
	 */
	private String itemDesc;
	/**
	 * 料号规格
	 */
	private String itemSpec;
	/**
	 * 料号名称
	 */
	private String itemName;
	/**
	 * 料号单位
	 */
	private String itemUnit;
	/**
	 * 已收数量
	 * **/
	private Integer itemNum;
	/**
	 * 请购数量
	 */
	private Integer applyItemNum;
	/**
	 * 请购数量+超收数量
	 */
	private Integer addItemNum;
	/**
	 * 项目编码
	 */
	private String projectId;
	/**
	 * 项目名称
	 */
	private String projectName;
	/**
	 * 收获来源
	 */
	private Integer sourceReceivDocNo;
	/**
	 * sn码
	 */
	private String itemSn;
	/**
	 * 库位
	 */
	private String positionCode;
	/**
	 * 插入时间
	 */
	private Date insertTime;


	public Integer getItemNum() {
		return itemNum;
	}

	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
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
	 * 设置：po表单号
	 */
	public void setPoCode(String poCode) {
		this.poCode = poCode;
	}
	/**
	 * 获取：po表单号
	 */
	public String getPoCode() {
		return poCode;
	}
	/**
	 * 设置：单据类型
	 */
	public void setDocType(Integer docType) {
		this.docType = docType;
	}
	/**
	 * 获取：单据类型
	 */
	public Integer getDocType() {
		return docType;
	}
	/**
	 * 设置：行号
	 */
	public void setLineNo(Integer lineNo) {
		this.lineNo = lineNo;
	}
	/**
	 * 获取：行号
	 */
	public Integer getLineNo() {
		return lineNo;
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
	 * 设置：料号描述
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	/**
	 * 获取：料号描述
	 */
	public String getItemDesc() {
		return itemDesc;
	}
	/**
	 * 设置：料号规格
	 */
	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}
	/**
	 * 获取：料号规格
	 */
	public String getItemSpec() {
		return itemSpec;
	}
	/**
	 * 设置：料号名称
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：料号名称
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 设置：料号单位
	 */
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	/**
	 * 获取：料号单位
	 */
	public String getItemUnit() {
		return itemUnit;
	}
	/**
	 * 设置：请购数量
	 */
	public void setApplyItemNum(Integer applyItemNum) {
		this.applyItemNum = applyItemNum;
	}
	/**
	 * 获取：请购数量
	 */
	public Integer getApplyItemNum() {
		return applyItemNum;
	}
	/**
	 * 设置：请购数量+超收数量
	 */
	public void setAddItemNum(Integer addItemNum) {
		this.addItemNum = addItemNum;
	}
	/**
	 * 获取：请购数量+超收数量
	 */
	public Integer getAddItemNum() {
		return addItemNum;
	}
	/**
	 * 设置：项目编码
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	/**
	 * 获取：项目编码
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
	 * 设置：收获来源
	 */
	public void setSourceReceivDocNo(Integer sourceReceivDocNo) {
		this.sourceReceivDocNo = sourceReceivDocNo;
	}
	/**
	 * 获取：收获来源
	 */
	public Integer getSourceReceivDocNo() {
		return sourceReceivDocNo;
	}
	/**
	 * 设置：库位
	 */
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}
	/**
	 * 获取：库位
	 */
	public String getPositionCode() {
		return positionCode;
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

	public String getItemSn() {
		return itemSn;
	}

	public void setItemSn(String itemSn) {
		this.itemSn = itemSn;
	}
}
