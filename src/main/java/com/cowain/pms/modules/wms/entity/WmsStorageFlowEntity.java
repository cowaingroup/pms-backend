package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * 库存流水
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-08-17 16:54:15
 */
@TableName("wms_storage_flow")
public class WmsStorageFlowEntity implements Serializable {
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
	private Long id;
	/**
	 * wms单号
	 */
	private String docNoWms;
	/**
	 * erp单号
	 */
	private String docNoErp;
	/**
	 * 流水类型
	 */
	private String flowType;
	/**
	 * 操作人
	 */
	private String actUser;
	/**
	 * 流水时间
	 */
	private Date flowTime;
	/**
	 * 交易类型
	 */
	private String dealType;
	/**
	 * 料号编码
	 */
	private String itemCode;

	private String itemSn;
	/**
	 * 仓库
	 */
	private String houseType;
	/**
	 * 原库位
	 */
	private String formerBox;
	/**
	 * 目标库位
	 */
	private String targetBox;
	/**
	 * 单位
	 */
	private String itemUnitCode;
	/**
	 * 原数量
	 */
	private Integer formerNum;
	/**
	 * 变更数量
	 */
	private Integer changeNum;

	private String projectName;

	private  String projectId;

	public String getItemSn() {
		return itemSn;
	}

	public void setItemSn(String itemSn) {
		this.itemSn = itemSn;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：wms单号
	 */
	public void setDocNoWms(String docNoWms) {
		this.docNoWms = docNoWms;
	}
	/**
	 * 获取：wms单号
	 */
	public String getDocNoWms() {
		return docNoWms;
	}
	/**
	 * 设置：erp单号
	 */
	public void setDocNoErp(String docNoErp) {
		this.docNoErp = docNoErp;
	}
	/**
	 * 获取：erp单号
	 */
	public String getDocNoErp() {
		return docNoErp;
	}
	/**
	 * 设置：流水类型
	 */
	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}
	/**
	 * 获取：流水类型
	 */
	public String getFlowType() {
		return flowType;
	}
	/**
	 * 设置：操作人
	 */
	public void setActUser(String actUser) {
		this.actUser = actUser;
	}
	/**
	 * 获取：操作人
	 */
	public String getActUser() {
		return actUser;
	}
	/**
	 * 设置：流水时间
	 */
	public void setFlowTime(Date flowTime) {
		this.flowTime = flowTime;
	}
	/**
	 * 获取：流水时间
	 */
	public Date getFlowTime() {
		return flowTime;
	}
	/**
	 * 设置：交易类型
	 */
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}
	/**
	 * 获取：交易类型
	 */
	public String getDealType() {
		return dealType;
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
	 * 设置：仓库
	 */
	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}
	/**
	 * 获取：仓库
	 */
	public String getHouseType() {
		return houseType;
	}
	/**
	 * 设置：原库位
	 */
	public void setFormerBox(String formerBox) {
		this.formerBox = formerBox;
	}
	/**
	 * 获取：原库位
	 */
	public String getFormerBox() {
		return formerBox;
	}
	/**
	 * 设置：目标库位
	 */
	public void setTargetBox(String targetBox) {
		this.targetBox = targetBox;
	}
	/**
	 * 获取：目标库位
	 */
	public String getTargetBox() {
		return targetBox;
	}
	/**
	 * 设置：单位
	 */
	public void setItemUnitCode(String itemUnitCode) {
		this.itemUnitCode = itemUnitCode;
	}
	/**
	 * 获取：单位
	 */
	public String getItemUnitCode() {
		return itemUnitCode;
	}
	/**
	 * 设置：原数量
	 */
	public void setFormerNum(Integer formerNum) {
		this.formerNum = formerNum;
	}
	/**
	 * 获取：原数量
	 */
	public Integer getFormerNum() {
		return formerNum;
	}
	/**
	 * 设置：变更数量
	 */
	public void setChangeNum(Integer changeNum) {
		this.changeNum = changeNum;
	}
	/**
	 * 获取：变更数量
	 */
	public Integer getChangeNum() {
		return changeNum;
	}


	public WmsStorageFlowEntity(String docNoWms, String docNoErp, String flowType, String actUser, Date flowTime, String itemCode, String formerBox, String targetBox, String itemUnitCode, Integer formerNum, Integer changeNum,String projectId,String projectName) {
		this.docNoWms = docNoWms;
		this.docNoErp = docNoErp;
		this.flowType = flowType;
		this.actUser = actUser;
		this.flowTime = flowTime;
		this.itemCode = itemCode;
		this.formerBox = formerBox;
		this.targetBox = targetBox;
		this.itemUnitCode = itemUnitCode;
		this.formerNum = formerNum;
		this.changeNum = changeNum;
		this.projectId=projectId;
		this.projectName=projectName;
	}

	public WmsStorageFlowEntity() {
	}
}
