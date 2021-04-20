package com.hcy.code.service;

/**
 * 模拟爱奇艺会员卡服务
 * @author HCY
 * @since 2021/3/12 下午5:10
*/
public class IQiYiCardService {

    /**
     * 模拟发放爱奇艺会员卡一张
     * @author HCY
     * @since 2021/3/12 下午5:10
     * @param bindMobileNumber: 用户绑定的电话号码
     * @param cardId: 卡号
     * @return void
    */
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }
}
