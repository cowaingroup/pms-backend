package com.cowain.pms.modules.wms.service;

import com.baomidou.mybatisplus.service.IService;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.modules.wms.entity.ChinaEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-16 08:11:27
 */
public interface ChinaService extends IService<ChinaEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<ChinaEntity> queryArea(int parentid);

    List<ChinaEntity> queryAllArea();

    List<ChinaEntity> getTreeDataLoop(int level);
}

