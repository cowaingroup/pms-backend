package com.cowain.pms.modules.wms.dao.enterdao;


import com.cowain.pms.modules.wms.entity.enterentity.WmsDocActEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsInDocEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-28 15:47:44
 */
@Mapper
public interface WmsInDocDao extends BaseMapper<WmsInDocEntity> {
    WmsInDocEntity selectByDoc(Map<String, Object> map);

    List<WmsInDocEntity> PageList(com.cowain.pms.common.page.Page pageParam);

    WmsInDocEntity getMaxEntityOfDocNoByDate( @Param("docType")  int docType);

    List<WmsInDocEntity> selectByMerge(@Param("mergeNo") String mergeNo);
}
