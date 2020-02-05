package com.cheng.erik.john.concurrency.chapter3;

import java.util.stream.IntStream;

/**
 * @ClassName ：ThreadYield
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/20 10:18
 * @Description: 线程yield.
 */
public class ThreadYield {
    public static void main(String[] args) {
        IntStream.range(0, 2).mapToObj(ThreadYield::create).forEach(Thread::start);
    }

    private static Thread create(int index) {
        return new Thread(() -> {
            if (index == 0)
                Thread.yield();
            System.out.println(index);
        });
    }
}
