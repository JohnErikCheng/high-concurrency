package com.cheng.erik.john.concurrency.chapter2.ticket.ticket2;

/**
 * @ClassName ：BusinessManagement
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 15:17
 * @Description: 业务办理。
 */
public class BusinessManagement {
    public static void main(String[] args) {
        new TicketWindows("一号窗口").start();
        new TicketWindows("二号窗口").start();
        new TicketWindows("三号窗口").start();
        new TicketWindows("四号窗口").start();
    }
}
