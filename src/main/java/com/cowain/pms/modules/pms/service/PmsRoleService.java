package com.cowain.pms.modules.pms.service;

import com.baomidou.mybatisplus.service.IService;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.modules.pms.entity.PmsRoleEntity;

import java.util.Map;

/**
 * 角色
 *
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2020-01-11 10:41:54
 */
public interface PmsRoleService extends IService<PmsRoleEntity> {

    PageUtils queryList(Map<String, Object> params);


    void updateRole(Long roleId, Integer subordinate, Integer roleType);

    int deleteRole(Integer id);

    int deleteRoles(Integer[] ids);
}

