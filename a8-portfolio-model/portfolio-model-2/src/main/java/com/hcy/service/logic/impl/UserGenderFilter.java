package com.hcy.service.logic.impl;


import com.hcy.service.logic.BaseLogic;

import java.util.Map;

/**
 * 性别节点
 * @author HCY
 * @since 2021/3/26 上午9:33
*/
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }

}
