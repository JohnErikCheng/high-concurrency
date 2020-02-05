package com.cheng.erik.john.concurrency.chapter3.cases;

import java.util.List;

/**
 * @ClassName ：FightQuery
 * @Author ：JohnErikCheng
 * @Email ：dong@19910925@126.com
 * @Date ：Created in 2020/2/2 21:05
 * @Description: 航空信息查询接口。
 */
public interface FightQuery {
    /**
     * 查询航班信息。
     *
     * @return 航班信息列表。
     */
    List<String> getFightInfo();
}
