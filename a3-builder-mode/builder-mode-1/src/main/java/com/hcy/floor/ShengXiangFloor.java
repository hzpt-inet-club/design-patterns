package com.hcy.floor;

import com.hcy.Matter;

import java.math.BigDecimal;

/**
 * 圣象
 * @author HCY
 * @since 2021/3/15 上午8:41
*/
public class ShengXiangFloor implements Matter {
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
        return "圣象";
    }

    /**
     * 型号
     * @author HCY
     * @since 2021/3/15 上午7:23
     * @return java.lang.String
     */
    @Override
    public String model() {
        return "一级";
    }

    /**
     * 价格
     * @author HCY
     * @since 2021/3/15 上午7:24
     * @return java.math.BigDecimal
     */
    @Override
    public BigDecimal price() {
        return new BigDecimal(318);
    }

    /**
     * 描述
     * @author HCY
     * @since 2021/3/15 上午7:24
     * @return java.lang.String
     */
    @Override
    public String desc() {
        return "圣象地板是中国地板行业著名品牌。圣象地板拥有中国驰名商标、中国名牌、国家免检、中国环境标志认证等多项荣誉。";
    }
}
