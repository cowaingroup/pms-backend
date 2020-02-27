package com.cowain.pms.modules.pms.service;


import com.baomidou.mybatisplus.service.IService;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.modules.pms.entity.PmsAlarmEntity;
import com.cowain.pms.modules.pms.entity.PmsDictEntity;
import com.cowain.pms.modules.pms.entity.PmsPushMsgEntity;

import java.util.List;
import java.util.Map;

public interface PmsAlarmService extends IService<PmsAlarmEntity> {
    List<PmsDictEntity> queryPariortys();

    List<PmsPushMsgEntity> queryMsgTypes();

    List<PmsDictEntity> queryUpgradeDays();

    List<PmsDictEntity> queryDays();

    List<PmsDictEntity> queryAlarmCategorys();

    void save(PmsAlarmEntity entity);


    Integer queryDay(Integer upgradeDays);

    Integer queryMsgType(String msgTypes);

    Integer queryAlarmType(String alarmTypes);

    Integer queryPriority(String prioritys);

    PageUtils queryPage(Map<String, Object> params);
}
