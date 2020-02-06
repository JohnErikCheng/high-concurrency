package com.cheng.erik.john.concurrency.chapter4.prodconsm;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;

/**
 * @ClassName : ProduceConsumerVersionImprove
 * @Author : JohnErikCheng
 * @Email : dong@19910925@126.com
 * @Date : Created in 2020/2/5 10:02 下午
 * @Description : 线程间通信。生产者与消费者模式。
 */
public class ProduceConsumerVersionImprove {

    public final Object LOCK = new Object();
    public volatile boolean isProducted = false;
    public int COUNT = 1;

    public void produceSomething() {
        synchronized (LOCK) {
            if (isProducted) {
                //判断是否生产完成
                try {
                    //生产完毕，进行等待
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                COUNT++;
                System.out.println("P->" + COUNT);
                LOCK.notify();
                isProducted = true;
            }
        }
    }

    public void consumerSomething() {
        synchronized (LOCK) {
            if (isProducted) {
                //如果没有消费，那么进行消费
                System.out.println("C->" + COUNT);
                try {
                    //消费完毕，进行等待
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                isProducted = false;
            } else {
                //判断是否消费
                LOCK.notify();

            }
        }
    }

    public static void main(String[] args) {
        ProduceConsumerVersionImprove pc = new ProduceConsumerVersionImprove();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    pc.produceSomething();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                pc.consumerSomething();
            }
        }.start();
    }


}
