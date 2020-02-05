package com.cheng.erik.john.concurrency.chapter2.tax;

/**
 * @ClassName ：TaxStategyImpl
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/25 11:33
 * @Description:
 */
public class TaxStategyImpl implements TaxStrategy {
    @Override
    public Double calculate(Double salary, Double bonus) {
        return salary * 0.2 + bonus * 0.2;
    }
}
