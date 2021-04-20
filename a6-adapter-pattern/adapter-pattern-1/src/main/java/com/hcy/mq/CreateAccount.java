package com.hcy.mq;

import lombok.*;

import java.util.Date;

/**
 * 注册开户MQ
 * @author HCY
 * @since 2021/3/21 下午7:16
*/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CreateAccount {

    /**
     * 开户编号
     */
    private String number;

    /**
     * 开户地
     */
    private String address;

    /**
     * 开户时间
     */
    private Date accountDate;

    /**
     * 开户描述
     */
    private String desc;


}
