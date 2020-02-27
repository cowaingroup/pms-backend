package com.cowain.pms.modules.sys.entity;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 角色
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年9月18日 上午9:27:38
 */
@TableName("t_pms_role")
public class SysRoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 角色ID
	 */
	@TableId
	private Long roleId;

	/**
	 * 角色名称
	 */
	@NotBlank(message="角色名称不能为空")
	private String roleName;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 创建者ID
	 */
	private Long createUserId;

	@TableField(exist=false)
	private List<Long> menuIdList;

	/**
	 * 创建时间
	 */
	private Date createTime;


	/**
	 * 角色类型
	 */
	private Integer roleType;

	/**
	 * 所属组织
	 */
	private Integer subordinate;


	/**
	 * 角色代码
	 */
	private String roleCode;

	/**
	 * 设置：
	 * @param roleId
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * 获取：
	 * @return Long
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * 设置：角色名称
	 * @param roleName 角色名称
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * 获取：角色名称
	 * @return String
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * 设置：状态
	 * @param status 状态
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 获取：备注
	 * @return String
	 */
	public String getStatus() {
		return status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public List<Long> getMenuIdList() {
		return menuIdList;
	}

	public void setMenuIdList(List<Long> menuIdList) {
		this.menuIdList = menuIdList;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}

	public Integer getSubordinate() {
		return subordinate;
	}

	public void setSubordinate(Integer subordinate) {
		this.subordinate = subordinate;
	}



	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	@Override
	public String toString() {
		return "SysRoleEntity{" +
				"roleId=" + roleId +
				", roleName='" + roleName + '\'' +
				", status='" + status + '\'' +
				", createUserId=" + createUserId +
				", menuIdList=" + menuIdList +
				", createTime=" + createTime +
				", roleType=" + roleType +
				", subordinate=" + subordinate +
 				", roleCode='" + roleCode + '\'' +
				'}';
	}
}
