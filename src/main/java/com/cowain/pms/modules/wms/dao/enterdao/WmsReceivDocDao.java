package com.cowain.pms.modules.wms.dao.enterdao;


import com.cowain.pms.modules.wms.entity.enterentity.WmsReceivDocEntity;
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
 * @date 2019-09-28 15:47:44
 */
@Mapper
public interface WmsReceivDocDao extends BaseMapper<WmsReceivDocEntity> {
    List<WmsReceivDocEntity> recivPageList(com.cowain.pms.common.page.Page pageParam);

    WmsReceivDocEntity getMaxEntityOfDocNoByDate(@Param("type") int type);

    WmsReceivDocEntity selectByDocNo(@Param("wmsDocNo") String wmsDocNo);

    List<WmsReceivDocEntity> getReciveDocList(@Param("type") int type);

    List<WmsReceivDocEntity> getCheckTask(Map<String, Object> params);


}
