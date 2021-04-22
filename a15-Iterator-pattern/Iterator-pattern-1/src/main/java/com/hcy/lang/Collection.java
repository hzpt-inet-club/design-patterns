package com.hcy.lang;

/**
 * 集合功能接口定义
 * @author HCY
 * @since 2021/4/22 7:43 下午
*/
public interface Collection<E,L> extends Iterable<E> {
    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, L l);

    boolean removeLink(String key);

    @Override
    Iterator<E> iterator();
}
