package com.cheng.erik.john.concurrency.chapter3;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ：ThreadSecondInterrupt
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/22 0:25
 * @Description: 线程第二次被打断。
 */
public class ThreadSecondInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.interrupted());

                }
            }
        };

        thread.setDaemon(true);
        thread.start();

        TimeUnit.SECONDS.sleep(2);
        thread.interrupt();
    }
}
