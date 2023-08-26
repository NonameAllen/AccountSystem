package com.qst.loan.service.impl;

import com.qst.common.utils.uuid.IdUtils;
import com.qst.loan.domain.Loans;
import com.qst.loan.mapper.LoansChartMapper;
import com.qst.loan.mapper.LoansMapper;
import com.qst.loan.service.ILoansChartService;
import com.qst.loan.service.ILoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:Allen
 * @create: 2023-08-26 16:52
 * @Description: 贷款Service业务层处理
 */
@Service
public class LoansChartServiceImpl implements ILoansChartService {
    @Autowired
    private LoansChartMapper loansMapper;

    /**
     * 查询贷款列表
     *
     * @param loans 贷款
     * @return 贷款
     */
    @Override
    public List<Loans> selectLoansList(Loans loans) {
        return loansMapper.selectLoansList(loans);
    }

}