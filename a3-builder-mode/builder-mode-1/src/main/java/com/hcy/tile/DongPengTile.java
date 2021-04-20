package com.hcy.tile;

import com.hcy.Matter;

import java.math.BigDecimal;

/**
 * 东鹏地砖
 * @author HCY
 * @since 2021/3/15 上午8:42
*/
public class DongPengTile implements Matter {
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
        return "东鹏";
    }

    /**
     * 型号
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
     */
    @Override
    public String model() {
        return "10001";
    }

    /**
     * 价格
     * @author HCY
     * @since 2021/3/15 上午7:24
     * @return java.math.BigDecimal
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(102);
    }

    /**
     * 描述
     * @author HCY
     * @since 2021/3/15 上午7:24
     * @return java.lang.String
     */
    @Override
    public String desc() {
        return "东鹏瓷砖以品质铸就品牌，科技推动品牌，口碑传播品牌为宗旨，2014年品牌价值132.35亿元，位列建陶行业榜首。";
    }
}
