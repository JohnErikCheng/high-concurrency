package com.cheng.erik.john.concurrency.chapter2.ticket;

/**
 * @ClassName ：HandleBusiness
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/16 15:04
 * @Description: 办理业务优化。
 */
public class HandleBusinessImprovement {
    public static void main(String[] args) {
        TicketWindowsImprovement thread = new TicketWindowsImprovement();
        new Thread(thread, "一号窗口").start();
        new Thread(thread, "二号窗口").start();
        new Thread(thread, "三号窗口").start();
        new Thread(thread, "四号窗口").start();
    }
}
