package com.cowain.pms.modules.wms.dao.enterdao;


import com.cowain.pms.modules.wms.entity.enterentity.WmsItemReceivInfoEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.Map;

/**
 * 料号能否接收数据日志表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-28 15:47:44
 */
@Mapper
public interface WmsItemReceivInfoDao extends BaseMapper<WmsItemReceivInfoEntity> {
    int updateItemStatus(Map<String,Object> map);
}
