package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.Date;

/**
 * 移库单
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-11 13:20:04
 */
@TableName("wms_move_form")
public class WmsMoveFormEntity implements Serializable {
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
	 * wms单号
	 */
	private String wmsMoveNo;
	/**
	 * erp单号
	 */
	private String erpMoveNo;
	/**
	 * 单据状态
	 */
	private Integer docStatus;
	/**
	 * 回传状态
	 */
	private Integer returnStatus;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 创建人
	 */
	private String createUser;

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
	 * 设置：wms单号
	 */
	public void setWmsMoveNo(String wmsMoveNo) {
		this.wmsMoveNo = wmsMoveNo;
	}
	/**
	 * 获取：wms单号
	 */
	public String getWmsMoveNo() {
		return wmsMoveNo;
	}
	/**
	 * 设置：erp单号
	 */
	public void setErpMoveNo(String erpMoveNo) {
		this.erpMoveNo = erpMoveNo;
	}
	/**
	 * 获取：erp单号
	 */
	public String getErpMoveNo() {
		return erpMoveNo;
	}
	/**
	 * 设置：单据状态
	 */
	public void setDocStatus(Integer docStatus) {
		this.docStatus = docStatus;
	}
	/**
	 * 获取：单据状态
	 */
	public Integer getDocStatus() {
		return docStatus;
	}
	/**
	 * 设置：回传状态
	 */
	public void setReturnStatus(Integer returnStatus) {
		this.returnStatus = returnStatus;
	}
	/**
	 * 获取：回传状态
	 */
	public Integer getReturnStatus() {
		return returnStatus;
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
	 * 设置：创建人
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：创建人
	 */
	public String getCreateUser() {
		return createUser;
	}
}
