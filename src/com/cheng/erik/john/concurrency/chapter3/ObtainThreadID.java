package com.cheng.erik.john.concurrency.chapter3;

/**
 * @ClassName ：ObtainThreadID
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/20 10:49
 * @Description: 获取线程的ID。
 */
public class ObtainThreadID {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() == this);
            }
        };
        thread.start();

        String name = Thread.currentThread().getName();
        System.out.println("main".equals(name));
        System.out.println(thread.getName());
        System.out.println(Thread.currentThread().getName());
    }
}
