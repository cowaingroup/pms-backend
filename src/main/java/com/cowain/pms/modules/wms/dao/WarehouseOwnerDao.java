package com.cowain.pms.modules.wms.dao;


import com.cowain.pms.modules.wms.entity.WarehouseOwnerEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-12-02 09:53:22
 */
@Mapper
public interface WarehouseOwnerDao extends BaseMapper<WarehouseOwnerEntity> {

    int deleteManagerWare(@Param("ownerId") int ownerId);

    List<Long> getHouseByOwnerId(@Param("ownerId") int ownerId);
}
