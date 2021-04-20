package com.hcy.doubleLockCheck;

/**
 * 双重锁校验(线程安全)
 * @author HCY
 * @since 2021/3/20 下午12:03
*/
public class Singleton_05 {
    private static volatile Singleton_05 instance;

    private Singleton_05() {
    }

    public static Singleton_05 getInstance(){
        if(null != instance) {
            return instance;
        }
        synchronized (Singleton_05.class){
            if (null == instance){
                instance = new Singleton_05();
            }
        }
        return instance;
    }
}
