package com.cowain.pms.modules.wms.dao.enterdao;


import com.cowain.pms.modules.wms.entity.enterentity.WmsQulityCheckDocDetailEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsReceivDocDetailEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-28 15:47:44
 */
@Mapper
public interface WmsQulityCheckDocDetailDao extends BaseMapper<WmsQulityCheckDocDetailEntity> {

    WmsQulityCheckDocDetailEntity selectByGlobalId(WmsReceivDocDetailEntity wmsReceivDocDetailEntity);

    List<WmsQulityCheckDocDetailEntity> selectByRecive(Map<String,Object> map);
}
