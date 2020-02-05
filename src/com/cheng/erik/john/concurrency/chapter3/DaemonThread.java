package com.cheng.erik.john.concurrency.chapter3;

/**
 * @ClassName ：DaemonThread
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 17:18
 * @Description: 守护线程。
 */
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.setDaemon(true);
        thread.start();

        Thread.sleep(2_000L);
        System.out.println("Main thread finished lifecycle.");
        thread.setDaemon(true);
    }
}
