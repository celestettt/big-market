package org.example.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Celeste
 * @date 2024/2/28$
 * 规则物料实体对象，用于过滤规则的必要参数信息。
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RaffleFactorEntity {
// 用户Id
 private String userId;
// 策略id
 private  Long strategyId;



}
