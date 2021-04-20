package com.hcy.mq;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 第三方订单MQ
 * @author HCY
 * @since 2021/3/21 下午7:21
*/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class POPOrderDelivered {

    /**
     * 用户ID
     */
    private String uId;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 商品
     */
    private Date sku;

    /**
     * 商品名称
     */
    private Date skuName;

    /**
     * 金额
     */
    private BigDecimal decimal;

}
