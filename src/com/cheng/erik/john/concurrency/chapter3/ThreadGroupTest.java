package com.cheng.erik.john.concurrency.chapter3;

/**
 * @ClassName ：ThreadGroup
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 16:47
 * @Description: 线程所属组。
 */
public class ThreadGroupTest {
    public static void main(String[] args) {

        Thread t1 = new Thread("t1");

        ThreadGroup group = new ThreadGroup("Test");

        Thread t2 = new Thread(group, "t2");

        ThreadGroup mainThreadGroup = Thread.currentThread().getThreadGroup();
        System.out.println("Main thread belong group:" + mainThreadGroup.getName());

        System.out.println("Main thread group and t1 thread belong the same group:" + (mainThreadGroup == t1.getThreadGroup()));
        System.out.println("Main thread group and t2 thread belong the same group:" + (mainThreadGroup == t2.getThreadGroup()));

        System.out.println("t2 thread group belong the main test group:" + (group == t2.getThreadGroup()));
    }
}
