package com.cheng.erik.john.concurrency.chapter1.strategyAttern;

/**
 * @ClassName ：OperationAdd
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 14:51
 * @Description: 加法运算。
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int numA, int numB) {
        return numA + numB;
    }
}
