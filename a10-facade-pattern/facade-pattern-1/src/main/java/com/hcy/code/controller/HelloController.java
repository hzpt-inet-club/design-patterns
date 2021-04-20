package com.hcy.code.controller;

import com.hcy.code.entity.UserInfo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 * @author HCY
 * @since 2021/4/6 上午6:57
*/
@RestController
public class HelloController {
    @Value("${server.port}")
    private int port;

    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    public UserInfo queryUserInfo(@RequestParam String userId) {
        return new UserInfo("晓寻遥:" + userId, 19, "杭州市");
    }
}
