package org.example.domain.strategy.service.rule.tree.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.domain.strategy.model.vo.RuleLogicCheckTypeVO;
import org.example.domain.strategy.service.rule.tree.ILogicTreeNode;
import org.example.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import org.springframework.stereotype.Component;

/**
 * @author Celeste
 * @date 2024/3/1
 * @description
 */
@Slf4j
@Component("rule_stock")
public class RuleStockTreeNode implements ILogicTreeNode {
    @Override
    public DefaultTreeFactory.DefaultTreeAction logic(String userId, Long strategyId, Integer awardId) {

    return  DefaultTreeFactory.DefaultTreeAction.builder()
            .ruleLogicCheckType(RuleLogicCheckTypeVO.TAKE_OVER)
            .build();
    }
}
