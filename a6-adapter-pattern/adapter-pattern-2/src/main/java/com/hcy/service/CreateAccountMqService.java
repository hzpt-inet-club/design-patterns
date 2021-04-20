package com.hcy.service;

import com.alibaba.fastjson.JSON;
import com.hcy.mq.CreateAccount;

/**
 * Mq接收消息实现
 * @author HCY
 * @since 2021/3/22 上午9:02
*/
public class CreateAccountMqService {
    public void onMessage(String message) {

        CreateAccount mq = JSON.parseObject(message, CreateAccount.class);

        mq.getNumber();
        mq.getAccountDate();

        // ... 处理自己的业务
    }
}
