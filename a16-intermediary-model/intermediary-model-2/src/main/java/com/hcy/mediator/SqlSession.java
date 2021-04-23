package com.hcy.mediator;


import java.util.List;

/**
 * 定义SqlSession接口
 * @author HCY
 * @since 2021/4/23 2:23 下午
*/
public interface SqlSession {

    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object parameter);

    <T> List<T> selectList(String statement);

    <T> List<T> selectList(String statement, Object parameter);

    void close();
}
