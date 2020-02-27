package com.cowain.pms.modules.wms.dao.outerdao;

import com.cowain.pms.modules.wms.entity.outerentity.WmsChangeDetailEntity;
import com.cowain.pms.modules.wms.entity.outerentity.WmsPalletEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 形态转换详情表
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-12-05 16:23:36
 */
@Mapper
public interface WmsChangeDetailDao extends BaseMapper<WmsChangeDetailEntity> {
    List<WmsChangeDetailEntity> pageList(Map<String, Object> params);
}
