package com.cheng.erik.john.concurrency.chapter3;

/**
 * @ClassName ：ThreadCloseGraceFul
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/2/2 22:40
 * @Description: 线程优雅的关闭。
 */
public class ThreadCloseGraceFul {
    public static void main(String[] args) {
        Work work = new Work();
        work.start();
        long startTime = System.currentTimeMillis();

        try {
            Thread.sleep(5_000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        work.shutDown();
        long endTime = System.currentTimeMillis();
        System.out.println("This work cost:" + (endTime - startTime));
    }
}

class Work extends Thread {
    private volatile boolean start = true;

    @Override
    public void run() {
        while (start) {
            //working
        }
    }

    public void shutDown() {
        System.out.println("shutDown方法执行：" + this.start);
        this.start = false;
        System.out.println("shutDown方法完成：" + this.start);
    }
}
