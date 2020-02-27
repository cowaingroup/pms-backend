package com.cowain.pms;

import org.junit.Test;

public class DaemonThreadDemo {
    public class dem implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("线程第" + i + "次执行");
            }
            Thread childThread=new Thread(new Runnable(){
                @Override
                public void run() {
                    System.out.println("子线程执行,当前线程是否守护线程" + Thread.currentThread().isDaemon());
                }
            });
            childThread.start();
        }
    }

    @Test
    public void ThreadDemo2(){
        Thread mainThread=new Thread(new dem());
        mainThread.setDaemon(true);
        mainThread.start();
        // isDaemon()方法查看当前线程是不是守护线程
        if (mainThread.isDaemon()) {
            System.out.println("当前执行的是守护线程");
        } else {
            System.out.println("当前执行的是非守护线程");
        }

    }

    @Test
    public void ThreadDemo() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行,当前线程是否是守护线程"+Thread.currentThread().isDaemon());
            }
        });
        thread.start();
    }

}
