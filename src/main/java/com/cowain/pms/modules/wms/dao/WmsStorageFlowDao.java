package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.WmsStorageFlowEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * 库存流水
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-08-17 16:54:15
 */
@Mapper
public interface WmsStorageFlowDao extends BaseMapper<WmsStorageFlowEntity> {
	
}
