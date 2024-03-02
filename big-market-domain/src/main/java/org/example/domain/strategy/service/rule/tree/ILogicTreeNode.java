package org.example.domain.strategy.service.rule.tree;

import org.example.domain.strategy.model.entity.RuleActionEntity;
import org.example.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @author Celeste
 * @date 2024/3/1
 * @description
 */
public interface ILogicTreeNode {
    DefaultTreeFactory.DefaultTreeAction logic(String userId, Long strategyId, Integer awardId);
}
