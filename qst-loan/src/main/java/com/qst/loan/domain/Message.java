package com.qst.loan.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.qst.common.annotation.Excel;
import com.qst.common.core.domain.BaseEntity;

/**
 * 留言管理对象 message
 * 
 * @author hxy
 * @date 2023-08-28
 */
@Data
@ApiModel(description = "留言管理对象")
public class Message extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    @ApiModelProperty(value = "主键id")
    private Long mId;

    /** 企业ID */
    @ApiModelProperty(value = "企业ID")
    @Excel(name = "企业ID")
    private Long comId;


    /** 企业名称 */
    @ApiModelProperty(value = "企业名称")
    @Excel(name = "企业名称")
    private String comName;

    /** 留言内容 */
    @ApiModelProperty(value = "留言内容")
    @Excel(name = "留言内容")
    private String msgDetail;

    /** 留言时间 */
    @ApiModelProperty(value = "留言时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "留言时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date msgTime;

    /** 回复内容 */
    @ApiModelProperty(value = "回复内容")
    @Excel(name = "回复内容")
    private String respDetail;

    /** 回复时间 */
    @ApiModelProperty(value = "回复时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "回复时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date respTime;

    /** 留言状态（0未回复 1已回复） */
    @ApiModelProperty(value = "留言状态（0未回复 1已回复）")
    @Excel(name = "留言状态", readConverterExp = "0=未回复,1=已回复")
    private String msgState;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("mId", getMId())
            .append("comId", getComId())
                .append("comName", getComName())
            .append("msgDetail", getMsgDetail())
            .append("msgTime", getMsgTime())
            .append("respDetail", getRespDetail())
            .append("respTime", getRespTime())
            .append("msgState", getMsgState())
            .toString();
    }
}
