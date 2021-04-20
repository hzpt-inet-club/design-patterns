package com.hcy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟发放优惠券
 * @author HCY
 * @since 2021/3/26 上午8:44
*/
public class EngineController {

    private Logger logger = LoggerFactory.getLogger(EngineController.class);

    public String process(final String userId, final String userSex, final int userAge) {

        logger.info("if...else实现方式判断用户结果。userId：{} userSex：{} userAge：{}", userId, userSex, userAge);

        if ("man".equals(userSex)) {
            if (userAge < 25) {
                return "果实A";
            }

            if (userAge >= 25) {
                return "果实B";
            }
        }

        if ("woman".equals(userSex)) {
            if (userAge < 25) {
                return "果实C";
            }

            if (userAge >= 25) {
                return "果实D";
            }
        }

        return null;

    }



}
