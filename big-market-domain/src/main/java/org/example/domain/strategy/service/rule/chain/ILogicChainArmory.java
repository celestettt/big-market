package org.example.domain.strategy.service.rule.chain;

/**
 * @author Celeste
 * @date 2024/3/1
 * @description
 */
public interface ILogicChainArmory {
    ILogicChain next();

    ILogicChain appendNext(ILogicChain next);
}
