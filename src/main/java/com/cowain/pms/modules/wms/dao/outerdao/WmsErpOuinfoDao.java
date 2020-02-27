package com.cowain.pms.modules.wms.dao.outerdao;



import com.cowain.pms.modules.wms.entity.outerentity.*;

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
public interface WmsErpOuinfoDao extends BaseMapper<WmsErpOuinfoEntity> {
    List<WmsErpOuinfoEntity> selectDetail(Map<String, Object> params);

    List<WmsErpOuinfoEntity> selectDetailByMain(WmsErpMainEntity wmsErpMainEntity);

    WmsErpOuinfoEntity selectDetailByTask(WmsTaskDetailEntity wmsTaskDetailEntity);

    List<WmsErpOuinfoEntity> printerByOutInfo(@Param("wmsDocNo") String wmsDocNo);

    List<WmsErpOuinfoEntity> printerByPick(@Param("wmsDocNo") String wmsDocNo);





}
