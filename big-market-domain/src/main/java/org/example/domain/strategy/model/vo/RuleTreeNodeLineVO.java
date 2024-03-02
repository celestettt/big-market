package org.example.domain.strategy.model.vo;

import lombok.*;

import java.util.Map;

/**
 * @author Celeste
 * @date 2024/3/1
 * @description 决策树节点连线，用于标识出怎么从一个节点到下一个节点
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleTreeNodeLineVO {
   private Integer treeId;
   private String ruleNodeFrom;

   private String ruleNodeTo;

   private RuleLimitTypeVO ruleLimitType;

   private RuleLogicCheckTypeVO ruleLimitValue;
}
