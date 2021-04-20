package com.hcy.service;

import java.util.concurrent.TimeUnit;

/**
 * 模拟redis的接口
 * @author HCY
 * @since 2021/3/13 下午4:09
*/
public interface CacheService {
    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
