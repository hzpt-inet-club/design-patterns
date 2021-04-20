package com.hcy.code.service;

import com.hcy.code.entity.CouponResult;

/**
 * 模拟优惠券服务
 * @author HCY
 * @since 2021/3/12 下午5:11
*/
public class CouponService {
    /**
     * 模拟发放优惠券一张
     * @param uId 用户序号
     * @param couponNumber 优惠券序号
     * @param uuid uuid
     * @return
     */
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
