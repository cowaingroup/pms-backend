package com.cowain.pms.modules.pms.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.modules.pms.dao.PmsAlarmDao;
import com.cowain.pms.modules.pms.dto.PmsAlarmEntityDto;
import com.cowain.pms.modules.pms.entity.PmsAlarmEntity;
import com.cowain.pms.modules.pms.entity.PmsDictEntity;
import com.cowain.pms.modules.pms.entity.PmsPushMsgEntity;
import com.cowain.pms.modules.pms.service.PmsAlarmService;
import com.cowain.pms.modules.pms.vo.PmsAlarmVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("pmsAlarmService")
public class PmsAlarmServiceImpl extends ServiceImpl<PmsAlarmDao, PmsAlarmEntity> implements PmsAlarmService {

    @Override
    public List<PmsDictEntity> queryPariortys() {
        return baseMapper.queryPariortys();
    }

    @Override
    public List<PmsPushMsgEntity> queryMsgTypes() {
        return baseMapper.queryMsgTypes();
    }


    @Override
    public List<PmsDictEntity> queryDays() {
        return baseMapper.queryDays();
    }

    @Override
    public List<PmsDictEntity> queryAlarmCategorys() {
        return baseMapper.queryAlarmCategorys();
    }
    @Override
    public List<PmsDictEntity> queryUpgradeDays() {
        return queryDays();
    }

    @Override
    public void save(PmsAlarmEntity entity) {

        baseMapper.insert(entity);

    }
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page page = new Page(Integer.parseInt(String.valueOf(params.get("page"))),
                Integer.parseInt(String.valueOf(params.get("limit"))));

        page.setRecords(baseMapper.selectAlarmPageList(page, params));

        List<PmsAlarmEntityDto> list = new ArrayList<>();
        page.getRecords().forEach(pageDto -> {
            PmsAlarmVo vo = new PmsAlarmVo();
            BeanUtils.copyProperties(pageDto,vo);
            vo.setDay("≥ "+vo.getDay());
            vo.setUpgradeDay("≥ "+vo.getUpgradeDay());
            String[] days = vo.getDay().split(" ");
            String[] up = vo.getUpgradeDay().split(" ");
            vo.setDays(Integer.valueOf(days[1]));
            vo.setUpgradeDays(Integer.valueOf(up[1]));
            list.add(vo);
        });

        return new PageUtils(list, page.getTotal(), page.getCurrent(), page.getSize());
    }

    @Override
    public Integer queryMsgType(String msgTypes) {

        return baseMapper.queryMsgType(msgTypes);
    }

    @Override
    public Integer queryAlarmType(String alarmTypes) {
        return baseMapper.queryAlarmType(alarmTypes);
    }

    @Override
    public Integer queryPriority(String prioritys) {
        return baseMapper.queryPriority(prioritys);
    }

    @Override
    public Integer queryDay(Integer upgradeDays) {
        return baseMapper.queryDay(upgradeDays);
    }

}
