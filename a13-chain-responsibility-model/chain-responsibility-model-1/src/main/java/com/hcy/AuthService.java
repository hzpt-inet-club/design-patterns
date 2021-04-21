package com.hcy;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 模拟审核服务
 * @author HCY
 * @since 2021/4/21 12:53 下午
*/
public class AuthService {
    private static Map<String, Date> authMap = new ConcurrentHashMap<String, Date>();

    /**
     * 查询审核结果
     * @author HCY
     * @since 2021/4/21 12:57 下午
     * @param uId:
     * @param orderId:
     * @return java.util.Date
    */
    public static Date queryAuthInfo(String uId, String orderId) {
        return authMap.get(uId.concat(orderId));
    }

    /**
     * 处理审核
     * @author HCY
     * @since 2021/4/21 12:58 下午
     * @param uId:
     * @param orderId:
     * @return void
    */
    public static void auth(String uId, String orderId) {
        authMap.put(uId.concat(orderId), new Date());
    }
}
