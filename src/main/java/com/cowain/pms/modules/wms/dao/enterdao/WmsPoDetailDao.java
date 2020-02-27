package com.cowain.pms.modules.wms.dao.enterdao;


import com.cowain.pms.modules.wms.entity.enterentity.WmsItemReceivInfoEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsPoDetailEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-12-02 08:28:52
 */
@Mapper
public interface WmsPoDetailDao extends BaseMapper<WmsPoDetailEntity> {
    WmsPoDetailEntity selectItem(WmsItemReceivInfoEntity receivInfoEntity);

    List<WmsPoDetailEntity> pageList(Map<String, Object> params);

    int updateItemNum(@Param("id")int id,@Param("itemNum") int itemNum);

    int decreaseItemNum(WmsPoDetailEntity wmsPoDetailEntity);
}
