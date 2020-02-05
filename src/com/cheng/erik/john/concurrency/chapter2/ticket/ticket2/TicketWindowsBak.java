package com.cheng.erik.john.concurrency.chapter2.ticket.ticket2;

/**
 * @ClassName ：TicketWindowsBak
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/19 15:19
 * @Description: 实现runnable接口。
 */
public class TicketWindowsBak implements Runnable {

    /**
     * 每日最大叫号数。
     */
    private static final Integer MAX_NUMBER = 50;

    private Integer current_number = 1;

    @Override
    public void run() {
        while (current_number <= MAX_NUMBER) {
            System.out.println("请" + current_number++ + "号到" + Thread.currentThread().getName() + "办理业务.");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
