package com.hcy;

/**
 * 小客车指标调控服务
 * @author HCY
 * @since 2021/4/24 1:43 下午
*/
public class MinibusTargetService {

    /**
     *  模拟摇号，但不是摇号算法
     * @author HCY
     * @since 2021/4/24 1:43 下午
     * @param uId: 用户序号
     * @return java.lang.String
    */
    public String lottery(String uId) {
        return Math.abs(uId.hashCode()) % 2 == 0 ? "恭喜你，编码".concat(uId).concat("在本次摇号中签") : "很遗憾，编码".concat(uId).concat("在本次摇号未中签或摇号资格已过期");
    }
}
