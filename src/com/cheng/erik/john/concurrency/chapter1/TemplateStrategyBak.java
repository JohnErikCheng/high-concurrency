package com.cheng.erik.john.concurrency.chapter1;

/**
 * @ClassName ：TemplateStrategyBak
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 14:38
 * @Description: 模板策略self.
 */
public class TemplateStrategyBak {
    // 1、定义一个模板，包含两部分：可更改的部分和不可更改的部分
    // 2、重写模板中可更改的部分
    // 3、传入参数，进行打印

    public final void printMethod(String log) {
        System.out.println("###################");
        printLog(log);
        System.out.println("###################");
    }

    protected void printLog(String log) {
    }

    public static void main(String[] args) {
        TemplateStrategyBak tsb = new TemplateStrategyBak() {
            @Override
            protected void printLog(String log) {
                System.out.println(log);
            }
        };

        tsb.printMethod("This is log area.");

        TemplateStrategyBak tsb2 = new TemplateStrategyBak() {
            @Override
            protected void printLog(String log) {
                System.out.println(log);
            }
        };

        tsb2.printMethod("This is log area2.");
    }
}
