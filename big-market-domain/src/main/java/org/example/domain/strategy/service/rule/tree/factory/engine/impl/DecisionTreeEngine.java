package org.example.domain.strategy.service.rule.tree.factory.engine.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.domain.strategy.model.vo.RuleLogicCheckTypeVO;
import org.example.domain.strategy.model.vo.RuleTreeNodeLineVO;
import org.example.domain.strategy.model.vo.RuleTreeNodeVO;
import org.example.domain.strategy.model.vo.RuleTreeVO;
import org.example.domain.strategy.service.rule.tree.ILogicTreeNode;
import org.example.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;
import org.example.domain.strategy.service.rule.tree.factory.engine.IDecisionTreeEngine;

import java.util.List;
import java.util.Map;

/**
 * @author Celeste
 * @date 2024/3/2
 * @description 决策树引擎
 */
@Slf4j
public class DecisionTreeEngine implements IDecisionTreeEngine {
    private final Map<String, ILogicTreeNode> logicGroup;

    private final RuleTreeVO ruleTree;

    public DecisionTreeEngine(Map<String, ILogicTreeNode> logicGroup, RuleTreeVO ruleTree) {
        this.logicGroup = logicGroup;
        this.ruleTree = ruleTree;
    }


    @Override
    public DefaultTreeFactory.StrategyAwardData process(String userId, Long strategyId, Integer awardId) {
        DefaultTreeFactory.StrategyAwardData strategyAwardData = null;
//        获取基础信息
        String nextNode = ruleTree.getTreeRootRuleNode();
        Map<String, RuleTreeNodeVO> treeNodeMap = ruleTree.getTreeNodeMap();
//获取起始节点，根节点记录了第一个要执行的规则
        RuleTreeNodeVO treeNodeVO = treeNodeMap.get(nextNode);
        while (null != nextNode) {
//            获取决策节点
            ILogicTreeNode logicTreeNode = logicGroup.get(treeNodeVO.getRuleKey());
//            决策节点计算
            DefaultTreeFactory.DefaultTreeAction logicEntity = logicTreeNode.logic(userId, strategyId, awardId);
            RuleLogicCheckTypeVO ruleLogicCheckType = logicEntity.getRuleLogicCheckType();
            strategyAwardData = logicEntity.getStrategyAwardData();
            log.info("决策树引擎【{}】treeId:{} node:{} code:{}", ruleTree.getTreeName(), ruleTree.getTreeId(), nextNode, ruleLogicCheckType.getCode());


//          获取下一个节点

            nextNode= nextNode(ruleLogicCheckType.getCode(), treeNodeVO.getTreeNodeLineVOList());
            treeNodeVO = treeNodeMap.get(nextNode);

        }



//        返回最终结果
        return strategyAwardData;
    }

    private String nextNode(String matterValue, List<RuleTreeNodeLineVO> ruleTreeNodeVOList) {
        if (null == ruleTreeNodeVOList || ruleTreeNodeVOList.isEmpty()) {
            return null;
        }

        for (RuleTreeNodeLineVO treeNodeLine : ruleTreeNodeVOList) {
            if (decisionLogic(matterValue, treeNodeLine)) {
                return treeNodeLine.getRuleNodeTo();
            }

        }
        throw new RuntimeException("决策树引擎，nextNode 计算失败，未找到可执行节点！");

    }


    public boolean decisionLogic(String matterValue, RuleTreeNodeLineVO nodeLine) {
        switch (nodeLine.getRuleLimitType()) {
            case EQUAL:
                return matterValue.equals(nodeLine.getRuleLimitValue().getCode());
            // 以下规则暂时不需要实现
            case GT:
            case LT:
            case GE:
            case LE:
            default:
                return false;
        }
    }

}

