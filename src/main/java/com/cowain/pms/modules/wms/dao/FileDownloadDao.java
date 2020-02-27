package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.FileDownloadEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-09-05 15:58:20
 */
@Mapper
public interface FileDownloadDao extends BaseMapper<FileDownloadEntity> {
    String queryUrl(@Param("type") String type);
}
