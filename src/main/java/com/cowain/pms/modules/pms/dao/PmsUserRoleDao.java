package com.cowain.pms.modules.pms.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cowain.pms.modules.pms.entity.PmsUserRoleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 用户与角色对应关系
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2020-01-11 10:41:54
 */
@Mapper
public interface PmsUserRoleDao extends BaseMapper<PmsUserRoleEntity> {

    void insertUserRoles(List<Map<String, Long>> list);
}
