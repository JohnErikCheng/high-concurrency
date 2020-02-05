package com.cheng.erik.john.concurrency.chapter1.strategyAttern;

/**
 * @ClassName ：OperationMutiply
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 14:54
 * @Description: 乘法运算。
 */
public class OperationMutiply implements Strategy {
    @Override
    public int doOperation(int numA, int numB) {
        return numA * numB;
    }
}
