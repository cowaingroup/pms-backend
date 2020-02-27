package com.cowain.pms.modules.wms.dao.outerdao;


import com.cowain.pms.modules.wms.entity.enterentity.WmsReceivDocEntity;
import com.cowain.pms.modules.wms.entity.outerentity.WmsPickTaskEntity;
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
public interface WmsPickTaskDao extends BaseMapper<WmsPickTaskEntity> {
    WmsPickTaskEntity getMaxEntityOfDocNoByDate();

    List<WmsPickTaskEntity> PageList(com.cowain.pms.common.page.Page pageParam);

    List<WmsPickTaskEntity> getTaskByOutDoc(Integer[] ids);

    List<WmsPickTaskEntity> selectTask(Map<String,Object> map);

    int updateRequestStatus(Map<String,Object> map);
}
