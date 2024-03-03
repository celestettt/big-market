package org.example.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.persistent.po.RuleTreeNodeLine;

import java.util.List;

/**
 * @author Celeste
 * @date 2024/3/2
 * @description
 */
@Mapper
public interface IRuleTreeNodeLineDao {
    List<RuleTreeNodeLine> queryRuleTreeNodeLineListByTreeId(String treeId);
}
