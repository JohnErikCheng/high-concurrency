package com.cheng.erik.john.concurrency.chapter4.deadlock;

/**
 * @ClassName ：OtherService
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/2/3 22:44
 * @Description:
 */
public class OtherService {
    private DeadLock deadLock;

    private final Object lock = new Object();

    public void s1() {
        synchronized (lock) {
            System.out.println("S1================");
        }
    }

    public void s2() {
        synchronized (lock) {
            System.out.println("S2================");
            deadLock.m2();
        }
    }

    public void setDeadLock(DeadLock deadLock) {
        this.deadLock = deadLock;
    }
}
