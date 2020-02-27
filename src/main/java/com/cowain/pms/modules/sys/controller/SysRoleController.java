package com.cowain.pms.modules.sys.controller;

import com.cowain.pms.common.annotation.SysLog;
import com.cowain.pms.common.utils.Constant;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.common.utils.R;
import com.cowain.pms.common.validator.ValidatorUtils;
import com.cowain.pms.modules.pms.dto.PmsRoleDto;
import com.cowain.pms.modules.pms.entity.PmsDictEntity;
import com.cowain.pms.modules.pms.service.PmsRoleTypeOrOrgService;
import com.cowain.pms.modules.sys.entity.SysRoleEntity;
import com.cowain.pms.modules.sys.service.SysRoleMenuService;
import com.cowain.pms.modules.sys.service.SysRoleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 角色管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年11月8日 下午2:18:33
 */
@RestController
@RequestMapping("/sys/role")
public class SysRoleController extends AbstractController {
	@Autowired
	private SysRoleService sysRoleService;
	@Autowired
	private SysRoleMenuService sysRoleMenuService;
	@Autowired
	private PmsRoleTypeOrOrgService roleTypeOrOrgService;

	/**
	 * 角色列表
	 */
	@GetMapping("/list")
	@RequiresPermissions("sys:role:list")
	public R list(@RequestParam Map<String, Object> params){
		//如果不是超级管理员，则只查询自己创建的角色列表
		if(getUserId() != Constant.SUPER_ADMIN){
			params.put("createUserId", getUserId());
		}

		PageUtils page = sysRoleService.queryPage(params);

		return R.ok().put("page", page);
	}

	/**
	 * 角色列表
	 */
	@GetMapping("/select")
	@RequiresPermissions("sys:role:select")
	public R select(){
		Map<String, Object> map = new HashMap<>();

		//如果不是超级管理员，则只查询自己所拥有的角色列表
		if(getUserId() != Constant.SUPER_ADMIN){
			map.put("createUserId", getUserId());
		}
		List<SysRoleEntity> list = sysRoleService.selectByMap(map);

		return R.ok().put("list", list);
	}

	/**
	 * 角色信息
	 */
	@GetMapping("/info/{roleId}")
	@RequiresPermissions("sys:role:info")
	public R info(@PathVariable("roleId") Long roleId){
		SysRoleEntity role = sysRoleService.selectById(roleId);
		Integer type = role.getRoleType();
		Integer subordinate = role.getSubordinate();

		//查询角色对应的菜单
		List<Long> menuIdList = sysRoleMenuService.queryMenuIdList(roleId);
		//查询角色对应的组织和类型
		List<PmsDictEntity> roleType = roleTypeOrOrgService.querySingleRoleType(roleId,type);
		List<PmsDictEntity> org = roleTypeOrOrgService.querySingleOrg(roleId,subordinate);

		role.setMenuIdList(menuIdList);

		return R.ok().put("role", role)
				.put("org",org)
				.put("roleType",roleType);
	}

	/**
	 * 保存角色
	 */
	@SysLog("保存角色")
	@PostMapping({"/save"})
	@RequiresPermissions({"sys:role:save"})
	public R save(@RequestBody PmsRoleDto roleDto) {
		SysRoleEntity role = new SysRoleEntity();
		role.setRoleId(roleDto.getRoleId());
		role.setRoleName(roleDto.getRoleName());
		role.setRoleCode(roleDto.getRoleCode());
		role.setSubordinate(Integer.valueOf(roleDto.getOrgType()));
		role.setRoleType(Integer.valueOf(roleDto.getRoleTypes()));
		role.setMenuIdList(roleDto.getMenuIdList());
        if (roleDto.getCreateUserId() != null) {
			role.setCreateUserId(roleDto.getCreateUserId());
        }else {
			role.setCreateUserId(this.getUserId());
		}

		//校验对象
		ValidatorUtils.validateEntity(role);

		this.sysRoleService.save(role);
		this.roleTypeOrOrgService.sava(role.getRoleId(), role.getRoleType(), role.getSubordinate());
		return R.ok();
	}

	/**
	 * 修改角色
	 */
	@SysLog("修改角色")
	@PostMapping({"/update"})
	@RequiresPermissions({"sys:role:update"})
	public R update(@RequestBody PmsRoleDto role) {

		ValidatorUtils.validateEntity(role);
		role.setCreateUserId(getUserId());
		sysRoleService.updateRole(role);
		return R.ok();
	}

	/**
	 * 禁用角色
	 */
	@SysLog("禁用角色")
	@PostMapping("/delete")
	@RequiresPermissions("sys:role:delete")
	public R delete(@RequestBody Long[] roleIds){
		sysRoleService.deleteBatch(roleIds);

		return R.ok();
	}
}
