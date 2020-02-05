package com.cheng.erik.john.concurrency.chapter3;

/**
 * @ClassName ：ThreadJoin
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/2/2 19:55
 * @Description: Thread的join方法。
 */
public class ThreadJoin {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread(new Gather("G1", 5_000L));
        Thread t2 = new Thread(new Gather("G2", 10_000L));
        Thread t3 = new Thread(new Gather("G3", 15_000L));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();

        System.out.printf("Save the data at time of [%s] and finished successful,cost [%s]ms.", endTime, (endTime - startTime));
    }
}

class Gather implements Runnable {

    private String machineName;
    private long spendTime;

    public Gather(String machineName, long spendTime) {
        this.machineName = machineName;
        this.spendTime = spendTime;
    }

    @Override
    public void run() {
        try {
            long startTime = System.currentTimeMillis();
            Thread.sleep(spendTime);
            long endTime = System.currentTimeMillis();
            System.out.printf(machineName + " obtain data at [%s] and finished at [%s]\n", startTime, endTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
