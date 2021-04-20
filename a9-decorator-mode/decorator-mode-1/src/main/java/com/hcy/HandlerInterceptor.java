package com.hcy;

/**
 * 模拟Spring的HandlerInterceptor
 * @author HCY
 * @since 2021/3/28 上午9:15
*/
public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);
}
