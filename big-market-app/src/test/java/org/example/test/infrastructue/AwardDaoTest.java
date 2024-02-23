package org.example.test.infrastructue;

import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;

import org.example.infrastructure.persistent.dao.IAwardDao;
import org.example.infrastructure.persistent.po.Award;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;
//奖品持久化端元测试
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {

    @Resource
    private IAwardDao iAwardDao;

    @Test
    public void test_queryAwardList() {
        List<Award> awards = iAwardDao.queryAwardList();
        log.info("测试结果：{}", JSON.toJSONString(awards));
    }

}

