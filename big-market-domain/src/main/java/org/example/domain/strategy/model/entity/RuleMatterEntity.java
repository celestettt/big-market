package org.example.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Celeste
 * @date 2024/2/28$
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleMatterEntity {
    private String userId;

    private Long strategyId;

    // 抽奖奖品ID；
    private Integer awardId;
    // 抽奖规则类型
    private String ruleModel;

}
