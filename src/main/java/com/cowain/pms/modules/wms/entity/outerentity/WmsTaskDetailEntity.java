package com.cowain.pms.modules.wms.entity.outerentity;

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
 * @date 2019-10-23 14:40:36
 */
@TableName("wms_task_detail")
public class WmsTaskDetailEntity implements Serializable {
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

	private Integer outInfoId;

	private String globalId;
	/**
	 * 
	 */
	private Integer taskId;
	/**
	 * 
	 */

	@TableField(exist = false)
	private String taskNo;

	private String wmsDocNo;
	/**
	 * 
	 */
	private String erpDocNo;
	/**
	 * 装箱单号
	 */
	private String packNo;
	/**
	 * 
	 */
	private String itemCode;

	private String itemSn;
	/**
	 * 
	 */
	private String itemName;

	private String projectId;
	/**
	 *
	 */
	@TableField(exist = false)
	private String projectName;

	@TableField(exist = false)
	private String palletNumber;

	private String positionCode;
	/**
	 * 
	 */
	private String itemSpec;
	/**
	 * 
	 */
	private String itemDesc;
	/**
	 * 
	 */
	private String itemUnitCode;
	/**
	 * 
	 */
	private Integer itemNum;
	/**
	 * 
	 */
	private Integer itemPickNum;
	/**
	 * 
	 */
	private Integer itemReviewNum;
	/**
	 * 1分配完成 2拣货完成 3复核完成
	 */
	private Integer itemStatus;
	/**
	 * 
	 */
	private String userId;
	/**
	 * 
	 */
	private Date pickTime;

	private Date reviewTime;

	private Integer storeId;
	/**
	 * 客户名
	 */
	@TableField(exist = false)
	private String custName;
	/**
	 * 装箱创建时间
	 */
	@TableField(exist = false)
	private Date createTime;
	/**
	 * 装车单号
	 */
	@TableField(exist = false)
	private String loadingNumber;
	/**
	 * 车牌号
	 */
	@TableField(exist = false)
	private String licensePlate;

	/**
	 * 客户地址
	 */
	@TableField(exist = false)
	private String addressName;
	/**
	 * 联系电话
	 */
	@TableField(exist = false)
	private String phone;

	public String getTaskNo() {
		return taskNo;
	}

	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}

	public Integer getOutInfoId() {
		return outInfoId;
	}

	public void setOutInfoId(Integer outInfoId) {
		this.outInfoId = outInfoId;
	}

	public String getItemSn() {
		return itemSn;
	}

	public void setItemSn(String itemSn) {
		this.itemSn = itemSn;
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
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
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
	 * 设置：
	 */
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	/**
	 * 获取：
	 */
	public Integer getTaskId() {
		return taskId;
	}
	/**
	 * 设置：
	 */
	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}
	/**
	 * 获取：
	 */
	public String getWmsDocNo() {
		return wmsDocNo;
	}
	/**
	 * 设置：
	 */
	public void setErpDocNo(String erpDocNo) {
		this.erpDocNo = erpDocNo;
	}
	/**
	 * 获取：
	 */
	public String getErpDocNo() {
		return erpDocNo;
	}
	/**
	 * 设置：装箱单号
	 */
	public void setPackNo(String packNo) {
		this.packNo = packNo;
	}
	/**
	 * 获取：装箱单号
	 */
	public String getPackNo() {
		return packNo;
	}
	/**
	 * 设置：
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	/**
	 * 获取：
	 */
	public String getItemCode() {
		return itemCode;
	}
	/**
	 * 设置：
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 设置：
	 */
	public void setItemSpec(String itemSpec) {
		this.itemSpec = itemSpec;
	}
	/**
	 * 获取：
	 */
	public String getItemSpec() {
		return itemSpec;
	}
	/**
	 * 设置：
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	/**
	 * 获取：
	 */
	public String getItemDesc() {
		return itemDesc;
	}
	/**
	 * 设置：
	 */
	public void setItemUnitCode(String itemUnitCode) {
		this.itemUnitCode = itemUnitCode;
	}
	/**
	 * 获取：
	 */
	public String getItemUnitCode() {
		return itemUnitCode;
	}
	/**
	 * 设置：
	 */
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	/**
	 * 获取：
	 */
	public Integer getItemNum() {
		return itemNum;
	}
	/**
	 * 设置：
	 */
	public void setItemPickNum(Integer itemPickNum) {
		this.itemPickNum = itemPickNum;
	}
	/**
	 * 获取：
	 */
	public Integer getItemPickNum() {
		return itemPickNum;
	}
	/**
	 * 设置：
	 */
	public void setItemReviewNum(Integer itemReviewNum) {
		this.itemReviewNum = itemReviewNum;
	}
	/**
	 * 获取：
	 */
	public Integer getItemReviewNum() {
		return itemReviewNum;
	}
	/**
	 * 设置：1分配完成 2拣货完成 3复核完成
	 */
	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
	}
	/**
	 * 获取：1分配完成 2拣货完成 3复核完成
	 */
	public Integer getItemStatus() {
		return itemStatus;
	}
	/**
	 * 设置：
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：
	 */
	public void setPickTime(Date pickTime) {
		this.pickTime = pickTime;
	}
	/**
	 * 获取：
	 */
	public Date getPickTime() {
		return pickTime;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPalletNumber() {
		return palletNumber;
	}

	public void setPalletNumber(String palletNumber) {
		this.palletNumber = palletNumber;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getLoadingNumber() {
		return loadingNumber;
	}

	public void setLoadingNumber(String loadingNumber) {
		this.loadingNumber = loadingNumber;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
}
