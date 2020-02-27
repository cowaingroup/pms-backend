package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.WmsAdjusdetailEntity;
import com.cowain.pms.modules.wms.entity.WmsAdjusformEntity;
import com.cowain.pms.modules.wms.entity.WmsCheckDetailEntity;
import com.cowain.pms.modules.wms.entity.WmsCheckFormEntity;
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
 * @date 2019-08-26 14:00:39
 */
@Mapper
public interface WmsAdjusformDao extends BaseMapper<WmsAdjusformEntity> {
    List<WmsAdjusformEntity> SelectAdjustForm(Map<String,Object> params);

    List<WmsAdjusdetailEntity> selAdjustDetail(Map<String,Object> params);

    int cancelAdjustDetail(@Param("id") int id);

    /**
     * 获取调整单最大的单号
     * @return
     */
    WmsAdjusformEntity findMaxAdjustNo();
}
