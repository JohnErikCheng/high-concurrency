package com.cheng.erik.john.concurrency.chapter3;

/**
 * @ClassName ：ThreadCloseGraceFul2
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/2/3 20:09
 * @Description: 优雅的结束线程。
 */
public class ThreadCloseGraceFul2 {
    public static void main(String[] args) {
        Works work = new Works();
        work.start();

        try {
            Thread.sleep(3_000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        work.interrupt();
    }
}

class Works extends Thread {
    @Override
    public void run() {
        while (true) {
            if (Thread.interrupted()) {
                break; //return
            }
        }
        System.out.println("breaked and to here");
    }
}
