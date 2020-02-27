package com.cowain.pms.modules.pms.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.cowain.pms.modules.pms.dto.PmsRoleDto;
import com.cowain.pms.modules.pms.entity.PmsRoleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 角色
 *
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2020-01-11 10:41:54
 */
@Mapper
public interface PmsRoleDao extends BaseMapper<PmsRoleEntity> {

    List<PmsRoleDto> selectRolePageList(Pagination page, @Param("param") Map<String,Object> params);


    void updateRole(@Param("subordinate") Integer subordinate, @Param("roleId") Long roleId, @Param("roleType") Integer roleType);

    int queryRoleNum(Integer id);

    void deleteRole(Integer id);
}
