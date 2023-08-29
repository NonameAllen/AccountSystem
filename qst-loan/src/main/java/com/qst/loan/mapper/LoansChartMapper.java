package com.qst.loan.mapper;

import com.qst.loan.domain.Loans;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:Allen
 * @create: 2023-08-26 16:20
 * @Description: 贷款Mapper接口
 */
@Mapper
public interface LoansChartMapper {
    /**
     * 查询贷款列表
     *
     * @param loans 贷款
     * @return 贷款集合
     */
    public List<Loans> selectLoansList(Loans loans);
}
