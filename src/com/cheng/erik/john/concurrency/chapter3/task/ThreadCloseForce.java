package com.cheng.erik.john.concurrency.chapter3.task;

/**
 * @ClassName ：ThreadCloseForce
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/2/3 21:08
 * @Description:
 */
public class ThreadCloseForce {
    public static void main(String[] args) {
        ThreadService threadService = new ThreadService();
        threadService.execute(() -> {
            //此处执行一个非常重的资源，需要花费很长的时间
           /* while (true) {

            }*/

            // 任务执行5秒
            try {
                Thread.sleep(5_000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        long startTime = System.currentTimeMillis();
        threadService.shutdown(10_000L);
        long endTime = System.currentTimeMillis();
        System.out.printf("This task cost [%s] 毫秒。", (endTime - startTime));
    }
}
