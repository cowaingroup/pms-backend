package com.cowain.pms.modules.pms.controller;

import com.cowain.pms.common.annotation.SysLog;
import com.cowain.pms.common.utils.PageUtils;
import com.cowain.pms.common.utils.R;
import com.cowain.pms.common.validator.ValidatorUtils;
import com.cowain.pms.modules.pms.dto.PmsPushMsgDto;
import com.cowain.pms.modules.pms.entity.PmsDictEntity;
import com.cowain.pms.modules.pms.entity.PmsPushMsgEntity;
import com.cowain.pms.modules.pms.service.impl.PmsPushMsgServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.cowain.pms.common.utils.ShiroUtils.getUserId;


@RestController
@RequestMapping("pms/msg")
public class PmsPushMsgController {

    @Autowired
    private PmsPushMsgServiceImpl msgService;

    @SysLog("查询信息")
    @RequestMapping("/queryMsg")
    public R queryMsg(){

       List<PmsDictEntity> pushTimes =  msgService.queryPushTimes();
       List<PmsDictEntity> pushWays =  msgService.queryPushWays();
       List<PmsDictEntity> pushRanges =  msgService.queryPushRanges();
       List<PmsDictEntity> pushModes =  msgService.queryPushModes();
        return R.ok()
                .put("pushTimes",pushTimes)
                .put("pushWays",pushWays)
                .put("pushRanges",pushRanges)
                .put("pushModes",pushModes);
    }


    @SysLog("新增消息规则")
    @PostMapping("save")
        public R save(@RequestBody PmsPushMsgDto msgDto){
        PmsPushMsgEntity entity = new PmsPushMsgEntity();
        entity.setMsgType(msgDto.getMsgType());
        entity.setInsertTime(new Date());
        entity.setPushMode(Integer.valueOf(msgDto.getPushModes()));
        entity.setPushRange(Integer.valueOf(msgDto.getPushRanges()));
        entity.setPushTime(Integer.valueOf(msgDto.getPushTimes()));
        entity.setPushWay(Integer.valueOf(msgDto.getPushWays()));
        entity.setId(msgDto.getId());
        entity.setInsertUser(getUserId());
        ValidatorUtils.validateEntity(entity);
        msgService.insert(entity);
        return R.ok();
    }


    @SysLog("修改消息规则")
    @PostMapping("/update")
    public R updateMsg(@RequestBody PmsPushMsgDto msgDto){
        PmsPushMsgEntity entity = new PmsPushMsgEntity();
        entity.setInsertTime(new Date());
        entity.setPushMode(msgService.queryPushMode(msgDto.getPushModes()));
        entity.setPushRange(msgService.queryPushRange(msgDto.getPushRanges()));
        entity.setPushTime(msgService.queryPushTime(msgDto.getPushTimes()));

        if (msgDto.getPushWays().contains("0")){
            entity.setPushWay(Integer.valueOf(msgDto.getPushWays()));
        }else {
            entity.setPushWay(msgService.queryPushWay(msgDto.getPushWays()));
        }
        entity.setMsgType(msgDto.getMsgType());
        entity.setId(msgDto.getId());
        ValidatorUtils.validateEntity(entity);
        msgService.updateById(entity);
        return R.ok();
    }

    @GetMapping("/list")
    public R select(@RequestParam Map<String,Object>params){

        PageUtils page = msgService.select(params);

        return R.ok().put("page",page);
    }
}
