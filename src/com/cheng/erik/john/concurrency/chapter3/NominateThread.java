package com.cheng.erik.john.concurrency.chapter3;

import java.util.stream.IntStream;

/**
 * @ClassName ：NominateThread
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 16:02
 * @Description: 为线程命名。
 */
public class NominateThread {

    private static final String PREFIX = "ALEX-";

    public static void main(String[] args) {
//        IntStream.range(0, 5).boxed().map(i -> new Thread(() -> System.out.println(Thread.currentThread().getName()))).forEach(Thread::start);
    }

    public static Thread createThread(final int intName) {
        return new Thread(() -> System.out.println(Thread.currentThread().getName()), PREFIX + intName);
    }
}
