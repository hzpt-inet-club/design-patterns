package com.hcy.event.listener;


import com.hcy.LotteryResult;

/**
 * 事件监听接口定义
 * @author HCY
 * @since 2021/4/24 2:24 下午
*/
public interface EventListener {

    void doEvent(LotteryResult result);

}
