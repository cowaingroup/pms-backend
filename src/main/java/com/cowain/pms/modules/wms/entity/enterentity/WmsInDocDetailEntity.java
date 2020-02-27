package com.cowain.pms.modules.wms.entity.enterentity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.cowain.pms.modules.sys.entity.ExcelColumn;
import io.swagger.models.auth.In;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 入库表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-29 16:37:21
 */
@TableName("wms_in_doc_detail")
public class WmsInDocDetailEntity implements Serializable {
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
	 * 入库主表id
	 */
	private Integer inDocId;
	/**
	 * 全局唯一id
	 */
	private String globalId;
	/**
	 * 供应商id
	 */
	private String supplyId;
	/**
	 * 供应商名称
	 */
	private String supplyName;
	/**
	 * 采购单号
	 */
	private String poCode;

	/**
	 * 料号id
	 */
	private String itemId;
	@ExcelColumn(columnName = "SN码",require = true)
	private String itemSn;
	/**
	 * 料号编码
	 */
	@ExcelColumn(columnName = "料号",require = true)
	private String itemCode;
	/**
	 * 料号描述
	 */
	@ExcelColumn(columnName = "描述",require = false)
	private String itemDesc;
	/**
	 * 料号数量
	 */
	@ExcelColumn(columnName = "数量",require = true)
	private Integer itemNum;
	/**
	 * 料号单位
	 */
	@ExcelColumn(columnName = "单位",require = true)
	private String itemUnit;
	/**
	 * 发出类型
	 */
	private Integer deliverType;
	/**
	 * 项目id
	 */
	@ExcelColumn(columnName = "项目ID",require = true)

	private String projectId;
	/**
	 * 项目名称
	 */
	@ExcelColumn(columnName = "项目名称",require = false)
	private String projectName;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 料号规格
	 */
	private String itemSpec;
	/**
	 * 库位
	 */
	private String positionCode;

	private String positionName;

	private String areaName;

	private Integer lineNo;

	@ExcelColumn(columnName = "库区编码",require = false)
	private String areaCode;
	/**
	 * 物料名称
	 */
	@ExcelColumn(columnName = "名称",require = true)
	private String itemName;
	/**
	 * 预期数量
	 */
	private Integer preNum;

	/**
	 * 已入数量
	 */
	@TableField(exist = false)
	private Integer actualNum;

	@TableField(exist = false)
	private Integer leftNum;

	@TableField(exist = false)
	private Integer waitNum;

	@TableField(exist = false)
	private List<WmsDocActEntity> list;


	@TableField(exist = false)
	private String erpDocNo;

	@TableField(exist = false)
	private String wmsDocNo;

	@TableField(exist = false)
	private String taskNo;

	@TableField(exist = false)
	private Integer wmsStatus;

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public Integer getLineNo() {
		return lineNo;
	}

	public void setLineNo(Integer lineNo) {
		this.lineNo = lineNo;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getTaskNo() {
		return taskNo;
	}

	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public String getItemSn() {
		return itemSn;
	}

	public void setItemSn(String itemSn) {
		this.itemSn = itemSn;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public Integer getWaitNum() {
		return waitNum;
	}

	public String getWmsDocNo() {
		return wmsDocNo;
	}

	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}

	public void setWaitNum(Integer waitNum) {
		this.waitNum = waitNum;
	}

	public String getErpDocNo() {
		return erpDocNo;
	}

	public void setErpDocNo(String erpDocNo) {
		this.erpDocNo = erpDocNo;
	}

	public Integer getWmsStatus() {
		return wmsStatus;
	}

	public void setWmsStatus(Integer wmsStatus) {
		this.wmsStatus = wmsStatus;
	}

	public Integer getLeftNum() {
		return leftNum;
	}

	public void setLeftNum(Integer leftNum) {
		this.leftNum = leftNum;
	}

	public List<WmsDocActEntity> getList() {
		return list;
	}

	public void setList(List<WmsDocActEntity> list) {
		this.list = list;
	}

	public Integer getActualNum() {
		return actualNum;
	}

	public void setActualNum(Integer actualNum) {
		this.actualNum = actualNum;
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
	 * 设置：入库主表id
	 */
	public void setInDocId(Integer inDocId) {
		this.inDocId = inDocId;
	}
	/**
	 * 获取：入库主表id
	 */
	public Integer getInDocId() {
		return inDocId;
	}
	/**
	 * 设置：全局唯一id
	 */
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}
	/**
	 * 获取：全局唯一id
	 */
	public String getGlobalId() {
		return globalId;
	}
	/**
	 * 设置：供应商id
	 */
	public void setSupplyId(String supplyId) {
		this.supplyId = supplyId;
	}
	/**
	 * 获取：供应商id
	 */
	public String getSupplyId() {
		return supplyId;
	}
	/**
	 * 设置：供应商名称
	 */
	public void setSupplyName(String supplyName) {
		this.supplyName = supplyName;
	}
	/**
	 * 获取：供应商名称
	 */
	public String getSupplyName() {
		return supplyName;
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
	 * 设置：料号id
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	/**
	 * 获取：料号id
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
	 * 设置：料号数量
	 */
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	/**
	 * 获取：料号数量
	 */
	public Integer getItemNum() {
		return itemNum;
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
	 * 设置：发出类型
	 */
	public void setDeliverType(Integer deliverType) {
		this.deliverType = deliverType;
	}
	/**
	 * 获取：发出类型
	 */
	public Integer getDeliverType() {
		return deliverType;
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
	 * 设置：物料名称
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：物料名称
	 */
	public String getItemName() {
		return itemName;
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


	public WmsInDocDetailEntity() {
	}

	@Override
	public String toString() {
		return "WmsInDocDetailEntity{" +
				"t='" + t + '\'' +
				", id=" + id +
				", itemSn='" + itemSn + '\'' +
				", positionCode='" + positionCode + '\'' +
				'}';
	}
}
