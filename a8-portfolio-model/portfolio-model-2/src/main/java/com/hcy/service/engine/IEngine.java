package com.hcy.service.engine;


import com.hcy.model.aggregates.TreeRich;
import com.hcy.model.vo.EngineResult;

import java.util.Map;

/**
 * 决策引擎接口定义
 * @author HCY
 * @since 2021/3/26 上午9:37
*/
public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
