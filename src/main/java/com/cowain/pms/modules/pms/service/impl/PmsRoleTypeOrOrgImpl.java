package com.cowain.pms.modules.pms.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cowain.pms.modules.pms.dao.PmsDictDao;
import com.cowain.pms.modules.pms.entity.PmsDictEntity;
import com.cowain.pms.modules.pms.service.PmsRoleTypeOrOrgService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pmsRoleTypeOrOrgService")
public class PmsRoleTypeOrOrgImpl extends ServiceImpl<PmsDictDao,PmsDictEntity> implements PmsRoleTypeOrOrgService {

    @Override
    public List<PmsDictEntity> queryOrg() {
        return baseMapper.queryOrg();
    }

    @Override
    public  List<PmsDictEntity> queryRoleType() {
        return baseMapper.queryRoleType();
    }

    @Override
    public List<PmsDictEntity> querySingleRoleType(Long roleId, Integer type) {
        return baseMapper.querySingleOrg(type, roleId);
    }

    @Override
    public List<PmsDictEntity> querySingleOrg(Long roleId,Integer org) {
        return baseMapper.querySingleOrg(org, roleId);
    }

    @Override
    public void sava(Long roleId, Integer roleType, Integer org) {
       baseMapper.sava(roleId,roleType,org);
    }

    @Override
    public void saveOrUpdate(Long roleId, Integer subordinate, Integer roleType) {
        int count = baseMapper.queryRole(roleId);
        if (count != 0) {
            baseMapper.deleteRoleId(roleId);
        }

        baseMapper.saveOrUpdate(roleId, subordinate, roleType);
    }
}
