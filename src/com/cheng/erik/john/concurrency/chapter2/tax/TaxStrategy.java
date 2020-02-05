package com.cheng.erik.john.concurrency.chapter2.tax;

/**
 * @ClassName ：TaxStrategy
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/25 11:27
 * @Description: 税务策略。
 */
public interface TaxStrategy {
    /**
     * 计算税务接口。
     *
     * @param salary 薪资
     * @param bonus  奖金
     * @return
     */
    Double calculate(Double salary, Double bonus);
}
