package com.cheng.erik.john.concurrency.chapter2.ticket.ticket2;

/**
 * @ClassName ：TicketWindows
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 15:06
 * @Description: 叫号窗口.
 */
public class TicketWindows extends Thread {

    /**
     * 每日最大叫号数。
     */
    private static final Integer MAX_NUMBER = 50;

    private Integer current_number = 1;

    /**
     * 窗口名称。
     */
    private String windowsName;

    public TicketWindows(String windowsName) {
        this.windowsName = windowsName;
    }

    @Override
    public void run() {
        while (current_number <= MAX_NUMBER) {
            System.out.println("请" + current_number++ + "号到" + windowsName + "办理业务.");
        }
    }
}
