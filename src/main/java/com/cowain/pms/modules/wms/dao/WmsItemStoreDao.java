package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.WmsItemStoreEntity;
import com.cowain.pms.modules.wms.entity.outerentity.WmsErpOuinfoEntity;
import com.cowain.pms.modules.wms.entity.outerentity.WmsTaskDetailEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-10-26 09:24:04
 */
@Mapper
public interface WmsItemStoreDao extends BaseMapper<WmsItemStoreEntity> {
    WmsItemStoreEntity itemExist(WmsItemStoreEntity entity);

    int lockStore(WmsErpOuinfoEntity outInfo);

    int addStore(WmsErpOuinfoEntity outInfo);

    int decreseStore(WmsTaskDetailEntity wmsTaskDetailEntity);

    WmsItemStoreEntity itemExist(@Param("projectId")String projectId,@Param("itemCode")String itemCode);

}
