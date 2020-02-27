package com.cowain.pms;

import com.cowain.pms.common.utils.SnowflakeIdWorker;

public class TestGenerateId {

    public static void main(String [] args) {

        for(int k = 0;k < 100; k++) {
            System.out.println(SnowflakeIdWorker.generateGlobalId());
        }

    }
}
