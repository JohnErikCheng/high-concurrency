package com.cheng.erik.john.concurrency.chapter3;

/**
 * @ClassName ：ThreadGroupPriority
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/1/20 10:35
 * @Description: 线程优先级与线程组的优先级。
 *              当前线程的优先级不能大于当前线程组的优先级，否则无效。
 */
public class ThreadGroupPriority {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("test-group");
        Thread thread = new Thread(threadGroup, "test-thread");
        threadGroup.setMaxPriority(7);
        thread.setPriority(10);
        System.out.println("Concurrent thread \"" + thread.getName() + "\" priority is:" + thread.getPriority());
    }
}
