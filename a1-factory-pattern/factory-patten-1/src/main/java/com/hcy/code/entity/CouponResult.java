package com.hcy.code.entity;

import lombok.*;

/**
 * 消费券
 * @author HCY
 * @since 2021/3/12 下午5:07
*/
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CouponResult {

    /**
     * 编码
     */
    private String code;

    /**
     * 描述
     */
    private String info;
}
