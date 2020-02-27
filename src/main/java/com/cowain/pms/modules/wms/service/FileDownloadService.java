package com.cowain.pms.modules.wms.service;

import com.baomidou.mybatisplus.service.IService;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.modules.wms.entity.FileDownloadEntity;

import java.util.Map;

/**
 * 
 *
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-05 15:58:20
 */
public interface FileDownloadService extends IService<FileDownloadEntity> {

    PageUtils queryPage(Map<String, Object> params);

    String queryUrl(String type);
}

