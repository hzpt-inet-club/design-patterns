package com.hcy.mq;

import lombok.*;

import java.util.Date;

/**
 * 内部订单MQ
 * @author HCY
 * @since 2021/3/21 下午7:19
*/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderMq {

    /**
     * 用户ID
     */
    private String uid;

    /**
     * 商品
     */
    private String sku;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 下单时间
     */
    private Date createOrderTime;

}
