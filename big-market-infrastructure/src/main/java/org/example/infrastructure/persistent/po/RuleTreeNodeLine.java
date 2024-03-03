package org.example.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * @author Celeste
 * @date 2024/3/2
 * @description
 */
@Data
public class RuleTreeNodeLine {
    private Long id;
    /** 抽奖策略ID */
    private String treeId;
    private String ruleNodeFrom;
    private String ruleNodeTo;
    private String ruleLimitType;
    private String ruleLimitValue;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;
}
