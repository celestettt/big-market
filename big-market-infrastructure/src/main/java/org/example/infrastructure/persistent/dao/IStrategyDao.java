package org.example.infrastructure.persistent.dao;

import org.example.infrastructure.persistent.po.Award;
import org.example.infrastructure.persistent.po.Strategy;

import java.util.List;

public interface IStrategyDao {
    List<Strategy> queryStrategyList();

}
