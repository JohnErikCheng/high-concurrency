package com.cheng.erik.john.concurrency.chapter3.cases;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName ：FightQueryTask
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/2/2 21:06
 * @Description: 航空信息查询任务。
 */
public class FightQueryTask extends Thread implements FightQuery {
    /**
     * 出发城市。
     */
    private final String origin;
    /**
     * 到达城市。
     */
    private final String destination;
    /**
     * 航班信息列表。
     */
    private final List<String> fightList = new ArrayList<>();

    public FightQueryTask(String airline, String origin, String destination) {
        super("[" + airline + "]");
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public void run() {
        System.out.printf("%s-query from %s to %s \n", getName(), origin, destination);
        int randomValue = ThreadLocalRandom.current().nextInt();
//        System.out.println("随机数是：" + randomValue);

        try {
            TimeUnit.SECONDS.sleep(randomValue);
            this.fightList.add(getName() + "-" + randomValue);
            System.out.printf("The Fight:%s list query successful\n", getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> getFightInfo() {
        return this.fightList;
    }
}
