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
 * @create: 2023-08-28 14:05
 * @Description: 银行卡识别信息对象 bankcard
 */
@ApiModel(description = "银行卡识别信息对象")
@Data
public class Bankcard extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @ApiModelProperty(value = "编号")
    private Long id;

    /** 银行名称 */
    @ApiModelProperty(value = "银行名称")
    @Excel(name = "银行名称")
    private String bankname;

    /** 银行卡号 */
    @ApiModelProperty(value = "银行卡号")
    @Excel(name = "银行卡号")
    private String bankcardno;

    /** 公司ID */
    @ApiModelProperty(value = "公司ID")
    @Excel(name = "公司ID")
    private Long comid;



    /** 企业名称 */
    @ApiModelProperty(value = "企业名称")
    @Excel(name = "企业名称")
    private String comName;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("bankname", getBankname())
                .append("bankcardno", getBankcardno())
                .append("comid", getComid())
                .append("comName", getComName())
                .toString();
    }
}
