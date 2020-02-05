package com.cheng.erik.john.concurrency.chapter1.strategyAttern;

/**
 * @ClassName ：OperationSubstract
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 14:53
 * @Description: 减法运算。
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int numA, int numB) {
        return numA >= numB ? numA - numB : numB - numA;
    }
}
