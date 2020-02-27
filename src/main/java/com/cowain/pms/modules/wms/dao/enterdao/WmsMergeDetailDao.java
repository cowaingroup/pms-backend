package com.cowain.pms.modules.wms.dao.enterdao;


import com.cowain.pms.modules.wms.entity.enterentity.WmsMergeDetailEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsMergeDocEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-10-14 09:05:19
 */
@Mapper
public interface WmsMergeDetailDao extends BaseMapper<WmsMergeDetailEntity> {
    List<WmsMergeDetailEntity> selectByMergeId(Map<String,Object> map);


}
