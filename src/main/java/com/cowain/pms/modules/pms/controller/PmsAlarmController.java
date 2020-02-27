package com.cowain.pms.modules.pms.controller;


import com.cowain.pms.common.annotation.SysLog;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.common.utils.R;
import com.cowain.pms.common.validator.ValidatorUtils;
import com.cowain.pms.modules.pms.dto.PmsAlarmEntityDto;
import com.cowain.pms.modules.pms.entity.PmsAlarmEntity;
import com.cowain.pms.modules.pms.entity.PmsDictEntity;
import com.cowain.pms.modules.pms.entity.PmsPushMsgEntity;
import com.cowain.pms.modules.pms.service.impl.PmsAlarmServiceImpl;
import com.cowain.pms.modules.pms.service.impl.PmsPushMsgServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.cowain.pms.common.utils.ShiroUtils.getUserId;

@RestController
@RequestMapping("pms/alarm")
public class PmsAlarmController {

    @Autowired
    private PmsAlarmServiceImpl alarmService;

    @Autowired
    private PmsPushMsgServiceImpl msgService;

    @SysLog("查询预警参数")
    @RequestMapping("/queryAlarmPar")
    public R queryAlarmPar(){

       List<PmsDictEntity> prioritys =  alarmService.queryPariortys();
       List<PmsPushMsgEntity> msgTypes =  alarmService.queryMsgTypes();
       List<PmsDictEntity> upgradeDays =  alarmService.queryUpgradeDays();
       List<PmsDictEntity> days =  alarmService.queryDays();
       List<PmsDictEntity> alarmCategorys =  alarmService.queryAlarmCategorys();

        return R.ok()
                .put("prioritys",prioritys)
                .put("msgTypes",msgTypes)
                .put("upgradeDays",upgradeDays)
                .put("days",days)
                .put("alarmCategorys",alarmCategorys);
    }

    @SysLog("新增预警")
    @PostMapping("/save")
    public R save(@RequestBody PmsAlarmEntityDto entityDto){

        PmsAlarmEntity entity = new PmsAlarmEntity();
        entity.setInsertUser(getUserId());
        entity.setInsertTime(new Date());
        entity.setMsgType(msgService.queryMsgType(Integer.valueOf(entityDto.getMsgTypes())));
        entity.setAlarmType(Integer.valueOf(entityDto.getAlarmTypes()));
        entity.setPriority(Integer.valueOf(entityDto.getPrioritys()));
        entity.setId(entityDto.getId());
        entity.setRuleName(entityDto.getRuleName());
        entity.setDays(entityDto.getDays());
        entity.setUpgradeDays(entityDto.getUpgradeDays());
        ValidatorUtils.validateEntity(entity);
        alarmService.save(entity);
        return R.ok();
    }

    @SysLog("修改预警")
    @PostMapping("/update")
    public R update(@RequestBody PmsAlarmEntityDto entityDto){

        PmsAlarmEntity entity = new PmsAlarmEntity();
        Integer [] arr = {2,4,8,12,24,48};
        boolean day = Arrays.asList(arr).contains(entityDto.getDays());
        boolean up = Arrays.asList(arr).contains(entityDto.getUpgradeDays());
        if (day != false){
           entity.setDays(alarmService.queryDay(entityDto.getUpgradeDays()));
        }else {
            entity.setDays(entityDto.getDays());
        }
        if (up == true){
            entity.setUpgradeDays(alarmService.queryDay(entityDto.getUpgradeDays()));
        }else {
            entity.setUpgradeDays(entityDto.getUpgradeDays());
        }

//        entity.setMsgType(alarmService.queryMsgType(entityDto.getMsgTypes()));
        entity.setMsgType(msgService.queryMsgType(Integer.valueOf(entityDto.getMsgTypes())));
        entity.setAlarmType(alarmService.queryAlarmType(entityDto.getAlarmTypes()));
        entity.setPriority(alarmService.queryPriority(entityDto.getPrioritys()));
        entity.setId(entityDto.getId());
        entity.setRuleName(entityDto.getRuleName());
        entity.setInsertUser(getUserId());
        entity.setInsertTime(new Date());
        ValidatorUtils.validateEntity(entity);
        alarmService.updateById(entity);

        return R.ok();
    }


    @GetMapping("list")
    public R select(@RequestParam Map<String,Object>params){

      PageUtils page = alarmService.queryPage(params);
        return R.ok().put("page",page);
    }
}
