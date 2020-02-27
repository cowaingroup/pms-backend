//package com.cowain.pms.rocketmq.consumer;
//
//import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
//import org.apache.rocketmq.client.consumer.listener.*;
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
//import org.apache.rocketmq.common.message.MessageExt;
//import org.apache.rocketmq.common.protocol.heartbeat.MessageModel;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//
///**
// * WCS测试消费者
// */
//@Component
//public class PdaConsumer extends AbstractMqConsumer {
//
//    @Value("${rocketmq.consumer.groupName}")
//    private String consumerGroup;
//
//    @Value("${rocketmq.consumer.namesrvAddr}")
//    private String namesrvAddr;
//
//    @Value("${rocketmq.consumer.pdaInstanceName}")
//    private String instanceName;
//
//    // 是否允许顺序消费
//    protected boolean isOrderConsumer = false;
//
//    @Override
//    void start0() {
//        try {
//            consumer = new DefaultMQPushConsumer(consumerGroup);
//            consumer.setNamesrvAddr(namesrvAddr);
//            consumer.setInstanceName(instanceName);
//            consumer.setMessageModel(MessageModel.BROADCASTING);
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
//                            System.out.print(new String(me.getBody()) + "\n");
//                            System.out.println("消息已被"+consumer+"消费=====================================");
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
