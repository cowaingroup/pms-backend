package com.cowain.pms.modules.wms.dao;

import com.cowain.pms.modules.wms.entity.WarehouseUserEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tom
 * @email zhaoxinsheng@cowain.com.cn
 * @date 2019-07-15 10:00:34
 */
@Mapper
public interface WarehouseUserDao extends BaseMapper<WarehouseUserEntity> {
    List<WarehouseUserDao> queryManagerWareList();

    void deleteManagerWare(@Param("userId") int user_id);

    void deleteManagerWareList(Long[] users_id);

    /**
     * @param userId 用户的Id
     * @return 返回用户id对应的 管理的仓库代号的集合
     */
    List<Integer> queryHouseCodeList(@Param("userId") int userId);
}
