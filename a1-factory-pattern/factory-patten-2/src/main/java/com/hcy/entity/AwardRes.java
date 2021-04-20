package com.hcy.entity;

import lombok.*;

/**
 * 出参对象
 * @author HCY
 * @since 2021/3/12 下午5:16
*/
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AwardRes {

    /**
     * 编码
     */
    private String code;

    /**
     * 描述
     */
    private String info;
}
