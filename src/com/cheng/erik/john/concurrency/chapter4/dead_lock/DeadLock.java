package com.cheng.erik.john.concurrency.chapter4.dead_lock;

/**
 * @ClassName ：DeadLock
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/2/3 22:44
 * @Description: 死锁。
 */
public class DeadLock {
    private final Object lock = new Object();

    private OtherService otherService;

    public DeadLock(OtherService otherService) {
        this.otherService = otherService;
    }

    public void m1() {
        synchronized (lock) {
            System.out.println("M1================");
            otherService.s1();
        }
    }

    public void m2() {
        synchronized (lock) {
            System.out.println("M2================");
        }
    }
}
