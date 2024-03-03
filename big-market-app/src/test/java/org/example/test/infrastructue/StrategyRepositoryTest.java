package org.example.test.infrastructue;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.strategy.model.vo.RuleTreeVO;
import org.example.domain.strategy.repository.IStrategyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Celeste
 * @date 2024/3/3
 * @description
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyRepositoryTest {
    @Resource
    private IStrategyRepository repository;
    @Test
    public void queryRuleTreeVOByTreeId(){
        RuleTreeVO ruleTreeVO=repository.queryRuleTreeVOByTreeId("tree_lock");
        log.info("测试结果：{}", JSON.toJSONString(ruleTreeVO));

    }

}
