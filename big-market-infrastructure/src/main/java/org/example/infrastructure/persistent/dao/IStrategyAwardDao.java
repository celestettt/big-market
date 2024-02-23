package org.example.infrastructure.persistent.dao;

import org.example.infrastructure.persistent.po.StrategyAward;
import org.example.infrastructure.persistent.po.StrategyRule;

import java.util.List;

//抽奖策略明细配置 Dao
public interface IStrategyAwardDao {
    List<StrategyAward> queryStrategyAwardList();

}
