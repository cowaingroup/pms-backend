package com.cowain.pms.modules.pms.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cowain.pms.modules.pms.entity.PmsDictEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface PmsDictDao extends BaseMapper<PmsDictEntity> {


    List<PmsDictEntity> queryOrg();

    List<PmsDictEntity> queryRoleType();

    List<PmsDictEntity> querySingleRoleType(@Param("type") Integer type,@Param("roleId") Long roleId);

    List<PmsDictEntity> querySingleOrg(@Param("org") Integer org, @Param("roleId") Long roleId);

    void sava(@Param("roleId") Long roleId, @Param("roleType") Integer roleType,@Param("org") Integer org);

    int queryRole(Long roleId);

    void deleteRoleId(Long roleId);

    void saveOrUpdate(Long roleId, Integer subordinate, Integer roleType);
}
