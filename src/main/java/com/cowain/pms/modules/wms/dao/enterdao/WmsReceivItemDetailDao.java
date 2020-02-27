package com.cowain.pms.modules.wms.dao.enterdao;


import com.cowain.pms.modules.wms.entity.enterentity.WmsReceivItemDetailEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * PDA 或其他设备收单明细表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-28 15:47:44
 */
@Mapper
public interface WmsReceivItemDetailDao extends BaseMapper<WmsReceivItemDetailEntity> {

	WmsReceivItemDetailEntity getItemBySn(@Param("itemSn") String itemSn,@Param("wmsDocNo") String wmsDocNo);
}
