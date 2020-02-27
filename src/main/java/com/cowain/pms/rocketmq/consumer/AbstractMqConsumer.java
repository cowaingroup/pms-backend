package com.cowain.pms.rocketmq.consumer;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


/**
 * MQ消费者抽象类
 */
public abstract class AbstractMqConsumer {

    protected DefaultMQPushConsumer consumer;
    // 是否允许顺序消费
    //protected boolean isOrderConsumer = false;
    abstract void start0();

    @PostConstruct
    private void start() {
        if (null == consumer) {
            start0();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(10000L);
                    consumer.start();
                    System.err.println("=>>>>>>>>>>>>>>>>.>>>>>>>>>>>>>>rocketmq consumer server is starting..."+consumer.getConsumerGroup()+":"+Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @PreDestroy
    public void shutdown() {
        consumer.shutdown();
    }
}
