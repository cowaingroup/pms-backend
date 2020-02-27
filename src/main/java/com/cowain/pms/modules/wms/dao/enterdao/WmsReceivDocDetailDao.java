package com.cowain.pms.modules.wms.dao.enterdao;


import com.cowain.pms.modules.wms.entity.enterentity.WmsQulityCheckDocDetailEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsQulityCheckDocEntity;
import com.cowain.pms.modules.wms.entity.enterentity.WmsReceivDocDetailEntity;
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
 * @date 2019-09-28 15:47:44
 */
@Mapper
public interface WmsReceivDocDetailDao extends BaseMapper<WmsReceivDocDetailEntity> {
    WmsReceivDocDetailEntity selectReceivDocInfo(WmsQulityCheckDocDetailEntity qulityCheckDocDetailEntity);

    List<WmsReceivDocDetailEntity> getDetailByDoc(WmsQulityCheckDocEntity checkDocEntity);

    List<WmsReceivDocDetailEntity> getDetailByParam(Map<String, Object> params);

    List<WmsReceivDocDetailEntity> getDetailByPrinter(@Param("receiveId") Integer receiveId);

    List<WmsReceivDocDetailEntity> getDetailByGobalId(@Param("globalId") String globalId);

    int deleteBySn(Map<String,Object> map);

    WmsReceivDocDetailEntity getPdaAddItem(Map<String,Object> map);
}
