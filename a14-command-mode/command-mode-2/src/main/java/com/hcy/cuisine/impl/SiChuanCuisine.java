package com.hcy.cuisine.impl;

import com.hcy.cook.ICook;
import com.hcy.cuisine.ICuisine;

/**
 *
 * 四川（川菜）
 */
public class SiChuanCuisine implements ICuisine {

    private ICook cook;

    public SiChuanCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }

}