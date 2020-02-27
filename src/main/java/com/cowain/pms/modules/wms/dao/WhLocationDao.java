package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.WhLocationEntity;
import com.cowain.pms.modules.wms.syn.PositionStatus;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-11 08:08:56
 */
@Mapper
public interface WhLocationDao extends BaseMapper<WhLocationEntity> {
    List<WhLocationEntity> palletPageList(com.cowain.pms.common.page.Page pageParam);

    List<Integer> locationIsUses(Integer[] ids);

    int insertLocationList(List<WhLocationEntity> list);

    List<Integer> locationNameIsExist(String areaName);

    List<WhLocationEntity> queryLoactionList(Map<String,Object> map);

    int updateLocationStatus (@Param("status") String status,@Param("whLocationCode") String whLocationCode);

    List<WhLocationEntity> queryAllocateLocation(@Param("projectId") String project,@Param("status") String status,@Param("areaCode") String areaCode);

    List<WhLocationEntity> queryFreeLocation(@Param("status") String status,@Param("areaCode") String areaCode);
}
