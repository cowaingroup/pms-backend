package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.WmsAdjusdetailEntity;
import com.cowain.pms.modules.wms.entity.WmsAdjusformEntity;
import com.cowain.pms.modules.wms.entity.WmsCheckDetailEntity;
import com.cowain.pms.modules.wms.entity.WmsCheckFormEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

/**
 * 盘点清单
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-08-19 15:39:29
 */
@Mapper
public interface WmsCheckFormDao extends BaseMapper<WmsCheckFormEntity> {
    List<WmsCheckDetailEntity> selCheckDetail(Map<String, Object> params);
    List<WmsCheckDetailEntity> selCheckDetailById(List<String> ids);
    List<WmsCheckFormEntity> SelectCheckForm(Map<String, Object> params);
    int updateStatus(@Param("list") List<String> ids,@Param("status") String status);
    int insertAdjustForm(WmsAdjusformEntity form);
    int insertAdjustDetail(List<WmsAdjusdetailEntity> form);

    /**
     * 获取盘点单最大的编号
     * @return
     */
    WmsCheckFormEntity findMaxCheckNo();
}
