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
 * @date 2019-10-09 08:44:09
 */
@TableName("wms_in_act_log")
public class WmsInAclogEntity implements Serializable {
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
	 * 1 收货 2 质检 3 入库
	 */
	private Integer actType;
	/**
	 * 
	 */
	private String wmsDocNo;
	/**
	 * 
	 */
	private String globalId;
	/**
	 * 
	 */
	private String itemCode;
	/**
	 * 
	 */
	private String itemDesc;
	/**
	 * 
	 */
	private Integer itemNum;
	/**
	 * 
	 */
	private String positionCode;
	/**
	 * 1 合格 2 不合格 3 需要重新检验
	 */
	private Integer checkResult;
	/**
	 * 1 未回传 2 已回传
	 */
	private Integer returnStatus;
	/**
	 * 
	 */
	private Date actTime;

	private Date returnTime;
	/**
	 * 
	 */
	private String userId;

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
	 * 设置：1 收货 2 质检 3 入库
	 */
	public void setActType(Integer actType) {
		this.actType = actType;
	}
	/**
	 * 获取：1 收货 2 质检 3 入库
	 */
	public Integer getActType() {
		return actType;
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
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}
	/**
	 * 获取：
	 */
	public String getGlobalId() {
		return globalId;
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
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}
	/**
	 * 获取：
	 */
	public String getPositionCode() {
		return positionCode;
	}
	/**
	 * 设置：1 合格 2 不合格 3 需要重新检验
	 */
	public void setCheckResult(Integer checkResult) {
		this.checkResult = checkResult;
	}
	/**
	 * 获取：1 合格 2 不合格 3 需要重新检验
	 */
	public Integer getCheckResult() {
		return checkResult;
	}
	/**
	 * 设置：1 未回传 2 已回传
	 */
	public void setReturnStatus(Integer returnStatus) {
		this.returnStatus = returnStatus;
	}
	/**
	 * 获取：1 未回传 2 已回传
	 */
	public Integer getReturnStatus() {
		return returnStatus;
	}
	/**
	 * 设置：
	 */
	public void setActTime(Date actTime) {
		this.actTime = actTime;
	}
	/**
	 * 获取：
	 */
	public Date getActTime() {
		return actTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public WmsInAclogEntity(Integer actType, String wmsDocNo, String globalId, String itemCode, String itemDesc, Integer itemNum, String positionCode, Integer checkResult, Integer returnStatus, Date actTime, String userId) {
		this.actType = actType;
		this.wmsDocNo = wmsDocNo;
		this.globalId = globalId;
		this.itemCode = itemCode;
		this.itemDesc = itemDesc;
		this.itemNum = itemNum;
		this.positionCode = positionCode;
		this.checkResult = checkResult;
		this.returnStatus = returnStatus;
		this.actTime = actTime;
		this.userId = userId;
	}

	public WmsInAclogEntity() {
	}

	public Date getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}
}
