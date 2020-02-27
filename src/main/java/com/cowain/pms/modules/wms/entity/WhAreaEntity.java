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
@TableName("t_wh_area")
public class WhAreaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer id;
	/**
	 * 库区名称
	 */
	private String areaName;
	/**
	 * 库区编号
	 */
	private String areaCode;
	/**
	 * 仓库id
	 */
	private Integer whId;
	/**
	 * 仓库类型
	 */
	private Integer areaType;
	/**
	 * 联系人
	 */
	private Integer mgrId;
	/**
	 * 联系人姓名
	 */
	private String mgrName;
	/**
	 * 电话
	 */
	private String mgrPhone;
	/**
	 * 邮件
	 */
	private String mgrEmail;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 获取库区库位总数
	 */
	public int getLocationCount() {
		return locationCount;
	}
	/**
	 * 设置库区库位总数
	 */
	public void setLocationCount(int locationCount) {
		this.locationCount = locationCount;
	}

	/**
	 *
	 * @return 返回该备注
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * 写该备注
	 * @param remarks
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * 显示库区的库位总个数
	 */
	private int locationCount;
	/**
	 * 库区备注
	 */
	private String remarks;
	@TableField(exist = false)
	private String showType;
	/**
	 * 获取仓库类型显示
	 */
	public String getShowType() {
		return showType;
	}
	/**
	 * 设置仓库类型显示
	 */
	public void setShowType(String showType) {
		this.showType = showType;
	}

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
	 * 设置：库区名称
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	/**
	 * 获取：库区名称
	 */
	public String getAreaName() {
		return areaName;
	}
	/**
	 * 设置：库区编号
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	/**
	 * 获取：库区编号
	 */
	public String getAreaCode() {
		return areaCode;
	}
	/**
	 * 设置：仓库id
	 */
	public void setWhId(Integer whId) {
		this.whId = whId;
	}
	/**
	 * 获取：仓库id
	 */
	public Integer getWhId() {
		return whId;
	}
	/**
	 * 设置：仓库类型
	 */
	public void setAreaType(Integer areaType) {
		this.areaType = areaType;
	}
	/**
	 * 获取：仓库类型
	 */
	public Integer getAreaType() {
		return areaType;
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
	 * 设置：联系人姓名
	 */
	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}
	/**
	 * 获取：联系人姓名
	 */
	public String getMgrName() {
		return mgrName;
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
	 * 设置：邮件
	 */
	public void setMgrEmail(String mgrEmail) {
		this.mgrEmail = mgrEmail;
	}
	/**
	 * 获取：邮件
	 */
	public String getMgrEmail() {
		return mgrEmail;
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
	/**
	 * 获取 前台显示所属的仓库名称
	 */
	public String getShowHouseName() {
		return showHouseName;
	}
	/**
	 * 设置 前台所属的仓库名称
	 */
	public void setShowHouseName(String showHouseName) {
		this.showHouseName = showHouseName;
	}
	/**
	 * 前台所属的仓库名称
	 */
	@TableField(exist = false)
	private String showHouseName;

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

}
