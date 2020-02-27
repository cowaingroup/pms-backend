//package com.cowain.pms.rocketmq.consumer;
//
//import com.cowain.pms.modules.wms.entity.enterentity.WmsPublishTaskEntity;
//import com.cowain.pms.modules.wms.service.enterservice.WcsRequeslogService;
//import com.cowain.pms.modules.wms.service.enterservice.WmsPublishTaskService;
//import com.cowain.pms.modules.wms.syn.TaskDocType;
//import com.cowain.pms.modules.wms.syn.requestParam;
//import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
//import org.apache.rocketmq.client.consumer.listener.*;
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
//import org.apache.rocketmq.common.message.MessageExt;
//import org.apache.rocketmq.common.protocol.heartbeat.MessageModel;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//import com.cowain.pms.common.http.ApacheHttpClient;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
///**
// * WCS测试消费者
// */
//@Component
//public class WcsConsumer extends AbstractMqConsumer {
//
//    @Value("${rocketmq.consumer.groupName}")
//    private String consumerGroup;
//
//    @Value("${rocketmq.consumer.namesrvAddr}")
//    private String namesrvAddr;
//
//    @Value("${rocketmq.consumer.wcsInstanceName}")
//    private String instanceName;
//
//    // 是否允许顺序消费
//    protected boolean isOrderConsumer = false;
//
//    @Autowired
//    WmsPublishTaskService wmsPublishTaskService;
//    @Autowired
//    private WcsRequeslogService wcsRequeslogService;
//
//    @Override
//    void start0() {
//        try {
//            consumer = new DefaultMQPushConsumer(consumerGroup);
//            consumer.setNamesrvAddr(namesrvAddr);
//            //consumer.setInstanceName(instanceName);
//            consumer.setMessageModel(MessageModel.CLUSTERING);
//            consumer.setConsumeMessageBatchMaxSize(1);
//            consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
//            consumer.subscribe("taskaa", "*");
//            consumeMessage();
//        } catch (MQClientException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    void consumeMessage() {
//
//        if (isOrderConsumer) {
//            consumer.registerMessageListener(new MessageListenerOrderly() {
//                @Override
//                //有序消费
//                public ConsumeOrderlyStatus consumeMessage(List<MessageExt> msgs, ConsumeOrderlyContext consumeOrderlyContext) {
//                    try {
//                        consumeOrderlyContext.setAutoCommit(true);
//                        //消费消息
//                        for(MessageExt me : msgs) {
//                            System.out.print("msg=" + new String(me.getBody()) + "\n");
//                        }
//                    } catch (Throwable e) {
//                        e.printStackTrace();
//                        return ConsumeOrderlyStatus.SUSPEND_CURRENT_QUEUE_A_MOMENT;
//                    }
//                    return ConsumeOrderlyStatus.SUCCESS;
//                }
//            });
//        }
//        else {
//            //并发消费
//            consumer.registerMessageListener(new MessageListenerConcurrently() {
//                @Override
//                public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
//                    try {
//                        for(MessageExt me : msgs) {
//                            String taskId=new String(me.getBody());
//                            int id=Integer.parseInt(taskId);
//                            WmsPublishTaskEntity wmsPublishTaskEntity=wmsPublishTaskService.selectById(id);
//                            Map<String, Object> param = new HashMap<>();
//                            param.put("wmsDocNo", wmsPublishTaskEntity.getWmsDocNo());
//                            param.put("type",wmsPublishTaskEntity.getType());
//                            param.put("erpDocNo", wmsPublishTaskEntity.getErpDocNo() == null ? "" : wmsPublishTaskEntity.getErpDocNo());
//                            param.put("globalId", wmsPublishTaskEntity.getGlobalId());
//                            param.put("taskNo", wmsPublishTaskEntity.getTaskNo());
//                            ApacheHttpClient httpClient = ApacheHttpClient.getDefaultInstance();
//                            if (wmsPublishTaskEntity.getType() == TaskDocType.FORMAL_IN.getStatus()) {
//                                //记录请求日志
//                                wcsRequeslogService.saveMqRequestLog(param, requestParam.WCS_REQUEST_URL,consumer.getNamesrvAddr());
//                                String response = httpClient.post(requestParam.WCS_REQUEST_URL, param);
//                                //记录响应日志
//                                wcsRequeslogService.saveMqResponseLog(response, wmsPublishTaskEntity,me.getMsgId());
//                            } else if (wmsPublishTaskEntity.getType() == TaskDocType.FORMAL_OUT.getStatus()) {
//                                wcsRequeslogService.saveMqRequestLog(param, requestParam.WCS_OUT_REQUEST_URL,consumer.getNamesrvAddr());
//                                String response = httpClient.post(requestParam.WCS_OUT_REQUEST_URL, param);
//                                //记录响应日志
//                                wcsRequeslogService.saveMqResponseLog(response, wmsPublishTaskEntity,me.getMsgId());
//                            }
//                            System.out.print(new String(me.getBody()) + "\n");
//                            System.out.println("消息已被" + consumer + "消费=====================================");
//                            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//                        }
//                    } catch (Throwable e) {
//                        e.printStackTrace();
//                        return ConsumeConcurrentlyStatus.RECONSUME_LATER;
//                    }
//
//                    return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//                }
//            });
//        }
//
//    }
//}
