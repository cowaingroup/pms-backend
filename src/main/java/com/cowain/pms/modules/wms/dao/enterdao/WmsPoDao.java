package com.cowain.pms.modules.wms.dao.enterdao;

import com.cowain.pms.modules.wms.entity.enterentity.WmsPoEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-12-06 15:00:04
 */
@Mapper
public interface WmsPoDao extends BaseMapper<WmsPoEntity> {
    List<WmsPoEntity> poPageList(com.cowain.pms.common.page.Page pageParam);

    WmsPoEntity updateByStatus (@Param("poCode") String  poCode);
}
