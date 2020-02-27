package com.cowain.pms.modules.pms.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.cowain.pms.modules.pms.dto.PmsUserEntityDto;
import com.cowain.pms.modules.pms.entity.PmsUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 系统用户
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2020-01-11 10:41:54
 */
@Mapper
public interface PmsUserDao extends BaseMapper<PmsUserEntity> {


    List<PmsUserEntityDto> selectRolePageList(@Param("page") Page page, @Param("params") Map<String, Object> params);

    void deleteUser(@Param("userId") Long userId);

    List<Map<String,List>> queryRoleOrg();

    String querySaltById(@Param("id") Long id);

    void resetPwd(@Param("id") Long id, @Param("newPass") String newPass);
}
