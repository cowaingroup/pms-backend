package com.cowain.pms.modules.wms.dao.outerdao;


import com.cowain.pms.modules.wms.entity.outerentity.WmsTaskDetailEntity;
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
 * @date 2019-10-23 14:40:36
 */
@Mapper
public interface WmsTaskDetailDao extends BaseMapper<WmsTaskDetailEntity> {
    List<WmsTaskDetailEntity> getDetailByParam(Map<String, Object> params);

    List<WmsTaskDetailEntity> getDetailByDoc(Map<String, Object> params);

    int deleteByTask(@Param("outId") int outId);

    List<WmsTaskDetailEntity> getPallet(Map<String, Object> params);

    List<WmsTaskDetailEntity> getLoading(Map<String, Object> params);

    List<WmsTaskDetailEntity> printPallet(@Param("palletNumber") String palletNumber);

    List<WmsTaskDetailEntity> printLoding(@Param("loadingNumber") String loadingNumber);

    List<WmsTaskDetailEntity> printBox(@Param("packNo") String packNo);

    List<WmsTaskDetailEntity> getNotPackNo();

    boolean updateByPackNo(@Param("palletNumber")String palletNumber,@Param("list")List<String> packNo);

    boolean delectPalletNumber(@Param("palletNumber")String palletNumber);

    WmsTaskDetailEntity selectByPackNo(@Param("packNo")String packNo);
}
