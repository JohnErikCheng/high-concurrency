package com.cheng.erik.john.concurrency.chapter2.ticket;

/**
 * @ClassName ：TicketWindows
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/16 14:51
 * @Description: 业务窗口.
 */
public class TicketWindows extends Thread {

    /**
     * 起始号.
     */
    private static Integer index = 1;

    /**
     * 最大号.
     */
    private static final Integer MAX = 500;

    /**
     * 窗口号.
     */
    public String windowsName;

    public TicketWindows(String windowsName) {
        this.windowsName = windowsName;
    }

    @Override
    public void run() {
        synchronized (this) {
            while (index <= MAX) {
                System.out.println("请" + index++ + "号到" + windowsName + "办理业务。");
            }
        }
    }
}
