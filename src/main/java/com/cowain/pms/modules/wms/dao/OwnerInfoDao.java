package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.OwnerInfoEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-08-27 09:54:51
 */
@Mapper
public interface OwnerInfoDao extends BaseMapper<OwnerInfoEntity> {
	List<OwnerInfoEntity> queryOwnerList();

	List<Integer> ownerCodeIsUse(OwnerInfoEntity entity);

	int insertOwnerList(List<OwnerInfoEntity> list);

	//获取所有的货主
	List<OwnerInfoEntity> getOwnerNameAll();

	List<OwnerInfoEntity> getOwnerByHouse(List<Integer> ids);
}
