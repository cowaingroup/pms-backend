package com.cowain.pms.modules.pms.service;

import com.baomidou.mybatisplus.service.IService;
import com.cowain.pms.modules.pms.entity.PmsDictEntity;

import java.util.List;

public interface PmsRoleTypeOrOrgService extends IService<PmsDictEntity> {


    List<PmsDictEntity> queryOrg();

    List<PmsDictEntity> queryRoleType();

    List<PmsDictEntity> querySingleRoleType(Long roleId, Integer type);

    List<PmsDictEntity> querySingleOrg(Long roleId,Integer org);

    void sava(Long roleId, Integer roleType, Integer org);

    void saveOrUpdate(Long roleId, Integer subordinate, Integer roleType);
}
