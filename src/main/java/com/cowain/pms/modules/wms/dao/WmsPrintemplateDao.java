package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.WmsPrintemplateEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-11-18 13:32:17
 */
@Mapper
public interface WmsPrintemplateDao extends BaseMapper<WmsPrintemplateEntity> {
    List<Integer> printemplatelsIsUser(WmsPrintemplateEntity entity);
}
