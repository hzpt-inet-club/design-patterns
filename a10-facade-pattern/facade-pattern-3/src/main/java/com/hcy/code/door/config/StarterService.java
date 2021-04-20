package com.hcy.code.door.config;

import org.springframework.util.StringUtils;

/**
 * 切面定义
 * @author HCY
 * @since 2021/4/6 上午7:35
*/
public class StarterService {

    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.userStr, separatorChar);
    }

}
