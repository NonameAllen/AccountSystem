package com.qst.loan.controller;

import com.qst.common.core.controller.BaseController;
import com.qst.common.core.page.TableDataInfo;
import com.qst.loan.domain.Loans;
import com.qst.loan.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:Allen
 * @create: 2023-08-26 16:55
 * @Description: 贷款Controller
 */
@Api(tags = "贷款申请统计类")
@RestController
@RequestMapping("/system/loanschart")
public class LoansChartController extends BaseController
{
    @Autowired
    private ILoansChartService loansService;
    /**
     * 查询贷款列表
     */
    @ApiOperation(value = "贷款申请统计列表",notes = "显示贷款申请数据信息")
    @ApiImplicitParam(paramType = "query",dataType = "Loans",name = "loans",required = true)
    @PreAuthorize("@ss.hasPermi('system:loans:list')")
    @GetMapping("/list")
    public TableDataInfo list(Loans loans)
    {
        startPage();
        List<Loans> list = loansService.selectLoansList(loans);
        System.err.println(list);
        return getDataTable(list);
    }

}
