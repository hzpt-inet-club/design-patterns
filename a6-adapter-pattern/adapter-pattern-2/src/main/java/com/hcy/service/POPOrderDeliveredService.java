package com.hcy.service;

import com.alibaba.fastjson.JSON;
import com.hcy.mq.POPOrderDelivered;

public class POPOrderDeliveredService {
    public void onMessage(String message) {

        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);

        mq.getUId();
        mq.getOrderId();
        mq.getOrderTime();

        // ... 处理自己的业务
    }

}
