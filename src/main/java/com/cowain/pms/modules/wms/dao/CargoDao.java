package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.CargoEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-11-20 08:58:36
 */
@Mapper
public interface CargoDao extends BaseMapper<CargoEntity> {
    List<CargoEntity> palletPageList(com.cowain.pms.common.page.Page pageParam);

    List<CargoEntity> getCargoNameAll();

    List<CargoEntity> getLoadingAreaByCargoName(@Param("cargoCode")String cargoCode);
    List<Integer> cargoIsUser(CargoEntity entity);
}
