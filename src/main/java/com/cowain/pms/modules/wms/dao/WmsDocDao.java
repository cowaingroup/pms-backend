//package com.cowain.pms.modules.wms.dao;
//
//import com.baomidou.mybatisplus.mapper.BaseMapper;
//import com.cowain.pms.modules.wms.entity.enterentity.WmsDocActEntity;
//import com.cowain.pms.modules.wms.entity.WmsDocDeatilEntity;
//import com.cowain.pms.modules.wms.entity.WmsDocEntity;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//
//import java.util.List;
//import java.util.Map;
//
///**
// * @author tom
// * @email zhaoxinsheng@cowain.com.cn
// * @date 2019-07-16 08:11:28
// */
//@Mapper
//public interface WmsDocDao extends BaseMapper<WmsDocEntity> {
//    //查询入库主表
//    List<WmsDocEntity> SelectInOut(Map<String, Object> map);
//
//    //查询出库主表
//    List<WmsDocEntity> SelectOut(Map<String, Object> map);
//
//    //查询明细
//    List<WmsDocDeatilEntity> selDocDetail(Map<String, Object> map);
//
//    //更新出入库状态
//    int updateDocStatus(WmsDocEntity entity);
//
//    //导入明细
//    int insertDocInList(List<WmsDocDeatilEntity> list);
//
//    WmsDocEntity getMaxEntityOfDocNoByDate();
//
//    //获取实际入库数量
//    int getItemActualNum(Map<String, Object> map);
//
//    //插入操作明细
//    int insertActList(List<WmsDocActEntity> list);
//
//    //更新操作明细
//    int updateDocAct(List<WmsDocActEntity> list);
//
//    //根据单号获取入库状态
//    List<WmsDocActEntity> getInstatusByDocNo(@Param("docNo") String docNo);
//}
