package com.cowain.pms.modules.wms.dao.enterdao;

import com.cowain.pms.modules.wms.entity.enterentity.WmsDocActEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsInDocDetailEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 入库执行表
 *
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-10-07 08:40:05
 */
@Mapper
public interface WmsDocActDao extends BaseMapper<WmsDocActEntity> {
    int selectNumByDoc(@Param("wmsDocNo") String wmsDocNo);

    List<WmsDocActEntity> selectActByDetail(WmsInDocDetailEntity docDetailEntity);
}
