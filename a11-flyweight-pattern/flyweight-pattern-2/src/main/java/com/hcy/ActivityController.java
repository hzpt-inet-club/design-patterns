package com.hcy;


import com.hcy.utils.RedisUtils;

/**
 * 活动接口
 * @author HCY
 * @since 2021/4/7 下午4:30
*/
public class ActivityController {

    private RedisUtils redisUtils = new RedisUtils();

    public Activity queryActivityInfo(Long id) {
        Activity activity = ActivityFactory.getActivity(id);
        // 模拟从Redis中获取库存变化信息
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }

}
