package com.cheng.erik.john.concurrency.chapter1;

/**
 * @ClassName ：TemplateStrategy
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 14:26
 * @Description: 模板策略。
 */
public class TemplateStrategy {
    /**
     * 打印方法。
     *
     * @param message
     */
    public final void print(String message) {
        System.out.println("####################");
        wrapPrint(message);
        System.out.println("####################");
    }

    /**
     * 模板中可更改的部分。
     *
     * @param message
     */
    protected void wrapPrint(String message) {
    }

    public static void main(String[] args) {
        TemplateStrategy ts = new TemplateStrategy() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("+++" + message + "+++");
            }
        };

        ts.print("Hello world");

        TemplateStrategy ts2 = new TemplateStrategy() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("***" + message + "***");
            }
        };

        ts2.print("Hello world");
    }
}
