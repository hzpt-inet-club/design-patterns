package com.hcy.hungryMode;

/**
 * 饿汉模式（线程安全）
 * @author HCY
 * @since 2021/3/20 上午11:56
*/
public class Singleton_03 {

    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {
    }

    public static Singleton_03 getInstance() {
        return instance;
    }
}
