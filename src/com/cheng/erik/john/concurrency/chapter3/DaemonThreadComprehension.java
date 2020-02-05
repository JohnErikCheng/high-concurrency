package com.cheng.erik.john.concurrency.chapter3;

/**
 * @ClassName ：DaemonThreadComprehension
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/2/2 11:08
 * @Description: 守护线程理解
 */
public class DaemonThreadComprehension {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                Thread innerThread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            sleep(100_000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                };

                innerThread.setDaemon(true);
                System.out.println("innerThread 线程启动.");
                innerThread.start();
                System.out.println("innerThread 线程结束.");
            }
        };

        System.out.println("Thread-0 线程启动.");
        thread.start();
        System.out.println("Thread-0 线程结束.");
    }
}
