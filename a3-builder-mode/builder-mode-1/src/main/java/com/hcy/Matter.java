package com.hcy;

import java.math.BigDecimal;

/**
 * 物料接口
 * @author HCY
 * @since 2021/3/15 上午7:22
*/
public interface Matter {
    /**
     * 场景；地板、地砖、涂料、吊顶
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
    */
    String scene();

    /**
     * 品牌
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
    */
    String brand();

    /**
     * 型号
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
    */
    String model();

    /**
     * 价格
     * @author HCY
     * @since 2021/3/15 上午7:24
     * @return java.math.BigDecimal
    */
    BigDecimal price();

    /**
     * 描述
     * @author HCY
     * @since 2021/3/15 上午7:24
     * @return java.lang.String
    */
    String desc();

}
