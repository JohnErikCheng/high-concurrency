package com.cheng.erik.john.concurrency.chapter2.ticket;

/**
 * @ClassName ：HandleBusiness
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/16 15:04
 * @Description: 办理业务。
 */
public class HandleBusiness {
    public static void main(String[] args) {
        new TicketWindows("一号窗口").start();
        new TicketWindows("二号窗口").start();
        new TicketWindows("三号窗口").start();
        new TicketWindows("四号窗口").start();
    }
}
