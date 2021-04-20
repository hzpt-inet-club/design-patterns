package com.hcy;

/**
 * 模拟单点登陆
 * @author HCY
 * @since 2021/3/28 上午9:15
*/
public class SsoInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        // 模拟获取cookie
        String ticket = request.substring(1, 8);
        // 模拟校验
        return ticket.equals("success");
    }
}
