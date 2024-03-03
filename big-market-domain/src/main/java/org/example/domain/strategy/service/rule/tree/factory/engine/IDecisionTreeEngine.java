package org.example.domain.strategy.service.rule.tree.factory.engine;

import org.example.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @author Celeste
 * @date 2024/3/2
 * @description 规则树的组合接口
 */
public interface IDecisionTreeEngine {
    DefaultTreeFactory.StrategyAwardVO  process(String userId, Long strategyId, Integer awardId);


}
