package com.cowain.pms.modules.wms.entity.enterentity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * 质检表 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-29 16:37:21
 */
@TableName("wms_qulity_check_doc")
public class WmsQulityCheckDocEntity implements Serializable {
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
	 * wms收货单号
	 */
	private String wmsDocNo;
	/**
	 * 质检员
	 */
	private String userId;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 1. 初始生成 2 已经质检 3挂起
	 */
	private Integer status;
	/**
	 * 1 全部检查 2 抽检
	 */
	private Integer checkType;
	/**
	 * 质检单号
	 */
	private String checkNo;
	/**
	 * 收货单来源
	 */
	private String sourceReceivDocNo;
	/**
	 * 
	 */
	private String globalId;

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
	 * 设置：wms收货单号
	 */
	public void setWmsDocNo(String wmsDocNo) {
		this.wmsDocNo = wmsDocNo;
	}
	/**
	 * 获取：wms收货单号
	 */
	public String getWmsDocNo() {
		return wmsDocNo;
	}
	/**
	 * 设置：质检员
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：质检员
	 */
	public String getUserId() {
		return userId;
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
	 * 设置：1. 初始生成 2 已经质检 3挂起
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：1. 初始生成 2 已经质检 3挂起
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：1 全部检查 2 抽检
	 */
	public void setCheckType(Integer checkType) {
		this.checkType = checkType;
	}
	/**
	 * 获取：1 全部检查 2 抽检
	 */
	public Integer getCheckType() {
		return checkType;
	}
	/**
	 * 设置：质检单号
	 */
	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}
	/**
	 * 获取：质检单号
	 */
	public String getCheckNo() {
		return checkNo;
	}
	/**
	 * 设置：收货单来源
	 */
	public void setSourceReceivDocNo(String sourceReceivDocNo) {
		this.sourceReceivDocNo = sourceReceivDocNo;
	}
	/**
	 * 获取：收货单来源
	 */
	public String getSourceReceivDocNo() {
		return sourceReceivDocNo;
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
}
