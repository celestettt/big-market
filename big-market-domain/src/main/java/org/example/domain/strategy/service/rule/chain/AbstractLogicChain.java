package org.example.domain.strategy.service.rule.chain;

import org.example.domain.strategy.repository.IStrategyRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Celeste
 * @date 2024/3/1
 * @description
 */
//@Service
public  abstract class AbstractLogicChain implements ILogicChain {

    private ILogicChain next;

    @Override
    public ILogicChain next() {
        return next;
    }

    @Override
    public ILogicChain appendNext(ILogicChain next) {
        this.next = next;
        return next;
    }

    protected abstract String ruleModel();

}
