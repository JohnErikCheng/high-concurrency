package com.cheng.erik.john.concurrency.chapter3;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ：InterruptThreadExit
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/2/2 22:00
 * @Description: 线程中断退出。
 * 检查线程interrupt的标识来决定是否退出。
 */
public class InterruptThreadExit {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("I will start work");
                while (!isInterrupted()) {
                    //working
                }
                System.out.println("I will be exiting.");
            }
        };

        thread.start();
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("System will be shutdown");
        thread.interrupt();
    }
}
