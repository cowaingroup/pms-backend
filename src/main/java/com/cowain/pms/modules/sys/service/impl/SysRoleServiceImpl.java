package com.cowain.pms.modules.sys.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cowain.pms.common.exception.RRException;
import com.cowain.pms.common.utils.Constant;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.modules.pms.dto.PmsRoleDto;
import com.cowain.pms.modules.pms.service.PmsRoleService;
import com.cowain.pms.modules.pms.service.PmsRoleTypeOrOrgService;
import com.cowain.pms.modules.pms.vo.PmsRoleVo;
import com.cowain.pms.modules.sys.dao.SysRoleDao;
import com.cowain.pms.modules.sys.entity.SysRoleEntity;
import com.cowain.pms.modules.sys.service.SysRoleMenuService;
import com.cowain.pms.modules.sys.service.SysRoleService;
import com.cowain.pms.modules.sys.service.SysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 角色
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年9月18日 上午9:45:12
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {
	@Autowired
	private SysRoleMenuService sysRoleMenuService;
	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private PmsRoleTypeOrOrgService roleTypeOrOrgService;
	@Autowired
	private PmsRoleService roleService;

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		Page page = new Page(Integer.parseInt(String.valueOf(params.get("page"))),
				Integer.parseInt(String.valueOf(params.get("limit"))));
		page.setRecords(baseMapper.selectRolePageList(page, params));
		List<PmsRoleDto> list = new ArrayList<>();
		page.getRecords().forEach(pageDto -> {
			PmsRoleVo vo = new PmsRoleVo();
			BeanUtils.copyProperties(pageDto,vo);
			list.add(vo);
		});
		return new PageUtils(list, page.getTotal(), page.getCurrent(), page.getSize());
	}

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(SysRoleEntity role) {
        role.setCreateTime(new Date());
        this.insert(role);

        //检查权限是否越权
        checkPrems(role);

        //保存角色与菜单关系
        sysRoleMenuService.saveOrUpdate(role.getRoleId(), role.getMenuIdList());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(PmsRoleDto role) {


    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void 	deleteBatch(Long[] roleIds) {
		//1. 修改角色信息 先将角色id集合遍历出来
		for (Long roleId : roleIds) {
			//2.拿到每个角色id，并查询出每个角色状态
		  int statusCode = baseMapper.queryRole(roleId);


		  int status = statusCode == 1 ? 2 : 1;

			baseMapper.updateStatus(status, roleId);
		}
    }


    @Override
	public List<Long> queryRoleIdList(Long createUserId) {
		return baseMapper.queryRoleIdList(createUserId);
	}

	/**
	 * 检查权限是否越权
	 */
	private void checkPrems(SysRoleEntity role){
		//如果不是超级管理员，则需要判断角色的权限是否超过自己的权限
		if(role.getCreateUserId() == Constant.SUPER_ADMIN){
			return ;
		}

		//查询用户所拥有的菜单列表
		List<Long> menuIdList = sysUserService.queryAllMenuId(role.getCreateUserId());

		//判断是否越权
		if(!menuIdList.containsAll(role.getMenuIdList())){
			throw new RRException("新增角色的权限，已超出你的权限范围");
		}
	}

	@Override
	public List<Long> selectRoleIdList(String[] roleList) {
		return baseMapper.selectRoleIdList(roleList);
	}

	@Override
	public void updateRole(PmsRoleDto role) {
		SysRoleEntity roleEntity = baseMapper.seekRole(role.getRoleId());
		this.updateAllColumnById(roleEntity);
		this.checkPrems(roleEntity);

		Integer subordinate = null;
		Integer roleType = null;

		if (role.getOrgType().contains("科瑞恩") || role.getRoleTypes().contains("级")){

			if (!role.getRoleTypes().contains("级")){
				roleType = baseMapper.queryRoleTypes(role.getRoleTypes());
			}else {
				roleType = baseMapper.queryRoleType(role.getRoleTypes());
			}
			if (!role.getOrgType().contains("科瑞恩")){
				subordinate = baseMapper.queryOrgs(role.getOrgType());
				return;
			}
			subordinate = baseMapper.queryOrg(role.getOrgType());

		}else {
			roleType = Integer.valueOf(role.getRoleTypes());
			subordinate = Integer.valueOf(role.getOrgType());
		}

		//更新角色所属和角色类型
		roleTypeOrOrgService.saveOrUpdate(role.getRoleId(), subordinate, roleType);

		roleService.updateRole(role.getRoleId(), subordinate, roleType);
		//更新角色绑定的菜单
		sysRoleMenuService.saveOrUpdate(role.getRoleId(), role.getMenuIdList());
	}
}
