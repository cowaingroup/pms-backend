package com.cowain.pms.modules.wms.dao.outerdao;

import com.cowain.pms.modules.wms.entity.outerentity.WmsChangeEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * 形态转换表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-12-05 16:23:36
 */
@Mapper
public interface WmsChangeDao extends BaseMapper<WmsChangeEntity> {
    List<WmsChangeEntity> changePageList(com.cowain.pms.common.page.Page pageParam);
}
