package org.example.domain.strategy.service.rule.chain.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.domain.strategy.service.armory.IStrategyDispatch;
import org.example.domain.strategy.service.rule.chain.AbstractLogicChain;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Celeste
 * @date 2024/3/1
 * @description
 */
@Slf4j
@Component("default")
public class DefaultListLogicChain extends AbstractLogicChain {
    @Resource
    protected IStrategyDispatch strategyDispatch;

    @Override
    public Integer logic(String userId, Long strategyId) {
        Integer awardId=strategyDispatch.getRandomAwardId(strategyId);
//        log.info("抽奖责任链 -默认处理");

        log.info("抽奖责任链-默认处理 userId: {} strategyId: {} ruleModel: {} awardId: {}", userId, strategyId, ruleModel(), awardId);

        return awardId;
    }

    @Override
    protected String ruleModel() {
        return "default";
    }
}
