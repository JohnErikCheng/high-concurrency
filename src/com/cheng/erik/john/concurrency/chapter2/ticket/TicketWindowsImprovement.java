package com.cheng.erik.john.concurrency.chapter2.ticket;

/**
 * @ClassName ：TicketWindowsImprovement
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/16 15:11
 * @Description: 业务窗口改进。
 */
public class TicketWindowsImprovement implements Runnable {

    /**
     * 起始号.
     */
    private static Integer index = 1;

    /**
     * 最大号.
     */
    private static final Integer MAX = 500;

    @Override
    public void run() {
        synchronized (this) {
            while (index <= MAX) {
                System.out.println("请" + index++ + "号到" + Thread.currentThread().getName() + "办理业务。");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
