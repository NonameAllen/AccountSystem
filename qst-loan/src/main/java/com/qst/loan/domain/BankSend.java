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

import java.util.Date;

/**
 * @author:Allen
 * @create: 2023-08-26 15:48
 * @Description: 放款对象 bank_send
 */
@ApiModel("放款实体类")
@Data
public class BankSend extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @ApiModelProperty("编号")
    private Long senId;

    /** 银行ID */
    @ApiModelProperty("银行ID")
    @Excel(name = "银行ID")
    private Long senBankId;

    /** 贷款ID */
    @ApiModelProperty("贷款ID")
    @Excel(name = "贷款ID")
    private Long senLoaId;

    /** 企业ID */
    @ApiModelProperty("企业ID")
    @Excel(name = "企业ID")
    private Long senComId;

    /** 放款账号 */
    @ApiModelProperty("放款账号")
    @Excel(name = "放款账号")
    private String senAccount;

    /** 放款用户姓名 */
    @ApiModelProperty("放款用户姓名")
    @Excel(name = "放款用户姓名")
    private String senUname;

    /** 放款用户证件号 */
    @ApiModelProperty("放款用户证件号")
    @Excel(name = "放款用户证件号")
    private String senUid;

    /** 放款金额 */
    @ApiModelProperty("放款金额")
    @Excel(name = "放款金额")
    private String senMoney;

    /** 放款时间 */
    @ApiModelProperty("放款时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "放款时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date senTime;

    /** 放款方式 */
    @ApiModelProperty("放款方式")
    @Excel(name = "放款方式")
    private String senMode;

    /** 放款状态 */
    @ApiModelProperty("放款状态")
    @Excel(name = "放款状态")
    private String senStatus;

    /** 删除标识 */
    @ApiModelProperty("删除标识")
    private String senDel;

    private Company company;

    private Loans loans;

    private Bank bank;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("senId", getSenId())
                .append("senBankId", getSenBankId())
                .append("senLoaId", getSenLoaId())
                .append("senComId", getSenComId())
                .append("senAccount", getSenAccount())
                .append("senUname", getSenUname())
                .append("senUid", getSenUid())
                .append("senMoney", getSenMoney())
                .append("senTime", getSenTime())
                .append("senMode", getSenMode())
                .append("senStatus", getSenStatus())
                .append("senDel", getSenDel())
                .toString();
    }
}
