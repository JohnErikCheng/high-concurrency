package com.cheng.erik.john.concurrency.chapter3;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ：ThreadIsInterruptrd2
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/20 11:32
 * @Description: 线程是否被打断升级。
 */
public class ThreadIsInterruptrd2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        TimeUnit.MINUTES.sleep(1);
                    } catch (InterruptedException e) {
                        System.out.println("I am be interrupted1 ?" + isInterrupted());
                    }
                }
            }
        };

        thread.setDaemon(true);
        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println("Thread is interrupted2 ?" + thread.isInterrupted());
        thread.interrupt();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println("Thread is interrupted ?" + thread.isInterrupted());
    }
}
