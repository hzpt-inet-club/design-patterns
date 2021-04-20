package com.hcy.code.door.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 切面定义
 * @author HCY
 * @since 2021/4/6 上午7:35
*/
@ConfigurationProperties("hcy.door")
public class StarterServiceProperties {

    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }

}
