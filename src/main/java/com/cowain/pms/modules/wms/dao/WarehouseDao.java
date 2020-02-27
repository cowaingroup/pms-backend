package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.sys.entity.SysUserEntity;
import com.cowain.pms.modules.wms.entity.WarehouseEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-11 08:08:56
 */
@Mapper
public interface WarehouseDao extends BaseMapper<WarehouseEntity> {
   List<WarehouseEntity>queryWareHouseList();

   List<Integer>WareHouseIsUse(Integer[] ids);

   List<Integer> selectHouseIdList(String[] houseList);

   List<Integer>houseCodeIsUse(WarehouseEntity entity);

   List<Integer>houseNameIsExist(@Param("houseName") String houseName);

   List<WarehouseEntity> getHouseByUser(SysUserEntity sysUserEntity);
}
