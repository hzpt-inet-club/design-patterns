package com.hcy.floor;

import com.hcy.Matter;

import java.math.BigDecimal;

/**
 * 德尔地板
 * @author HCY
 * @since 2021/3/15 上午8:37
*/
public class DerFloor implements Matter {
    /**
     * 场景：地板
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
     */
    @Override
    public String scene() {
        return "地板";
    }

    /**
     * 品牌
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
     */
    @Override
    public String brand() {
        return "德尔";
    }

    /**
     * 型号
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
     */
    @Override
    public String model() {
        return "A++";
    }

    /**
     * 价格
     * @author HCY
     * @since 2021/3/15 上午7:24
     * @return java.math.BigDecimal
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(120);
    }

    /**
     * 描述
     * @author HCY
     * @since 2021/3/15 上午7:24
     * @return java.lang.String
     */
    @Override
    public String desc() {
        return "DER德尔集团是全球领先的专业木地板制造商，北京2008年奥运会家装和公装地板供应商。";
    }
}
