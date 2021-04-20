package com.hcy.service.impl;

import com.hcy.service.CacheService;
import com.hcy.utils.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * 模拟redis的接口
 * @author HCY
 * @since 2021/3/13 下午4:10
*/

public class CacheServiceImpl implements CacheService {


    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }

}
