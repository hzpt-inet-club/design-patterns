package com.hcy.innerClass;

/**
 * 使用类的内部类(线程安全)
 * @author HCY
 * @since 2021/3/20 下午12:00
*/
public class Singleton_04 {

    private static class SingletonHolder {
        private static Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04() {
    }

    public static Singleton_04 getInstance() {
        return SingletonHolder.instance;
    }
}
