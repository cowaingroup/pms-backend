package com.cowain.pms.modules.wms.dao.enterdao;


import com.cowain.pms.modules.wms.entity.enterentity.WmsPublishTaskEntity;
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
 * @date 2019-11-21 09:12:24
 */
@Mapper
public interface WmsPublishTaskDao extends BaseMapper<WmsPublishTaskEntity> {
    WmsPublishTaskEntity getMaxEntityOfDocNoByDate();

    int updateDocStatus(WmsPublishTaskEntity wmsPublishTaskEntity);

    WmsPublishTaskEntity selectTaskByType(@Param("wmsDocNo") String wmsDocNo,@Param("type") int type);

    WmsPublishTaskEntity selectTaskByNo(@Param("taskNo") String taskNo);

    int updateTaskLock(WmsPublishTaskEntity wmsPublishTaskEntity);

    List<WmsPublishTaskEntity> selectPdaTask(Map<String,Object> map);

    List<WmsPublishTaskEntity> publishTaskPageList(com.cowain.pms.common.page.Page pageParam);

    WmsPublishTaskEntity selectPublishTaskById(@Param("id") Integer id);
}
