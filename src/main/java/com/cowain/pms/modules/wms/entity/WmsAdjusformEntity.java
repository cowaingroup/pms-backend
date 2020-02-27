package com.cowain.pms.modules.wms.entity;

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
 * @date 2019-08-26 14:00:39
 */
@TableName("wms_adjust_form")
public class WmsAdjusformEntity implements Serializable {
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
	 * 调整单号
	 */
	private String adjustDocNo;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 制单人员
	 */
	private String createUser;
	/**
	 * 任务状态
	 */
	private String taskStatus;
	/**
	 * 盘点单号
	 */
	private String checkNo;
	/**
	 * 回传状态
	 */
	private String returnStatus;

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
	 * 设置：调整单号
	 */
	public void setAdjustDocNo(String adjustDocNo) {
		this.adjustDocNo = adjustDocNo;
	}
	/**
	 * 获取：调整单号
	 */
	public String getAdjustDocNo() {
		return adjustDocNo;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：制单人员
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：制单人员
	 */
	public String getCreateUser() {
		return createUser;
	}
	/**
	 * 设置：任务状态
	 */
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	/**
	 * 获取：任务状态
	 */
	public String getTaskStatus() {
		return taskStatus;
	}
	/**
	 * 设置：盘点单号
	 */
	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}
	/**
	 * 获取：盘点单号
	 */
	public String getCheckNo() {
		return checkNo;
	}
	/**
	 * 设置：回传状态
	 */
	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}
	/**
	 * 获取：回传状态
	 */
	public String getReturnStatus() {
		return returnStatus;
	}
}
