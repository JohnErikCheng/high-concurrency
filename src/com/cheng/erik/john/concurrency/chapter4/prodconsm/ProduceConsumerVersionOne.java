package com.cheng.erik.john.concurrency.chapter4.prodconsm;

import sun.tools.tree.SynchronizedStatement;

/**
 * @ClassName : ProduceConsumerVersionOne
 * @Author : JohnErikCheng
 * @Email : dong@19910925@126.com
 * @Date : Created in 2020/2/5 9:52 下午
 * @Description : 线程间通信。生产者与消费者。
 */
public class ProduceConsumerVersionOne {
    /**
     * 锁。
     */
    private final Object LOCK = new Object();

    /**
     * 计数器。
     */
    private Integer count = 1;

    /**
     * 生产者。
     */
    public void produce() {
        synchronized (LOCK) {
            System.out.println("P->" + (count++));
        }
    }

    /**
     * 消费者。
     */
    public void consumer() {
        synchronized (LOCK) {
            System.out.println("C->" + count);
        }
    }

    public static void main(String[] args) {
        ProduceConsumerVersionOne pc = new ProduceConsumerVersionOne();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    pc.produce();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                pc.consumer();
            }
        }.start();
    }

}
