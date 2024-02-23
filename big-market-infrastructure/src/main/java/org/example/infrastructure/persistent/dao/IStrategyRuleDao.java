package org.example.infrastructure.persistent.dao;

import org.example.infrastructure.persistent.po.Strategy;
import org.example.infrastructure.persistent.po.StrategyRule;

import java.util.List;

/*策略规则Dao*/
public interface IStrategyRuleDao {
    List<StrategyRule> queryStrategyRuleList();

}
