package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.WhAreaEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-11 08:08:56
 */
@Mapper
public interface WhAreaDao extends BaseMapper<WhAreaEntity> {
    List<WhAreaEntity> queryWareList();

    List<Integer> WareAreaIsUse(Integer[] ids);

    List<Integer> areaCodeIsUse(WhAreaEntity entity);

    List<Integer> areaNameIsExist(@Param("areaName") String  areaName);

    List<WhAreaEntity> getAreaNameAll();
}
