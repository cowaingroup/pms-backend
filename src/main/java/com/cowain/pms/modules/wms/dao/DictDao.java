package com.cowain.pms.modules.wms.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cowain.pms.modules.wms.entity.DictEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.Map;
import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-16 08:11:28
 */
@Mapper
public interface DictDao extends BaseMapper<DictEntity> {

    List<DictEntity> queryDictMap(Map<String,Object> map);

    DictEntity selectByUserId(@Param("userId") Long userId);
}
