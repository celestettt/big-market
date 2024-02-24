package org.example.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.Strategy;
import org.example.infrastructure.persistent.po.StrategyRule;

import java.util.List;
@Mapper
/*策略规则Dao*/
public interface IStrategyRuleDao {
    List<StrategyRule> queryStrategyRuleList();

}
