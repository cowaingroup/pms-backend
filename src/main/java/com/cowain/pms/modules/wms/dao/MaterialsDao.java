package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.MaterialsEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-11-20 14:25:19
 */
@Mapper
public interface MaterialsDao extends BaseMapper<MaterialsEntity> {
    List<MaterialsEntity> palletPageList(com.cowain.pms.common.page.Page pageParam);

    List<Integer> materialsIsUser(MaterialsEntity entity);
}
