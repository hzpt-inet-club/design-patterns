package com.hcy.service;

import com.hcy.Matter;

/**
 * 物料接口
 * @author HCY
 * @since 2021/3/15 下午3:31
*/
public interface IMenu {

    /**
     * 吊顶
     * @author HCY
     * @since 2021/3/15 下午3:30
     * @param matter: 物料接口
     * @return com.hcy.service.IMenu
    */
    IMenu appendCeiling(Matter matter);

    /**
     * 涂料
     * @author HCY
     * @since 2021/3/15 下午3:31
     * @param matter: 物料接口
     * @return com.hcy.service.IMenu
    */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     * @author HCY
     * @since 2021/3/15 下午3:31
     * @param matter: 物料接口
     * @return com.hcy.service.IMenu
    */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     * @author HCY
     * @since 2021/3/15 下午3:31
     * @param matter: 物料接口
     * @return com.hcy.service.IMenu
    */
    IMenu appendTile(Matter matter);

    /**
     * 明细
     * @author HCY
     * @since 2021/3/15 下午3:32
     * @return java.lang.String
    */
    String getDetail();

}
