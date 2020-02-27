package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.WmsItemStoreEntity;
import com.cowain.pms.modules.wms.entity.WmsStoreDetailEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 库存明细
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-10 10:54:54
 */
@Mapper
public interface WmsStoreDetailDao extends BaseMapper<WmsStoreDetailEntity> {
	List<WmsStoreDetailEntity> pageList(com.cowain.pms.common.page.Page pageParam);

	List<WmsStoreDetailEntity> canAlloOut(WmsItemStoreEntity wmsItemStoreEntity);

	int lockStoreDetail(@Param("id") int id,@Param("lockNum") int lockNum);

	List<WmsStoreDetailEntity> selectStore(Map<String,Object> map);

    List<WmsStoreDetailEntity> selectStoreDetail(Map<String,Object> map);

	List<WmsStoreDetailEntity> canAlloOut(@Param("projectId")String projectId,@Param("itemCode")String itemCode);
}
