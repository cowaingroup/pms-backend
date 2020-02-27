package com.cowain.pms.modules.pms.service;

import com.baomidou.mybatisplus.service.IService;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.modules.pms.entity.PmsDictEntity;
import com.cowain.pms.modules.pms.entity.PmsPushMsgEntity;

import java.util.List;
import java.util.Map;

public interface PmsPushMsgService extends IService<PmsPushMsgEntity> {
    List<PmsDictEntity> queryPushWays();

    List<PmsDictEntity> queryPushTimes();

    List<PmsDictEntity> queryPushRanges();

    List<PmsDictEntity> queryPushModes();


    PageUtils select(Map<String, Object> params);

    Integer queryPushMode(String pushModes);

    Integer queryPushRange(String pushRanges);

    Integer queryPushTime(String pushTimes);

    Integer queryPushWay(String pushWays);

    Integer queryMsgType(Integer valueOf);
}
