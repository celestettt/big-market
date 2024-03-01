package org.example.domain.strategy.service.rule.filter;

import org.example.domain.strategy.model.entity.RuleActionEntity;
import org.example.domain.strategy.model.entity.RuleMatterEntity;

/**
 * @author Celeste
 * @date 2024/2/28
 * 抽奖规则过滤接口
 */
public interface ILogicFilter <T extends RuleActionEntity.RaffleEntity>{

    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);

}
