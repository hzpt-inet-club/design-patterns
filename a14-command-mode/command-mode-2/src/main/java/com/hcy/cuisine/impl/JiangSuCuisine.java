package com.hcy.cuisine.impl;

import com.hcy.cook.ICook;
import com.hcy.cuisine.ICuisine;

/**
 *
 * 江苏（苏菜）
 */
public class JiangSuCuisine implements ICuisine {

    private ICook cook;

    public JiangSuCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }

}