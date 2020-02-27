package com.cowain.pms;

import java.util.concurrent.Executors;

public class TestThread implements Runnable{

    @Override
    public void run(){
        System.out.println("执行子线程...");
    }

    public static void main(String[] args) {
        Runnable testRun=new TestThread();
        Thread thread=new Thread(testRun);
        thread.start();
        System.out.println("主线程...");
    }
//
//
//    public static void main(String [] arags) {
//
//        for (int k =0 ;k < 3;k++) {
//            new Runnable() {
//                @Override
//                public void run() {
//
//                }
//            }.run();
//
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }



}
