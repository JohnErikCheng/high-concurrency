package com.cheng.erik.john.concurrency.chapter3;

/**
 * @ClassName ：DefaultThreadPriority
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/20 10:44
 * @Description: 默认线程的优先级。
 */
public class DefaultThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        System.out.println("t1的优先级:" + t1.getPriority());

        Thread t2 = new Thread(() -> {
            Thread t3 = new Thread();
            System.out.println("t3的优先级：" + t3.getPriority());
        });
        t2.setPriority(7);
        t2.start();
        System.out.println("t2的优先级:" + t2.getPriority());

    }
}
