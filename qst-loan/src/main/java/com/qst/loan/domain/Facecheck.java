package com.qst.loan.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qst.common.annotation.Excel;
import com.qst.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

/**
 * @author:Allen
 * @create: 2023-08-28 10:14
 * @Description: 人脸识别记录对象 facecheck
 */
@ApiModel("人脸识别实体类")
@Data
public class Facecheck extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @ApiModelProperty("编号")
    @Excel(name = "编号")
    private Long id;

    /** 企业电话 */
    @ApiModelProperty("企业电话")
    @Excel(name = "企业电话")
    private String tel;

    /** 照片信息 */
    @ApiModelProperty("照片信息")
    @Excel(name = "照片信息")
    private String photo;

    /** 验证状态 */
    @ApiModelProperty("验证状态")
    @Excel(name = "验证状态")
    private Long status;

    /** 比对时间 */
    @ApiModelProperty("比对时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "比对时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /* 2022.7.14 增加企业id*/
    @ApiModelProperty("企业id")
    private int comId;
    /* 2022.7.14 增加企业 一对一*/
    private Company company;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("tel", getTel())
                .append("photo", getPhoto())
                .append("status", getStatus())
                .append("time", getTime())
                .toString();
    }
}
