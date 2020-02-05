package com.cheng.erik.john.concurrency.chapter4.deadlock;

/**
 * @ClassName ：DeadLockTest
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/2/3 22:51
 * @Description:
 */
public class DeadLockTest {
    public static void main(String[] args) {

        OtherService otherService = new OtherService();
        DeadLock deadLock = new DeadLock(otherService);
        otherService.setDeadLock(deadLock);

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    deadLock.m1();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    otherService.s2();
                }
            }
        }.start();
    }
}
