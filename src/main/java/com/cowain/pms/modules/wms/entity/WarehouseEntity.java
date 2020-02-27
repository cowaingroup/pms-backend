package com.cowain.pms.modules.wms.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-11 08:08:56
 */
@TableName("t_warehouse")
public class WarehouseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer id;
	/**
	 * 仓库编号
	 */
	private String whCode;
	/**
	 * 仓库地址
	 */
	private String whAddress;
	/**
	 * 联系人
	 */
	private Integer mgrId;
	/**
	 * 电话
	 */
	private String mgrPhone;
	/**
	 * 邮箱
	 */
	private String mgrEmail;
	/**
	 * 仓库管理员姓名
	 */
	private String whName;
	/**
	 * 获取仓库的名称
	 */
	public String getHouseName() {
		return houseName;
	}
	/**
	 * 设置仓库的名称
	 */
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 仓库的名称
	 */
	private  String houseName;
	/**
	 * 设置：主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 获取：主键
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 设置：仓库编号
	 */
	public void setWhCode(String whCode) {
		this.whCode = whCode;
	}

	/**
	 * 获取：仓库编号
	 */
	public String getWhCode() {
		return whCode;
	}

	/**
	 * 设置：仓库地址
	 */
	public void setWhAddress(String whAddress) {
		this.whAddress = whAddress;
	}

	/**
	 * 获取：仓库地址
	 */
	public String getWhAddress() {
		return whAddress;
	}

	/**
	 * 设置：联系人
	 */
	public void setMgrId(Integer mgrId) {
		this.mgrId = mgrId;
	}

	/**
	 * 获取：联系人
	 */
	public Integer getMgrId() {
		return mgrId;
	}

	/**
	 * 设置：电话
	 */
	public void setMgrPhone(String mgrPhone) {
		this.mgrPhone = mgrPhone;
	}

	/**
	 * 获取：电话
	 */
	public String getMgrPhone() {
		return mgrPhone;
	}

	/**
	 * 设置：邮箱
	 */
	public void setMgrEmail(String mgrEmail) {
		this.mgrEmail = mgrEmail;
	}

	/**
	 * 获取：邮箱
	 */
	public String getMgrEmail() {
		return mgrEmail;
	}

	/**
	 * 设置：仓库管理员姓名
	 */
	public void setWhName(String whName) {
		this.whName = whName;
	}

	/**
	 * 获取：仓库管理员姓名
	 */
	public String getWhName() {
		return whName;
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


	@TableField(exist = false)
	private String t;

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}


}
