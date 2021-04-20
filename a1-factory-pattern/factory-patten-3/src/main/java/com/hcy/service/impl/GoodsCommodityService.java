package com.hcy.service.impl;

import com.alibaba.fastjson.JSON;
import com.hcy.code.entity.DeliverReq;
import com.hcy.code.service.GoodsService;
import com.hcy.service.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 实物接口
 * @author HCY
 * @since 2021/3/12 下午11:49
*/
public class GoodsCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

    private GoodsService goodsService = new GoodsService();

    /**
     * 奖品发放接口
     * @author HCY
     * @since 2021/3/12 下午11:50
     * @param uId: 用户序号
     * @param commodityId:奖品ID
     * @param bizId:业务ID
     * @param extMap:扩展字段
     * @throws Exception:异常
     * @return void
     */
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = goodsService.deliverGoods(deliverReq);

        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", isSuccess);

        if (!isSuccess) {
            throw new RuntimeException("实物商品发放失败");
        }
    }

    private String queryUserName(String uId) {
        return "晓寻遥";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}
