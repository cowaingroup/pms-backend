//package com.cowain.pms.modules.job.service.impl;
//
//import com.baomidou.mybatisplus.mapper.EntityWrapper;
//import com.baomidou.mybatisplus.plugins.Page;
//import com.baomidou.mybatisplus.service.impl.ServiceImpl;
//import com.cowain.pms.common.utils.PageUtils;
//import com.cowain.pms.common.utils.Query;
//import com.cowain.pms.modules.job.dao.ScheduleJobDao;
//import com.cowain.pms.modules.job.entity.ScheduleJobEntity;
//import com.cowain.pms.modules.job.entity.ScheduleJobLogEntity;
//import com.cowain.pms.modules.job.service.ScheduleJobService;
//import com.cowain.pms.modules.job.utils.ScheduleUtils;
//import org.apache.commons.lang.StringUtils;
//import org.quartz.CronTrigger;
//import org.quartz.Scheduler;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.PostConstruct;
//import java.util.List;
//import java.util.Map;
//
//@Service("jobService")
//public class JobService extends ServiceImpl<ScheduleJobDao, ScheduleJobEntity>   {
//
//    private Logger logger = LoggerFactory.getLogger(getClass());
//
//    @Autowired
//    private Scheduler scheduler;
//
//
//    @PostConstruct
//    public void init(){
//       logger.info("》》》》》》》》 开始注入启动----- JobService ");
//    }
//
//    public void queryPage() {
//        logger.info("》》》》》》》》 开始执行定时任务 ");
//    }
//}