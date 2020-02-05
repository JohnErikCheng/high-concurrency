package com.cheng.erik.john.concurrency.chapter1.strategyAttern;

/**
 * @ClassName ：Strategy
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 14:49
 * @Description: 策略接口。
 */
public interface Strategy {
    int doOperation(int numA, int numB);
}
