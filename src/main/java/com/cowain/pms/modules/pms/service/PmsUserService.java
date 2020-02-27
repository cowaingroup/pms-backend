package com.cowain.pms.modules.pms.service;

import com.baomidou.mybatisplus.service.IService;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.modules.pms.dto.PmsUserEntityDto;
import com.cowain.pms.modules.pms.entity.PmsUserEntity;

import java.util.List;
import java.util.Map;

/**
 * 系统用户
 *
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2020-01-11 10:41:54
 */
public interface PmsUserService extends IService<PmsUserEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void deleteUser(Long[] userIds);

    void updateUserById(PmsUserEntityDto pmsUser);

    List<Map<String,List>> queryRoleOrg();

    void bindingRoles(Long[] roleId, Long userId);

    void resetPassword(Long[] ids);

}

