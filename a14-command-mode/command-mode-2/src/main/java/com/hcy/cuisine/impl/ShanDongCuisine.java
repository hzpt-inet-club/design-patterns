package com.hcy.cuisine.impl;


import com.hcy.cook.ICook;
import com.hcy.cuisine.ICuisine;

/**
 * 山东（鲁菜）
 */
public class ShanDongCuisine implements ICuisine {

    private ICook cook;

    public ShanDongCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }

}