package com.hcy.code.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
/**
 * 用户的信息
 * @author HCY
 * @since 2021/4/6 上午6:55
*/
public class UserInfo {

    private String code;
    private String info;

    private String name;
    private Integer age;
    private String address;

    public UserInfo() {

    }

    public UserInfo(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public UserInfo(String name, Integer age, String address) {
        this.code = "0000";
        this.info = "success";
        this.name = name;
        this.age = age;
        this.address = address;
    }

}
