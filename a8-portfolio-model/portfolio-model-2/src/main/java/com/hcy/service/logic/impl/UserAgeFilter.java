package com.hcy.service.logic.impl;


import com.hcy.service.logic.BaseLogic;

import java.util.Map;

/**
 * 年龄节点
 * @author HCY
 * @since 2021/3/26 上午9:32
*/
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }

}
