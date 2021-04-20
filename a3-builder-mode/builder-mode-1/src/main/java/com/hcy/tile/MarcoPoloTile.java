package com.hcy.tile;

import com.hcy.Matter;

import java.math.BigDecimal;

/**
 * 马可波罗地砖
 * @author HCY
 * @since 2021/3/15 上午8:43
*/
public class MarcoPoloTile implements Matter {
    /**
     * 场景：地砖
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
     */
    @Override
    public String scene() {
        return "地砖";
    }

    /**
     * 品牌
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
     */
    @Override
    public String brand() {
        return "马可波罗";
    }

    /**
     * 型号
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
     */
    @Override
    public String model() {
        return "缺省";
    }

    /**
     * 价格
     * @author HCY
     * @since 2021/3/15 上午7:24
     * @return java.math.BigDecimal
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    /**
     * 描述
     * @author HCY
     * @since 2021/3/15 上午7:24
     * @return java.lang.String
     */
    @Override
    public String desc() {
        return "“马可波罗”品牌诞生于1996年，作为国内最早品牌化的建陶品牌，以“文化陶瓷”占领市场，享有“仿古砖至尊”的美誉。";
    }
}
