package org.example.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * @author Celeste
 * @date 2024/3/2
 * @description
 */
@Data
public class RuleTree {

    /** 自增ID */
    private Long id;
    /** 抽奖策略ID */
    private String treeId;
    private String treeName;
    private String treeDesc;
    private String treeRootRuleKey;

    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;
}
