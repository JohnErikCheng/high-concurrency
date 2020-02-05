package com.cheng.erik.john.concurrency.chapter3;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

/**
 * @ClassName ：ThreadSleep
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/20 9:33
 * @Description: 线程sleep.
 */
public class ThreadSleep {
    public static void main(String[] args) {
        new Thread(() -> {
            long startTime = System.currentTimeMillis();
            sleep(2_000L);
            long endTime = System.currentTimeMillis();
            System.out.println(String.format("Total spend %d ms", (endTime - startTime)));
        }).start();

        long startTime = System.currentTimeMillis();

        sleep(3_000L);

        long endTime = System.currentTimeMillis();

        System.out.println(String.format("Main thread total spend %d ms", (endTime - startTime)));

        /**
         * 使用TimeUnit进行设置sleep.
         */
        try {
            TimeUnit.HOURS.sleep(2);
            TimeUnit.MINUTES.sleep(24);
            TimeUnit.SECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
