package com.cowain.pms.rocketmq.producer;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public abstract class AbstractMqProducer implements MqProducer{
    protected DefaultMQProducer producer;

    @PostConstruct
    public abstract void start() throws MQClientException;

    @Override
    @PreDestroy
    public void shutdown() {
        System.err.println("AbstractMqProducer @PreDestroy调用");
        producer.shutdown();
    }
}
