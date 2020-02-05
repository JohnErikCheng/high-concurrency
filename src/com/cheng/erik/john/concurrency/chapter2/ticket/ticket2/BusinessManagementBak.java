package com.cheng.erik.john.concurrency.chapter2.ticket.ticket2;

/**
 * @ClassName ：BusinessManagementBak
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 15:20
 * @Description: 实现runnable接口。
 */
public class BusinessManagementBak {
    public static void main(String[] args) {
        TicketWindowsBak ticketWindowsBak = new TicketWindowsBak();
        new Thread(ticketWindowsBak, "一号窗口").start();
        new Thread(ticketWindowsBak, "二号窗口").start();
        new Thread(ticketWindowsBak, "三号窗口").start();
        new Thread(ticketWindowsBak, "四号窗口").start();
    }
}
