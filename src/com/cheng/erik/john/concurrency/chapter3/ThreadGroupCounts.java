package com.cheng.erik.john.concurrency.chapter3;

/**
 * @ClassName ：ThreadGroupCounts
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/2/2 9:49
 * @Description: 获取ThreadGroup的总数。
 */
public class ThreadGroupCounts {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
            }
        };
        Thread thread = new Thread(new ThreadGroup("ThreadGroupName"), runnable);
        thread.start();
        System.out.println(thread.getThreadGroup().getName());

        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        Thread[] threads = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);
        for (Thread temp : threads) {
            System.out.println(temp);
        }

//        System.out.println(Thread.currentThread().getThreadGroup().activeCount());
    }
}
