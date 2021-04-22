package com.hcy.lang;


/**
 * 迭代器定义
 * @author HCY
 * @since 2021/4/22 7:43 下午
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();
}
