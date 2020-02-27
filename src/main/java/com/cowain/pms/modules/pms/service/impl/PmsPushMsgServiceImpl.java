package com.cowain.pms.modules.pms.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.modules.pms.dao.PmsPushMsgDao;
import com.cowain.pms.modules.pms.dto.PmsPushMsgDto;
import com.cowain.pms.modules.pms.entity.PmsDictEntity;
import com.cowain.pms.modules.pms.entity.PmsPushMsgEntity;
import com.cowain.pms.modules.pms.service.PmsPushMsgService;
import com.cowain.pms.modules.pms.vo.PmsPushMsgVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("pmsPushMsgService")
public class PmsPushMsgServiceImpl extends ServiceImpl<PmsPushMsgDao,PmsPushMsgEntity>implements PmsPushMsgService {


    @Override
    public List<PmsDictEntity> queryPushWays() {
        return baseMapper.queryPushWays();
    }

    @Override
    public List<PmsDictEntity> queryPushTimes() {
        return baseMapper.queryPushTimes();
    }

    @Override
    public List<PmsDictEntity> queryPushRanges() {
        return baseMapper.queryPushRanges();
    }

    @Override
    public List<PmsDictEntity> queryPushModes() {
        return baseMapper.queryPushModes();
    }

    @Override
    public PageUtils select(Map<String, Object> params) {
       Page page = new Page(Integer.parseInt(String.valueOf(params.get("page"))),
               Integer.parseInt(String.valueOf(params.get("limit"))));

        page.setRecords(baseMapper.selectAlarmPageList(page, params));
        List<PmsPushMsgDto> list = new ArrayList<>();
        page.getRecords().forEach(pageDto -> {
            PmsPushMsgVo vo = new PmsPushMsgVo();
            BeanUtils.copyProperties(pageDto,vo);
            list.add(vo);
        });

        return new PageUtils(list, page.getTotal(), page.getCurrent(), page.getSize());
    }

    @Override
    public Integer queryPushMode(String pushModes) {
        return baseMapper.queryPushMode(pushModes);
    }

    @Override
    public Integer queryPushRange(String pushRanges) {
        return baseMapper.queryPushRange(pushRanges);
    }

    @Override
    public Integer queryPushTime(String pushTimes) {
        return baseMapper.queryPushTime(pushTimes);
    }

    @Override
    public Integer queryPushWay(String pushWays) {
        return baseMapper.queryPushWay(pushWays);
    }

    @Override
    public Integer queryMsgType(Integer value) {
        return baseMapper.queryMsgType(value);
    }
}
