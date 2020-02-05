package com.cheng.erik.john.concurrency.chapter1.strategyAttern;

/**
 * @ClassName ：StrategyPatternDemo
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 14:59
 * @Description: 测试策略模式。
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context contextAdd = new Context(new OperationAdd());
        System.out.println("两数之和：" + contextAdd.executeStrategy(50, 100));

        Context contextSubstract = new Context(new OperationSubstract());
        System.out.println("两数之差：" + contextSubstract.executeStrategy(50, 100));

        Context contextMutiply = new Context(new OperationMutiply());
        System.out.println("两数之积：" + contextMutiply.executeStrategy(50, 100));
    }
}
