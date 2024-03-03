package org.example.test.domain;

/**
 * @author Celeste
 * @date 2024/2/28$
 */


import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.strategy.model.entity.RaffleAwardEntity;
import org.example.domain.strategy.model.entity.RaffleFactorEntity;
import org.example.domain.strategy.service.IRaffleStrategy;
import org.example.domain.strategy.service.armory.IStrategyArmory;
import org.example.domain.strategy.service.rule.chain.impl.RuleWeightListLogicChain;
import org.example.domain.strategy.service.rule.filter.impl.RuleLockLogicFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import javax.annotation.Resource;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 抽奖策略测试
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RaffleStrategyTest {


    @Resource
    private IStrategyArmory strategyArmory;
    @Resource
    private IRaffleStrategy raffleStrategy;
    @Resource
    private RuleWeightListLogicChain ruleWeightListLogicChain;
    @Resource
    private RuleLockLogicFilter ruleLockLogicFilter;

//
//    @Before
//    public void setUp() {
//        log.info("测试结果：{}", strategyArmory.assembleLotteryStrategy(100001L));
////        log.info("测试结果：{}", strategyArmory.assembleLotteryStrategy(100002L));
////        log.info("测试结果：{}", strategyArmory.assembleLotteryStrategy(100003L));
//        log.info("测试结果：{}", strategyArmory.assembleLotteryStrategy(100006L));
//        // 通过反射 mock 规则中的值
//        ReflectionTestUtils.setField(ruleWeightListLogicChain, "userScore", 40500L);
//        ReflectionTestUtils.setField(ruleLockLogicFilter, "userRaffleCount", 0L);
//    }
//    /**
//     * 次数错校验，抽奖n次后解锁。100003 策略，你可以通过调整 @Before 的 setUp 方法中个人抽奖次数来验证。比如最开始设置0，之后设置10
//     * ReflectionTestUtils.setField(ruleLockLogicFilter, "userRaffleCount", 10L);
//     */
//    @Test
//    public void test_performRaffle() {
//        RaffleFactorEntity raffleFactorEntity = RaffleFactorEntity.builder()
//                .userId("tonny")
//                .strategyId(100006L)
//                .build();
//
//        RaffleAwardEntity raffleAwardEntity = raffleStrategy.performRaffle(raffleFactorEntity);
//
//        log.info("请求参数：{}", JSON.toJSONString(raffleFactorEntity));
//        log.info("测试结果：{}", JSON.toJSONString(raffleAwardEntity));
//    }
//
//    @Test
//    public void test_raffle_center_rule_lock(){
//        RaffleFactorEntity raffleFactorEntity = RaffleFactorEntity.builder()
//                .userId("lili")
//                .strategyId(100003L)
//                .build();
//        RaffleAwardEntity raffleAwardEntity = raffleStrategy.performRaffle(raffleFactorEntity);
//        log.info("请求参数：{}", JSON.toJSONString(raffleFactorEntity));
////        log.info("测试结果：{}", JSON.toJSONString(raffleAwardEntity));
//    }
@Before
public void setUp() {
    // 策略装配 100001、100002、100003
    log.info("测试结果：{}", strategyArmory.assembleLotteryStrategy(100001L));
    log.info("测试结果：{}", strategyArmory.assembleLotteryStrategy(100006L));
    // 通过反射 mock 规则中的值
    ReflectionTestUtils.setField(ruleWeightListLogicChain, "userScore", 4900L);
}

    @Test
    public void test_performRaffle() {
        RaffleFactorEntity raffleFactorEntity = RaffleFactorEntity.builder()
                .userId("xiaofuge")
                .strategyId(100006L)
                .build();
        RaffleAwardEntity raffleAwardEntity = raffleStrategy.performRaffle(raffleFactorEntity);
        log.info("请求参数：{}", JSON.toJSONString(raffleFactorEntity));
        log.info("测试结果：{}", JSON.toJSONString(raffleAwardEntity));
    }
}

