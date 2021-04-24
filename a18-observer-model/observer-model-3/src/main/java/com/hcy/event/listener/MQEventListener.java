package com.hcy.event.listener;

import com.hcy.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MQ发送事件
 * @author HCY
 * @since 2021/4/24 2:25 下午
*/
public class MQEventListener implements EventListener {

    private Logger logger = LoggerFactory.getLogger(MQEventListener.class);

    @Override
    public void doEvent(LotteryResult result) {
        logger.info("记录用户 {} 摇号结果(MQ)：{}", result.getuId(), result.getMsg());
    }

}
