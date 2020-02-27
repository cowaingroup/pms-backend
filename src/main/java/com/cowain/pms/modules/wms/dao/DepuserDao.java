package com.cowain.pms.modules.wms.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cowain.pms.modules.wms.entity.DepuserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-15 11:14:30
 */
@Mapper
public interface DepuserDao extends BaseMapper<DepuserEntity> {

    int insertDepuser(List<DepuserEntity> list);

    List<Integer> queryByUserId(@Param("userId") Long userId);

    int deleteByUserId(@Param("userId") Long userId);

    int deleteByUserIds(Long[] userId);
}
