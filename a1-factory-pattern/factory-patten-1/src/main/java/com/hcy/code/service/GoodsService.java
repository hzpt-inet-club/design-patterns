package com.hcy.code.service;

import com.alibaba.fastjson.JSON;
import com.hcy.code.entity.DeliverReq;

/**
 * 模拟实物商品服务
 * @author HCY
 * @since 2021/3/12 下午5:12
*/
public class GoodsService {
    /**
     * 模拟发货实物商品一个
     * @author HCY
     * @since 2021/3/12 下午5:12
     * @param req: 消费者
     * @return java.lang.Boolean
    */
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
