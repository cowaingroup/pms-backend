package com.cowain.pms.rocketmq.producer;

import org.apache.rocketmq.client.exception.MQClientException;

/**
 * MQ生产者接口

 */
public interface MqProducer {

    void start() throws MQClientException;

    void shutdown();
}
