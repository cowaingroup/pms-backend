package com.cowain.pms.modules.wms.dao.enterdao;


import com.cowain.pms.modules.wms.entity.enterentity.WmsDocActEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsInDocDetailEntity;
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
public interface WmsInDocDetailDao extends BaseMapper<WmsInDocDetailEntity> {
    WmsInDocDetailEntity selectItemByAct(WmsDocActEntity docActEntity);

    int selectNumByDoc(@Param("wmsDocNo") String wmsDocNo);

    List<WmsInDocDetailEntity> getDetailByDoc(Map<String,Object> map);

    List<WmsInDocDetailEntity> getDetailByPrinter(@Param("inDocId") Integer inDocId);
}
