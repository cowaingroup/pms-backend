package com.cowain.pms.modules.pms.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.cowain.pms.modules.pms.dto.PmsPushMsgDto;
import com.cowain.pms.modules.pms.entity.PmsDictEntity;
import com.cowain.pms.modules.pms.entity.PmsPushMsgEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PmsPushMsgDao extends BaseMapper<PmsPushMsgEntity> {
    List<PmsDictEntity> queryPushWays();

    List<PmsDictEntity> queryPushTimes();

    List<PmsDictEntity> queryPushRanges();

    List<PmsDictEntity> queryPushModes();

    List<PmsPushMsgDto> selectAlarmPageList(Page page, Map<String, Object> params);

    Integer queryPushMode(String pushModes);

    Integer queryPushRange(String pushRanges);

    Integer queryPushTime(String pushTimes);

    Integer queryPushWay(String pushWays);

    Integer queryMsgType(Integer value);
}
