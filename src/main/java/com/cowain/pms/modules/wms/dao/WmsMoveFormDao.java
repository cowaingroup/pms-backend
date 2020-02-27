package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.WmsCheckFormEntity;
import com.cowain.pms.modules.wms.entity.WmsMoveDetailEntity;
import com.cowain.pms.modules.wms.entity.WmsMoveFormEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * 移库单
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-11 13:20:04
 */
@Mapper
public interface WmsMoveFormDao extends BaseMapper<WmsMoveFormEntity> {
    List<WmsMoveDetailEntity> selectDetail(Map<String,Object> params);
    /**
     * 获取移库单最大的编号
     * @return
     */
    WmsMoveFormEntity findMaxMoveNo();

    int insertDetail(List<WmsMoveDetailEntity> list);
}
