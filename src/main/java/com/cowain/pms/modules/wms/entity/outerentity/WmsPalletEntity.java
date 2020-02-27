package com.cowain.pms.modules.wms.entity.outerentity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-11-11 11:03:10
 */
@TableName("wms_pallet")
public class WmsPalletEntity implements Serializable {
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
	 * 栈板单号
	 */
	private String palletNumber;
	/**
	 * 打印状态：1未打印 2打印
	 */
	private Integer status;
	/**
	 * 栈板装箱人员
	 */
	private String userId;
	/**
	 * 装车单号
	 */
	private String loadingNumber;
	/**
	 * 栈板装箱时间
	 */
	private Date palletTime;


	/*private Integer taskId;
	private String wmsDocNo;
	private String erpDocNo;
	private String itemCode;
	private String itemName;
	private String projectId;
	private String projectName;
	private String positionCode;
	private String itemSpec;
	private String itemDesc;
	private String itemUnitCode;
	private Integer itemNum;
	private Integer itemPickNum;
	private Integer itemReviewNum;
	private Integer itemStatus;
	private Date pickTime;
	private Date reviewTime;
	private Integer storeId;*/

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
	 * 设置：栈板单号
	 */
	public void setPalletNumber(String palletNumber) {
		this.palletNumber = palletNumber;
	}
	/**
	 * 获取：栈板单号
	 */
	public String getPalletNumber() {
		return palletNumber;
	}
	/**
	 * 设置：打印状态：1未打印 2打印
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：打印状态：1未打印 2打印
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：栈板装箱人员
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：栈板装箱人员
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 获取：装车单号
	 */
	public String getLoadingNumber() {
		return loadingNumber;
	}
	/**
	 * 设置：装车单号
	 */
	public void setLoadingNumber(String loadingNumber) {
		this.loadingNumber = loadingNumber;
	}


	/**
	 * 设置：栈板装箱时间
	 */
	public void setPalletTime(Date palletTime) {
		this.palletTime = palletTime;
	}
	/**
	 * 获取：栈板装箱时间
	 */
	public Date getPalletTime() {
		return palletTime;
	}

	/*public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getWmsDocNo() {
		return wmsDocNo;
	}

	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
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

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
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

	public Integer getItemPickNum() {
		return itemPickNum;
	}

	public void setItemPickNum(Integer itemPickNum) {
		this.itemPickNum = itemPickNum;
	}

	public Integer getItemReviewNum() {
		return itemReviewNum;
	}

	public void setItemReviewNum(Integer itemReviewNum) {
		this.itemReviewNum = itemReviewNum;
	}

	public Integer getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
	}

	public Date getPickTime() {
		return pickTime;
	}

	public void setPickTime(Date pickTime) {
		this.pickTime = pickTime;
	}

	public Date getReviewTime() {
		return reviewTime;
	}

	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}*/

}
