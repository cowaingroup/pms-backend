package com.cowain.pms;

public class TestEntity {

    public static void main(String [] arags) {

        for (int k =0 ;k < 3;k++) {
            new Runnable() {
                @Override
                public void run() {

                }
            }.run();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }



}
