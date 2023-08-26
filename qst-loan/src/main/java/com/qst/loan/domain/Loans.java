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
 * @author:Allen
 * @create: 2023-08-26 16:20
 * @Description: 贷款对象 loans
 */
@ApiModel("贷款实体类")
@Data
public class Loans extends BaseEntity{
    /** id */
    @ApiModelProperty("主键")
    private Long loaId;

    /**贷款编号**/
    @ApiModelProperty("贷款编号")
    @Excel(name = "贷款编号")
    private String loaNo;

    /** 企业编号 */
    @ApiModelProperty("企业编号")
    @Excel(name = "企业编号")
    private Long loaComNo;

    /** 银行id */
    @ApiModelProperty("银行id")
    @Excel(name = "银行id")
    private Long loaBankId;

    /**贷款期限*/
    @ApiModelProperty("贷款期限")
    @Excel(name = "贷款期限")
    private Long loaLisId;

    /** 贷款用途 */
    @ApiModelProperty("贷款用途")
    @Excel(name = "贷款用途")
    private String loaUse;

    /** 贷款积分 */
    @ApiModelProperty("贷款积分")
    @Excel(name = "贷款积分")
    private String loaIntegral;

    /** 贷款利率 */
    @ApiModelProperty("贷款利率")
    @Excel(name = "贷款利率")
    private String loaRate;

    /** 贷款状态 */
    @ApiModelProperty("贷款状态")
    @Excel(name = "贷款状态")
    private String loaState;

    /** 贷款时间 */
    @ApiModelProperty("贷款时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "贷款时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date loaTime;

    /** 贷款金额 */
    @ApiModelProperty("贷款金额")
    @Excel(name = "贷款金额")
    private Long loaMoney;

    /** 还款时间 */
    @ApiModelProperty("还款时间")
    @Excel(name = "还款时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date loaEndTime;

    /**收款账户*/
    @ApiModelProperty("收款账户")
    @Excel(name = "收款账户")
    private String bAccountNo;

    /**收款人*/
    @ApiModelProperty("收款人")
    @Excel(name = "收款人")
    private String bName;

    /**开户行*/
    @ApiModelProperty("开户行")
    @Excel(name = "开户行")
    private String bBankName;

    /**身份证号*/
    @ApiModelProperty("身份证号")
    @Excel(name = "身份证号")
    private String bIdCard;

    /** 删除标识 0 正常 2 删除 */
    @ApiModelProperty("删除标识")
    private String loaDel;

    private Company company;

    private Bank bank;

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("loaId", getLoaId())
                .append("loaNo", getLoaNo())
                .append("loaComNo", getLoaComNo())
                .append("loaBankId", getLoaBankId())
                .append("loaLisId", getLoaLisId())
                .append("loaUse", getLoaUse())
                .append("loaIntegral", getLoaIntegral())
                .append("loaRate", getLoaRate())
                .append("loaState", getLoaState())
                .append("loaTime", getLoaTime())
                .append("loaMoney", getLoaMoney())
                .append("loaEndTime", getLoaEndTime())
                .append("loaDel", getLoaDel())
                .toString();
    }
}
