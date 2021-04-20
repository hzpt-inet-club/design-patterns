package com.hcy.lazyMode;

/**
 * 懒汉模式（线程安全）
 * @author HCY
 * @since 2021/3/20 上午11:47
*/
public class Singleton_02 {
    private static Singleton_02 instance;

    private Singleton_02() {
    }

    public static synchronized Singleton_02 getInstance(){
        if (null != instance) {
            return instance;
        }
        instance = new Singleton_02();
        return instance;
    }
}
