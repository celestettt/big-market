package org.example.domain.strategy.service.rule.chain;

/**
 * @author Celeste
 * @date 2024/3/1
 * @description 责任链接口
 */
public interface ILogicChain  extends ILogicChainArmory{
 Integer logic(String userId,Long strategyId);
// 填充节点信息
// todo 为什么要拆分

}
