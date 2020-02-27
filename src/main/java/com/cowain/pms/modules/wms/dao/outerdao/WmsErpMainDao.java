package com.cowain.pms.modules.wms.dao.outerdao;


import com.cowain.pms.modules.wms.entity.outerentity.WmsErpMainEntity;
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
 * @date 2019-10-18 13:32:41
 */
@Mapper
public interface WmsErpMainDao extends BaseMapper<WmsErpMainEntity> {
    List<WmsErpMainEntity> PageList(com.cowain.pms.common.page.Page pageParam);

    List<WmsErpMainEntity> getMain(Map<String,Object> map);

    WmsErpMainEntity getMaxEntityOfDocNoByDate(@Param("type") int type);
}
