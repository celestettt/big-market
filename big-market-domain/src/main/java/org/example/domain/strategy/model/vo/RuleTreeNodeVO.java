package org.example.domain.strategy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

/**
 * @author Celeste
 * @date 2024/3/1
 * @description 决策树的节点，这些节点可以组合出任意需要的规则树。
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleTreeNodeVO {
    private String treeId;

    private String ruleKey;

    private String ruleDesc;
    private String ruleValue;

    private List<RuleTreeNodeLineVO> treeNodeLineVOList;
}
