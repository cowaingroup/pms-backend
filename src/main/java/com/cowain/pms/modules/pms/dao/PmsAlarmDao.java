package com.cowain.pms.modules.pms.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.cowain.pms.modules.pms.dto.PmsAlarmEntityDto;
import com.cowain.pms.modules.pms.entity.PmsAlarmEntity;
import com.cowain.pms.modules.pms.entity.PmsDictEntity;
import com.cowain.pms.modules.pms.entity.PmsPushMsgEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PmsAlarmDao extends BaseMapper<PmsAlarmEntity> {

    List<PmsDictEntity> queryPariortys();

    List<PmsPushMsgEntity> queryMsgTypes();


    List<PmsDictEntity> queryDays();

    List<PmsDictEntity> queryAlarmCategorys();

    List<PmsAlarmEntityDto> selectAlarmPageList(Page page, Map<String, Object> params);

    Integer queryMsgType(String msgTypes);

    Integer queryAlarmType(String alarmTypes);

    Integer queryDay(Integer upgradeDays);

    Integer queryPriority(String prioritys);
}
