package com.test.jedis;

import redis.clients.jedis.Jedis;

public class jedisDemo1 {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("192.168.0.13",6379);
        jedis.auth("nwt123789");
        String value=jedis.ping();
        System.out.println(value);

    }
}
