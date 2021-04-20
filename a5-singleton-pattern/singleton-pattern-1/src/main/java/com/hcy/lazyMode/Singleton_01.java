package com.hcy.lazyMode;

/**
 * 懒汉模式（线程不安全）
 * @author HCY
 * @since 2021/3/20 上午11:41
*/
public class Singleton_01 {
    private static Singleton_01 instance;

    private Singleton_01() {
    }

    public static Singleton_01 getInstance(){
        if (null != instance) {
            return instance;
        }
        instance = new Singleton_01();
        return instance;
    }
}
