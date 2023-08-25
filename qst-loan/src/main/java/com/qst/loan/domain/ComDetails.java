package com.qst.loan.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qst.common.annotation.Excel;
import com.qst.common.core.domain.BaseEntity;
import com.qst.common.core.domain.entity.Cities;
import com.qst.common.core.domain.entity.Provinces;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 企业详情对象 com_details
 *
 * @author qst
 * @version 1.0.0
 */
@Getter
@Setter
@ApiModel("企业详情实体类")
public class ComDetails extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty("主键")
    private Long cId;
    /**
     * 企业Id
     */
    @ApiModelProperty("企业Id")
    @Excel(name = "企业Id")
    private String coId;

    /**
     * 企业积分
     */
    @ApiModelProperty("企业积分")
    @Excel(name = "企业积分")
    private String cIntegral;

    /**
     * 营业执照
     */
    @ApiModelProperty("营业执照")
    @Excel(name = "营业执照")
    private String cLicense;

    /**
     * 企业类型 (0 公司 ，1 个体商户)
     */
    @ApiModelProperty("企业类型")
    @Excel(name = "企业类型 (0 公司 ，1 个体商户)")
    private String cType;

    /**
     * 法人姓名
     */
    @ApiModelProperty("法人姓名")
    @Excel(name = "法人姓名")
    private String cLegalName;

    /**
     * 法人证件号
     */
    @ApiModelProperty("法人证件号")
    @Excel(name = "法人证件号")
    private String cLegalId;

    /**
     * 法人证件路径
     */
    @ApiModelProperty("法人证件路径")
    @Excel(name = "法人证件路径")
    private String cLegalImg;

    /**
     * 有效期限
     */
    @ApiModelProperty("有效期限")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "有效期限", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cLegalTime;

    /**
     * 注册省
     */
    @ApiModelProperty("注册省")
    @Excel(name = "注册省")
    private String cPro;

    /**
     * 注册市
     */
    @ApiModelProperty("注册市")
    @Excel(name = "注册市")
    private String cCity;

    /**
     * 公司详细地址
     */
    @ApiModelProperty("公司详细地址")
    @Excel(name = "公司详细地址")
    private String cAddress;

    /**
     * 经营范围
     */
    @ApiModelProperty("经营范围")
    @Excel(name = "经营范围")
    private String cBusSco;

    /**
     * 营业执照到期时间
     */
    @ApiModelProperty("营业执照到期时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "营业执照到期时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cLicTime;

    /**
     * 注册省
     **/
    private Provinces provinces;

    /**
     * 注册市
     **/
    private Cities cities;

    /**
     * 企业信息
     **/
    private Company company;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("cId", getCId())
                .append("coId", getCoId())
                .append("cIntegral", getCIntegral())
                .append("cLicense", getCLicense())
                .append("cType", getCType())
                .append("cLegalName", getCLegalName())
                .append("cLegalId", getCLegalId())
                .append("cLegalImg", getCLegalImg())
                .append("cLegalTime", getCLegalTime())
                .append("cPro", getCPro())
                .append("cCity", getCCity())
                .append("cAddress", getCAddress())
                .append("cBusSco", getCBusSco())
                .append("cLicTime", getCLicTime())
                .append("provinces", getProvinces())
                .append("cities", getCities())
                .append("company", getCompany())
                .toString();
    }
}