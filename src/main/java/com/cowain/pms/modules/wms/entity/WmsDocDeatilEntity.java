package com.cowain.pms.modules.wms.entity;

import com.cowain.pms.modules.sys.entity.ExcelColumn;
import com.cowain.pms.modules.wms.entity.enterentity.WmsDocActEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-16 08:11:27
 */
public class WmsDocDeatilEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private String t;
	private int id;
	private String wmsDocNo;//wms单号
	private String erpDocNo;//erp单号
	private String projectName;//项目
	private int erpStatus;
	private int wmsStatus;
	private int itemStatus;
	private int parentId;
	@ExcelColumn(columnName = "料号",require =true)
	private String itemCode;
	@ExcelColumn(columnName = "名称",require = true)
	private String itemName;
	@ExcelColumn(columnName = "规格",require = false)
	private String itemSpec;
	@ExcelColumn(columnName = "描述",require = false)
	private String itemDesc;
	@ExcelColumn(columnName = "单位",require = true)
	private String itemUnitCode;
	@ExcelColumn(columnName = "数量",require = true)
	private Integer itemNum;
	@ExcelColumn(columnName = "仓库",require = false)
	private String houseCode;
	@ExcelColumn(columnName = "库区",require = false)
	private String positionCode;
	@ExcelColumn(columnName = "库位",require = false)
	private String boxCode;
	private Date insertTime;//入库时间
	private String whManName;//操作人员
	private String source;//数据来源
	private int itemActualNum;//实际入库量
	private List<WmsDocActEntity> list;
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}


	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getErpDocNo() {
		return erpDocNo;
	}

	public void setErpDocNo(String erpDocNo) {
		this.erpDocNo = erpDocNo;
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

	public String getHouseCode() {
		return houseCode;
	}

	public void setHouseCode(String houseCode) {
		this.houseCode = houseCode;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getBoxCode() {
		return boxCode;
	}

	public void setBoxCode(String boxCode) {
		this.boxCode = boxCode;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public String getWhManName() {
		return whManName;
	}

	public void setWhManName(String whManName) {
		this.whManName = whManName;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getWmsDocNo() {
		return wmsDocNo;
	}

	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}

	public int getErpStatus() {
		return erpStatus;
	}

	public void setErpStatus(int erpStatus) {
		this.erpStatus = erpStatus;
	}

	public int getWmsStatus() {
		return wmsStatus;
	}

	public void setWmsStatus(int wmsStatus) {
		this.wmsStatus = wmsStatus;
	}

	public int getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(int itemStatus) {
		this.itemStatus = itemStatus;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public int getItemActualNum() {
		return itemActualNum;
	}

	public void setItemActualNum(int itemActualNum) {
		this.itemActualNum = itemActualNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<WmsDocActEntity> getList() {
		return list;
	}

	public void setList(List<WmsDocActEntity> list) {
		this.list = list;
	}
}
