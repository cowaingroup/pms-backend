package com.cowain.pms.modules.wms.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cowain.pms.modules.wms.entity.DeptEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-13 15:54:29
 */
@Mapper
public interface DeptDao extends BaseMapper<DeptEntity> {
    List<DeptEntity> queryDeptList();

}
