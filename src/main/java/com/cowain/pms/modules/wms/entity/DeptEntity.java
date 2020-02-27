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
 * @date 2019-07-13 15:54:29
 */
@TableName("t_dept")
public class DeptEntity implements Serializable {
	private static final long serialVersionUID = 1L;

    @TableField(exist = false)
	private String t;

    public String getT() {
        return t;
    }
	public void setT(String t){
        this.t = t;
	}

	@TableField(exist = false)
	private String parentName;
	@TableField(exist = false)
	private String areaName;
	@TableField(exist = false)
    private String dictName;
	@TableField(exist = false)
	private String userName;

	public String getParentName() {
		return parentName;
	}

	public String getDictName() {
		return dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
		/**
	 * 主键
	 */
	@TableId
	private Integer id;
	/**
	 * 部门名称
	 */
	private String deptName;
	/**
	 * 部门编码
	 */
	private String deptCode;
	/**
	 * 部门级别
	 */
	private Integer deptLevel;
	/**
	 * 部门地址
	 */
	private String deptAddress;
	/**
	 * 部门所属区域
	 */
	private Integer deptAreaId;
	/**
	 * 父部门d
	 */
	private Integer parentId;
	/**
	 * 管理方式 t_dict 
	 */
	private Integer mgrType;
	/**
	 * 插入时间
	 */
	private Date insertTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 更新人
	 */
	private Integer updateUserId;

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
	 * 设置：部门名称
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * 获取：部门名称
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * 设置：部门编码
	 */
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	/**
	 * 获取：部门编码
	 */
	public String getDeptCode() {
		return deptCode;
	}
	/**
	 * 设置：部门级别
	 */
	public void setDeptLevel(Integer deptLevel) {
		this.deptLevel = deptLevel;
	}
	/**
	 * 获取：部门级别
	 */
	public Integer getDeptLevel() {
		return deptLevel;
	}
	/**
	 * 设置：部门地址
	 */
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}
	/**
	 * 获取：部门地址
	 */
	public String getDeptAddress() {
		return deptAddress;
	}
	/**
	 * 设置：部门所属区域
	 */
	public void setDeptAreaId(Integer deptAreaId) {
		this.deptAreaId = deptAreaId;
	}
	/**
	 * 获取：部门所属区域
	 */
	public Integer getDeptAreaId() {
		return deptAreaId;
	}
	/**
	 * 设置：父部门d
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：父部门d
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * 设置：管理方式 t_dict 
	 */
	public void setMgrType(Integer mgrType) {
		this.mgrType = mgrType;
	}
	/**
	 * 获取：管理方式 t_dict 
	 */
	public Integer getMgrType() {
		return mgrType;
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
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：更新人
	 */
	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}
	/**
	 * 获取：更新人
	 */
	public Integer getUpdateUserId() {
		return updateUserId;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
