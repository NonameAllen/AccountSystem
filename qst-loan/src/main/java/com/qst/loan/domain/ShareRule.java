package com.qst.loan.domain;

import com.qst.common.annotation.Excel;
import com.qst.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * @author:Allen
 * @create: 2023-08-29 14:14
 * @Description: 分享规则管理对象 share_rule
 */
@ApiModel(description = "分享规则管理对象")
@Data
public class ShareRule extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @ApiModelProperty(value = "主键id")
    private Long sId;

    /** 分享次数开始 */
    @ApiModelProperty(value = "分享次数开始")
    @Excel(name = "分享次数开始")
    private Long beginNum;

    /** 分享次数结束 */
    @ApiModelProperty(value = "分享次数结束")
    @Excel(name = "分享次数结束")
    private Long endNum;

    /** 该分享次数范围内奖励说明 */
    @ApiModelProperty(value = "该分享次数范围内奖励说明")
    @Excel(name = "该分享次数范围内奖励说明")
    private String shareReward;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("sId", getSId())
                .append("beginNum", getBeginNum())
                .append("endNum", getEndNum())
                .append("shareReward", getShareReward())
                .toString();
    }
}
