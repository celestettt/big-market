package org.example.domain.strategy.model.entity;


import lombok.*;

import org.example.domain.strategy.model.vo.RuleLogicCheckTypeVO;

/**
 * @author Celeste
 * @date 2024/2/28
 * 规则动作实体
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleActionEntity <T extends  RuleActionEntity.RaffleEntity> {
    private String code= RuleLogicCheckTypeVO.ALLOW.getCode();
    private String info=RuleLogicCheckTypeVO.TAKE_OVER.getInfo();

    private String ruleModel;
    private T data;

    static public class RaffleEntity{


    }
//    抽奖前
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static public class RaffleBeforeEntity extends RaffleEntity{
        private Long strategyId;
//权重key值 用于抽奖时可以选择权重抽奖

        private String ruleWeightValueKey;

        private Integer awardId;
    }
    //抽奖中
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static public  class RaffleCenterEntity extends RaffleEntity{
        private Long strategyId;
//权重key值 用于抽奖时可以选择权重抽奖

        private String ruleWeightValueKey;

        private Integer awardId;
    }
    //抽奖后
    static public class RaffleAfterEntity extends RaffleEntity{

    }
}
