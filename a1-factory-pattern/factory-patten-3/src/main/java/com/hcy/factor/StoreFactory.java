package com.hcy.factor;

import com.hcy.service.ICommodity;
import com.hcy.service.impl.CardCommodityService;
import com.hcy.service.impl.CouponCommodityService;
import com.hcy.service.impl.GoodsCommodityService;

/**
 * 创建商店⼯厂
 * @author HCY
 * @since 2021/3/13 上午12:02
*/
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        }
        if (1 == commodityType) {
            return new CouponCommodityService();
        }
        if (2 == commodityType) {
            return new GoodsCommodityService();
        }
        if (3 == commodityType) {
            return new CardCommodityService();
        }
        throw new RuntimeException("不存在的商品服务类型");
    }
}
