package org.example.domain.strategy.service.armory;

/**
 * @author Celeste
 * @date 2024/2/27
 */
public interface IStrategyDispatch {
    /**
     * 获取抽奖策略装配的随机结果
     *
     * @param strategyId 策略ID
     * @return 抽奖结果
     */
    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);


    Integer getRandomAwardId(String key);

    Boolean subtractionAwardStock(Long strategyId, Integer awardId);

}
