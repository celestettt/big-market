package org.example.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.Award;
import org.example.infrastructure.persistent.po.Strategy;

import java.util.List;
/**
 * @author celeste
 */
@Mapper
public interface IStrategyDao {
    List<Strategy> queryStrategyList();

    Strategy queryStrategyByStrategyId(Long strategyId);
}
