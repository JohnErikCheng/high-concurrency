package com.cheng.erik.john.concurrency.chapter3.task;

/**
 * @ClassName ：ThreadService
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/2/3 20:39
 * @Description:
 */
public class ThreadService {

    /**
     * 用户线程。
     */
    private Thread executeTask;

    /**
     * 守护线程是否完成任务。
     */
    private Boolean finished = false;

    /**
     * 1、定义一个执行的方法。
     *
     * @param task 需要执行的任务（工作）
     */
    public void execute(Runnable task) {
        executeTask = new Thread() {
            @Override
            public void run() {
                // 在执行线程内定义一个守护线程
                // 守护线程的目的是：当执行线程结束时，守护线程自动结束
                // 意思就是 等给定时间内，守护线程还没有完成工作，或者守护线程内出现错误导致线程卡住，用户线程结束，守护线程自动结束
                Thread runner = new Thread(task);
                runner.setDaemon(true);
                runner.start();

                try {
                    runner.join();
                    finished = true;
                } catch (InterruptedException e) {
                }
            }
        };

        executeTask.start();
    }

    /**
     * 2、定义一个关闭的方法。
     *
     * @param mills 最大等待时间。
     */
    public void shutdown(long mills) {
        long time = System.currentTimeMillis();
        // 守护线程的工作已经完成了 但是给定的时间还很多
        // 判断当前时间减去开始时间是否小于给定时间，是的，打断执行守护线程的线程，守护线程自动结束
        while (!finished) {
            if ((System.currentTimeMillis() - time) > mills) {
                System.out.println("任务超时，需要结束它。");
                executeTask.interrupt();
                break;
            }

            // 守护线程的任务还没有执行完成，执行线程的任务也没有完成
            // 那么就休眠一会

            try {
                executeTask.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("执行线程被打断！");
                break;
            }
        }
    }
}
