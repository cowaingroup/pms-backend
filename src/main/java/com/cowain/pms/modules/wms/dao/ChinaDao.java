package com.cowain.pms.modules.wms.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cowain.pms.modules.wms.entity.ChinaEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-16 08:11:27
 */
@Mapper
public interface ChinaDao extends BaseMapper<ChinaEntity> {
    List<ChinaEntity> queryArea(int parentid);

    List<ChinaEntity> queryAllArea();
}
