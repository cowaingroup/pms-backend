package com.cowain.pms.modules.wms.dao.outerdao;


import com.cowain.pms.modules.wms.entity.outerentity.WmsOupackEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-10-23 14:40:36
 */
@Mapper
public interface WmsOupackDao extends BaseMapper<WmsOupackEntity> {
    WmsOupackEntity getMaxEntityOfDocNoByDate();

    List<WmsOupackEntity> getOutPack(@Param("packNo")String packNo);
}
