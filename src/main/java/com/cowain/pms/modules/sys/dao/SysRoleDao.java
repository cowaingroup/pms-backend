package com.cowain.pms.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.cowain.pms.modules.pms.dto.PmsRoleDto;
import com.cowain.pms.modules.sys.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 角色管理
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年9月18日 上午9:33:33
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {

	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);

	List<Long> selectRoleIdList(String[] roleList);


	int queryRole(@Param("roleId") Long roleId);

	void updateStatus(@Param("status") int status, @Param("roleId") Long roleId);

	List<PmsRoleDto> selectRolePageList(Pagination page, @Param("param") Map<String, Object> params);

	SysRoleEntity seekRole(Long roleId);


	Integer queryOrg(String orgType);

	Integer queryRoleType(String roleTypes);

	Integer queryRoleTypes(String roleTypes);

	Integer queryOrgs(String orgType);
}

