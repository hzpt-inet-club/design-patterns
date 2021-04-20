package com.hcy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 继承SSO
 * @author HCY
 * @since 2021/3/28 上午9:30
*/
public class LoginSsoDecorator extends SsoInterceptor {

    private static Map<String, String> authMap = new ConcurrentHashMap<String, String>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        // 模拟获取cookie
        String ticket = request.substring(1, 8);
        // 模拟校验
        boolean success = "success".equals(ticket);

        if (!success) {
            return false;
        }

        String userId = request.substring(9);
        String method = authMap.get(userId);

        // 模拟方法校验
        return "queryUserInfo".equals(method);
    }
}
