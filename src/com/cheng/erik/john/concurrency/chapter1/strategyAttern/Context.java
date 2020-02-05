package com.cheng.erik.john.concurrency.chapter1.strategyAttern;

/**
 * @ClassName ：Context
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 14:56
 * @Description: 实现策略类。
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int numA, int numB) {
        return strategy.doOperation(numA, numB);
    }
}
