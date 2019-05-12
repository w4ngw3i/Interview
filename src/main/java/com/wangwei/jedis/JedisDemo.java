package com.wangwei.jedis;

import redis.clients.jedis.Jedis;

public class JedisDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("39.107.234.188", 6379);

        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            jedis.hset("hset"+i, "age:" + i, ""+i);
        }


        long endTime = System.nanoTime();

        System.out.println((endTime - startTime) / 1000000000.0 + "s");
    }

}
