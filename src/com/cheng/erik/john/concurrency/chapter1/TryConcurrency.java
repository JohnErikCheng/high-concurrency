package com.cheng.erik.john.concurrency.chapter1;

/**
 * @ClassName ：TryConcurrency
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/16 10:36
 * @Description: 试图多线程。
 */
public class TryConcurrency {

    /**
     * 遍历的总次数。
     */
    public static final Integer COUNT_TIMES = 10000;

    public static void main(String[] args) {

        new Thread() {
            @Override
            public void run() {
                /*for (int i = 1; i <= COUNT_TIMES; i++) {
                    println("Task A: " + i);
                }*/
                readDataFromDatabase();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                /*for (int j = 1; j <= COUNT_TIMES; j++) {
                    println("Task B: " + j);
                }*/
                writeDataToFile();
            }
        }.start();

    }

    /**
     * Read data from database and handled it.
     */
    public static void readDataFromDatabase() {
        println("Read data from database start.");
        try {
            Thread.sleep(1000 * 10L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("Read data from database and handled it.");
    }

    /**
     * Write data to file and handled it.
     */
    public static void writeDataToFile() {
        println("Write data to file start.");
        try {
            Thread.sleep(1000 * 10L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        println("Write data to file and handled it.");
    }

    /**
     * print message.
     *
     * @param message input message string.
     */
    public static void println(String message) {
        System.out.println(message);
    }
}
