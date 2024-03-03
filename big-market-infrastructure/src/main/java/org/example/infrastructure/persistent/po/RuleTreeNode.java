package org.example.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * @author Celeste
 * @date 2024/3/2
 * @description
 */
@Data
public class RuleTreeNode {
    private Long id;
    /** 抽奖策略ID */
    private String treeId;
    private String ruleKey;
    private String ruleDesc;
    private String ruleValue;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;
}
