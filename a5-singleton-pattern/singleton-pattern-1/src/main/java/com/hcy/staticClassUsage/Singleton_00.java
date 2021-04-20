package com.hcy.staticClassUsage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态类使用
 * @author HCY
 * @since 2021/3/20 上午11:33
*/
public class Singleton_00 {
    public static Map<String,String> cache = new ConcurrentHashMap<String, String>();
}
