package com.cowain.pms.modules.wms.dao.enterdao;


import com.cowain.pms.modules.wms.entity.enterentity.WmsInAclogEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-10-09 08:44:09
 */
@Mapper
public interface WmsInAclogDao extends BaseMapper<WmsInAclogEntity> {
	List<WmsInAclogEntity>  selectActLogByGlobalId(@Param("globalId") String globalId);
}
