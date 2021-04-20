package com.hcy.service.engine.impl;

import com.hcy.model.aggregates.TreeRich;
import com.hcy.model.vo.EngineResult;
import com.hcy.model.vo.TreeNode;
import com.hcy.service.engine.EngineBase;

import java.util.Map;

/**
 * 决策引擎的实现
 * @author HCY
 * @since 2021/3/26 上午9:39
*/
public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }

}
