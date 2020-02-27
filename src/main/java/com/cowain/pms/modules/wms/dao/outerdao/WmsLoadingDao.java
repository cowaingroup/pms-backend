package com.cowain.pms.modules.wms.dao.outerdao;

import com.cowain.pms.modules.wms.entity.outerentity.WmsLoadingEntity;
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
 * @date 2019-11-11 11:03:10
 */
@Mapper
public interface WmsLoadingDao extends BaseMapper<WmsLoadingEntity> {
    List<WmsLoadingEntity> loadingPageList(com.cowain.pms.common.page.Page pageParam);
    WmsLoadingEntity getMaxEntityOfDocNoByDate();
    boolean updateByLoading(Map<String, Object> params);

    int delectByLoadingNumber(@Param("loadingNumber")String loadingNumber);
}
