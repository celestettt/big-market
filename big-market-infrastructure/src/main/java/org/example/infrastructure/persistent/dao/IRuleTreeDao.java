package org.example.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.RuleTree;

/**
 * @author Celeste
 * @date 2024/3/2
 * @description
 */
@Mapper
public interface IRuleTreeDao {
      RuleTree queryRuleTreeByTreeId(String treeId);

}
