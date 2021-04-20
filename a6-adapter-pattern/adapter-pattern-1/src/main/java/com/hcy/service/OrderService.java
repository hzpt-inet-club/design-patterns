package com.hcy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 查询用户内部下单数量接口
 * @author HCY
 * @since 2021/3/21 下午7:24
*/
public class OrderService {
    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    public long queryUserOrderCount(String userId){
        logger.info("自营商家，查询用户的订单是否为首单：{}", userId);
        return 10L;
    }
}
