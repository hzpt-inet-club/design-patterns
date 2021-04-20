package com.hcy.service.impl;

import com.alibaba.fastjson.JSON;
import com.hcy.code.entity.CouponResult;
import com.hcy.code.service.CouponService;
import com.hcy.service.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 优惠券
 * @author HCY
 * @since 2021/3/12 下午11:50
*/
public class CouponCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

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
        CouponResult couponResult = couponService.sendCoupon(uId,
                commodityId, bizId);
        logger.info("请求参数[优惠券] => uId:{} commodityId:{} bizId:{} extMap:{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]:{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) {
            throw new RuntimeException(couponResult.getInfo());
        }
    }
}
