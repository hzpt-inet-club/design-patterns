package com.hcy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 查询用户第三方下单首单接口
 * @author HCY
 * @since 2021/3/21 下午7:25
*/
public class POPOrderService {
    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    public boolean isFirstOrder(String uId) {
        logger.info("POP商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }
}
