package com.hcy.cuisine.impl;


import com.hcy.cook.ICook;
import com.hcy.cuisine.ICuisine;

/**
 *
 * 广东（粤菜）
 */
public class GuangDoneCuisine implements ICuisine {

    private ICook cook;

    public GuangDoneCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }

}
