package com.cowain.pms.modules.pms.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.common.utils.Query;
import com.cowain.pms.modules.pms.dao.PmsUserRoleDao;
import com.cowain.pms.modules.pms.entity.PmsUserRoleEntity;
import com.cowain.pms.modules.pms.service.PmsUserRoleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@Service("pmsUserRoleService")
public class PmsUserRoleServiceImpl extends ServiceImpl<PmsUserRoleDao, PmsUserRoleEntity> implements PmsUserRoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PmsUserRoleEntity> page = this.selectPage(
                new Query<PmsUserRoleEntity>(params).getPage(),
                new EntityWrapper<PmsUserRoleEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void insertUserRole(Long[] roleIds, Long userId) {

        ArrayList<Map<String,Long>> list = new ArrayList<>();

        for (Long roleId : roleIds) {
            Map<String, Long> map = new HashMap<>();
            map.put("userId",userId);
            map.put("roleId",roleId);
            list.add(map);
        }
        baseMapper.insertUserRoles(list);
    }
}
