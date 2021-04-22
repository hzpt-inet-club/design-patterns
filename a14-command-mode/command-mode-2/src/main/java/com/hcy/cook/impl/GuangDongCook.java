package com.hcy.cook.impl;

import com.hcy.cook.ICook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuangDongCook implements ICook {

    private Logger logger = LoggerFactory.getLogger(ICook.class);

    @Override
    public void doCooking() {
        logger.info("广府菜范围包括珠江三角洲和韶关、湛江等地，具有清、鲜、爽、嫩、滑等特色，“五滋”、“六味”俱佳。");
    }

}
