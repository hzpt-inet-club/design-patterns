package com.hcy.lang;

/**
 * 可迭代接口定义
 * @author HCY
 * @since 2021/4/22 7:43 下午
*/
public interface Iterable<E> {
    Iterator<E> iterator();
}
