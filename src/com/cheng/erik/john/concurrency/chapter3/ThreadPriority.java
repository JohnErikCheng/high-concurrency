package com.cheng.erik.john.concurrency.chapter3;

/**
 * @ClassName ：ThreadPriority
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/20 10:28
 * @Description: 线程优先级。
 */
public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("t1");
            }
        });
        t1.setPriority(3);

        Thread t2 = new Thread(() -> {
            while (true) {
                System.out.println("t2");
            }
        });
        //原码表示，优先级不能大于10或者小于1
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
