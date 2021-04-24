package com.hcy.event.listener;

import com.hcy.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 短消息事件
 * @author HCY
 * @since 2021/4/24 2:24 下午
*/
public class MessageEventListener implements EventListener {

    private Logger logger = LoggerFactory.getLogger(MessageEventListener.class);

    @Override
    public void doEvent(LotteryResult result) {
        logger.info("给用户 {} 发送短信通知(短信)：{}", result.getuId(), result.getMsg());
    }

}