package com.cowain.pms.modules.pms.service;

import com.baomidou.mybatisplus.service.IService;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.modules.pms.entity.PmsUserRoleEntity;

import java.util.Map;

/**
 * 用户与角色对应关系
 *
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2020-01-11 10:41:54
 */
public interface PmsUserRoleService extends IService<PmsUserRoleEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void insertUserRole(Long[] roleId, Long userId);
}

