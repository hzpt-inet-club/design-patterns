package com.hcy.atomicReference;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS「AtomicReference」(线程安全)
 * @author HCY
 * @since 2021/3/20 下午12:07
*/
public class Singleton_06 {
    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<Singleton_06>();

    private static Singleton_06 instance;

    private Singleton_06() {
    }

    public static final Singleton_06 getInstance() {
        for (; ; ) {
            Singleton_06 instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        // ---> com.hcy.atomicReference.Singleton_06@23fc625e
        System.out.println(Singleton_06.getInstance());
        // ---> com.hcy.atomicReference.Singleton_06@23fc625e
        System.out.println(Singleton_06.getInstance());
    }
}
