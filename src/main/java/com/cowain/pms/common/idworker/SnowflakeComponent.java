package com.cowain.pms.common.idworker;

import org.springframework.stereotype.Component;

@Component
public class SnowflakeComponent {

    private final static long datacenterId=0L;

    private final static long workId=0L;


    private static volatile IdWorker instance;

    public IdWorker getInstance() {
        if (instance == null) {
            synchronized (IdWorker.class) {
                if (instance == null) {
                    instance = new IdWorker(workId, datacenterId);
                }
            }
        }
        return instance;
    }
}