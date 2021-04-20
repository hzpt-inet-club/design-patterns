package com.hcy.service;

import java.util.concurrent.TimeUnit;

/**
 * 定义接口
 * @author HCY
 * @since 2021/3/13 下午5:18
*/
public interface CacheService {

    String get(final String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);
}
