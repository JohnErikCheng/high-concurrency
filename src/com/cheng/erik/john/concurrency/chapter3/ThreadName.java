package com.cheng.erik.john.concurrency.chapter3;

import java.util.stream.IntStream;

/**
 * @ClassName ：ThreadName
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 15:53
 * @Description: 线程名称.
 */
public class ThreadName {
    public static void main(String[] args) {
        IntStream.range(0,5).boxed().map(i-> new Thread(()-> System.out.println(Thread.currentThread().getName()))).forEach(Thread::start);
    }
}
