package com.qst.loan.service;

import com.qst.loan.domain.Loans;

import java.util.List;

/**
 * @author:Allen
 * @create: 2023-08-26 16:51
 * @Description: 贷款Service接口
 */
public interface ILoansChartService {
    public List<Loans> selectLoansList(Loans loans);
}
