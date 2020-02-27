package com.cowain.pms.modules.wms.dao.outerdao;


import com.cowain.pms.modules.wms.entity.outerentity.WmsOulogEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-10-23 14:40:36
 */
@Mapper
public interface WmsOulogDao extends BaseMapper<WmsOulogEntity> {
    List<WmsOulogEntity> selectLog(Map<String,Object> params);
}
