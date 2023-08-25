package com.qst.loan.domain;

import com.qst.common.annotation.Excel;
import com.qst.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * company 实体类
 *
 * @author qst
 * @version 1.0.0
 */
@Getter
@Setter
@ApiModel("公司实体类")
public class Company extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty("主键")
    private Long comId;

    /**
     * 企业编号
     */
    @ApiModelProperty("企业编号")
    @Excel(name = "企业编号")
    private String comNo;

    /**
     * 企业名称
     */
    @ApiModelProperty("企业名称")
    @Excel(name = "企业名称")
    private String comName;

    /**
     * 邮箱
     */
    @ApiModelProperty("邮箱")
    @Excel(name = "邮箱")
    private String comEmail;

    /**
     * 电话
     */
    @ApiModelProperty("电话")
    @Excel(name = "电话")
    private String comPhone;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    @Excel(name = "密码")
    private String comPwd;

    /**
     * 备注、激活码
     */
    @ApiModelProperty("备注")
    @Excel(name = "备注、激活码")
    private String comRemark;

    /**
     * 0 正常，1 停用，2 未激活，3 未实名
     */
    @ApiModelProperty("公司状态")
    @Excel(name = "0 正常，1 停用，2 未激活，3 未实名")
    private String comStatus;

    /**
     * 0 存在， 2删除
     */
    @ApiModelProperty("状态位")
    @Excel(name = "0 存在， 2删除")
    private String comDel;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("comId", getComId())
                .append("comNo", getComNo())
                .append("comName", getComName())
                .append("comEmail", getComEmail())
                .append("comPhone", getComPhone())
                .append("comPwd", getComPwd())
                .append("comRemark", getComRemark())
                .append("comStatus", getComStatus())
                .append("comDel", getComDel())
                .toString();
    }

}