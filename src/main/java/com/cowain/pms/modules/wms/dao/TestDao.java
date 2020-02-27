package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-11-15 11:17:40
 */
@Mapper
public interface TestDao extends BaseMapper<TestEntity> {
	TestEntity selectByNo(@Param("itemSn") String itemSn);
}
