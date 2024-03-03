package org.example.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.RuleTreeNode;

import java.util.List;

/**
 * @author Celeste
 * @date 2024/3/2
 * @description
 */
@Mapper
public interface IRuleTreeNodeDao {
    List<RuleTreeNode> queryRuleTreeNodeListByTreeId(String treeId);
}
