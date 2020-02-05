package com.cheng.erik.john.concurrency.chapter3;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName ：ThreadIsInterrupted
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/20 11:20
 * @Description: 线程是否被打断。
 */
public class ThreadIsInterrupted {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    //do something,just empty loop
                }
            }
        };

        thread.start();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println("Thread is interrupted ? " + thread.isInterrupted());
        thread.interrupt();
        System.out.println("Thread is interrupted ? " + thread.isInterrupted());
    }
}
