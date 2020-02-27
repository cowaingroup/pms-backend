//package com.cowain.pms.rocketmq.producer;
//
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.client.producer.DefaultMQProducer;
//import org.apache.rocketmq.client.producer.SendCallback;
//import org.apache.rocketmq.client.producer.SendResult;
//import org.apache.rocketmq.common.message.Message;
//import org.apache.rocketmq.remoting.common.RemotingHelper;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import java.io.UnsupportedEncodingException;
//
///**
// * 生产者
// *
// * 利用SpringBoot的特性，首先将其注解Component，让Spring容器接管这个实例
//
// */
//@Component
//public class TaskProducer extends AbstractMqProducer{
//
//    @Value("${rocketmq.producer.groupName}")
//    private String producerGroup;
//
//    @Value("${rocketmq.producer.namesrvAddr}")
//    private String namesrvAddr;
//
//    @Value("${rocketmq.producer.instanceName}")
//    private String instanceName;
//
//    @Value("${rocketmq.producer.delayLevel}")
//    private int delayLevel;
//
//    @Override
//    public void start() throws MQClientException {
//        if (null == producer) {
//            producer = new DefaultMQProducer(producerGroup);
//            producer.setNamesrvAddr(namesrvAddr);
//            producer.setInstanceName(instanceName);
//        }
//        producer.start();
//        System.err.println("====================>rocketmq producer is starting...");
//        System.out.println("====================>rocketmq namesrvAddr is"+namesrvAddr);
//        System.out.println("====================>rocketmq producerGroup is"+producerGroup);
//        System.out.println("====================>rocketmq instanceName is"+instanceName);
//        System.out.println("====================>rocketmq producer is"+producer);
//    }
//
//    //发送同步消息
//    public boolean sendSyncMessage(String topic, String tag, String msg,boolean isDelay) {
//        try {
//            Message message = new Message(topic, tag, msg.getBytes(RemotingHelper.DEFAULT_CHARSET));
//            if(isDelay){
//                message.setDelayTimeLevel(delayLevel);
//            }
//            SendResult sendResult = producer.send(message);
//            System.err.println("消息生产结果：" + sendResult);
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    //发送异步消息
//    public void senAsyncMessage( String topic, String tag, String msgs,boolean isDelay) throws Exception {
//        try {
//            Message msg = new Message(topic, tag, msgs.getBytes(RemotingHelper.DEFAULT_CHARSET));
//            if(isDelay){
//                msg.setDelayTimeLevel(delayLevel);
//            }
//            producer.send(msg, new SendCallback() {
//                @Override
//                public void onSuccess(SendResult sendResult) {
//                    System.out.printf("消息生产结果", sendResult.getMsgId());
//                }
//                @Override
//                public void onException(Throwable e) {
//                    System.out.printf("消息生产结果", e);
//                    e.printStackTrace();
//                }
//            });
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//    }
//
//    //单项发送消息
//    public void sendOneWayMessage(String topic,String tag,String msgs,boolean isDelay) throws Exception {
//        try{
//            Message msg = new Message(topic,tag,msgs.getBytes(RemotingHelper.DEFAULT_CHARSET));
//            if(isDelay){
//                msg.setDelayTimeLevel(delayLevel);
//            }
//            producer.sendOneway(msg);
//        }catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
