package com.cowain.pms.modules.pms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 角色
 *
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2020-01-11 10:41:54
 */
@TableName("t_pms_role")
public class PmsRoleEntity implements Serializable {
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
	private Long roleId;
	/**
	 * 角色名称 CEO= 董事长
	 */
	private String roleCode;
	/**
	 * 状态：1是启用，2 是禁用
	 */
	private Integer status;
	/**
	 * 创建者ID
	 */
	private Long createUserId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 角色类型：1级 2级 3级
	 */
	private Long roleType;
	/**
	 * 所属组织：1 科瑞恩集团 2 南通科瑞恩 3 昆山科瑞恩
	 */
	private Long subordinate;
	/**
	 * 角色代码：CEO = 董事长
	 */
	@NotBlank(message = "角色名称不能为空")
	private String roleName;

	private List<Long> menuIdList;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public List<Long> getMenuIdList() {
		return menuIdList;
	}

	public void setMenuIdList(List<Long> menuIdList) {
		this.menuIdList = menuIdList;
	}

	/**
	 * 设置：
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	/**
	 * 获取：
	 */
	public Long getRoleId() {
		return roleId;
	}
	/**
	 * 设置：角色名称 CEO= 董事长
	 */
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	/**
	 * 获取：角色名称 CEO= 董事长
	 */
	public String getRoleCode() {
		return roleCode;
	}
	/**
	 * 设置：状态：1是启用，2 是禁用
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态：1是启用，2 是禁用
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：创建者ID
	 */
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	/**
	 * 获取：创建者ID
	 */
	public Long getCreateUserId() {
		return createUserId;
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
	 * 设置：角色类型：1级 2级 3级
	 */
	public void setRoleType(Long roleType) {
		this.roleType = roleType;
	}
	/**
	 * 获取：角色类型：1级 2级 3级
	 */
	public Long getRoleType() {
		return roleType;
	}
	/**
	 * 设置：所属组织：1 科瑞恩集团 2 南通科瑞恩 3 昆山科瑞恩
	 */
	public void setSubordinate(Long subordinate) {
		this.subordinate = subordinate;
	}
	/**
	 * 获取：所属组织：1 科瑞恩集团 2 南通科瑞恩 3 昆山科瑞恩
	 */
	public Long getSubordinate() {
		return subordinate;
	}
	/**
	 * 设置：角色代码：CEO = 董事长
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	/**
	 * 获取：角色代码：CEO = 董事长
	 */
	public String getRoleName() {
		return roleName;
	}
}
