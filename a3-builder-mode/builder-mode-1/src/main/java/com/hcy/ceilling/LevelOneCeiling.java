package com.hcy.ceilling;

import com.hcy.Matter;

import java.math.BigDecimal;

/**
 * 一级吊顶
 * @author HCY
 * @since 2021/3/15 上午7:35
*/
public class LevelOneCeiling implements Matter {

    /**
     * 场景；吊顶
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
     */
    @Override
    public String scene() {
        return "吊顶";
    }

    /**
     * 品牌
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
     */
    @Override
    public String brand() {
        return "装修公司自带";
    }

    /**
     * 型号
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
     */
    @Override
    public String model() {
        return "一级顶";
    }

    /**
     * 价格
     * @author HCY
     * @since 2021/3/15 上午7:24
     * @return java.math.BigDecimal
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(2600);
    }

    /**
     * 描述
     * @author HCY
     * @since 2021/3/15 上午7:24
     * @return java.lang.String
     */
    @Override
    public String desc() {
        return "造型只做低一级，只有一个层次的吊顶，一般离顶120-150mm";
    }
}
