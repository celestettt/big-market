package org.example.domain.strategy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author Celeste
 * @date 2024/3/1
 * @description 决策树的树根信息，标记出最开始从哪个节点执行「treeRootRuleNode」
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleTreeVO {
    private String treeId;
    private String treeName;

    private String treeDesc;

    private String treeRootRuleNode;

    private Map<String,RuleTreeNodeVO> treeNodeMap;
}
