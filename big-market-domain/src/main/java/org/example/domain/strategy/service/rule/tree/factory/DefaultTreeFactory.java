package org.example.domain.strategy.service.rule.tree.factory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.example.domain.strategy.model.vo.RuleLogicCheckTypeVO;
import org.example.domain.strategy.model.vo.RuleTreeVO;
import org.example.domain.strategy.service.rule.tree.ILogicTreeNode;
import org.example.domain.strategy.service.rule.tree.factory.engine.IDecisionTreeEngine;
import org.example.domain.strategy.service.rule.tree.factory.engine.impl.DecisionTreeEngine;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Celeste
 * @date 2024/3/1
 * @description 规则树工厂
 */
@Service
public class DefaultTreeFactory {
//    map注入 spring
    private final Map<String, ILogicTreeNode> logicGroup;


    public DefaultTreeFactory(Map<String, ILogicTreeNode> logicGroup) {
        this.logicGroup = logicGroup;
    }

    public IDecisionTreeEngine openLogicTree(RuleTreeVO ruleTreeVO) {
        return new DecisionTreeEngine(logicGroup, ruleTreeVO);
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DefaultTreeAction{
        private RuleLogicCheckTypeVO ruleLogicCheckType;
        private StrategyAwardVO strategyAwardData;
    }
   @Data
   @Builder
   @AllArgsConstructor
   @NoArgsConstructor
    public static class StrategyAwardVO{
        /** 奖品ID */
        private Integer awardId;
        /** 抽奖规则比值 */
        private String awardRuleValue;
    }

}
