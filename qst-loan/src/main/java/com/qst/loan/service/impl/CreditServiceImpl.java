package com.qst.loan.service.impl;

import com.qst.common.utils.DateUtils;
import com.qst.loan.domain.Credit;
import com.qst.loan.mapper.CreditMapper;
import com.qst.loan.service.ICreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:Allen
 * @create: 2023-08-28 14:44
 * @Description: 平台信用管理Service业务层处理
 */
@Service
public class CreditServiceImpl implements ICreditService {
    @Autowired
    private CreditMapper creditMapper;

    @Override
    public List<Integer> selectAllComIds() {
        return creditMapper.selectAllComIds();
    }

    /**
     * 查询平台信用管理
     *
     * @param comId 平台信用管理主键
     * @return 平台信用管理
     */
    @Override
    public Credit selectCreditByComId(Long comId)
    {
        return creditMapper.selectCreditByComId(comId);
    }

    /**
     * 查询平台信用管理列表
     *
     * @param credit 平台信用管理
     * @return 平台信用管理
     */
    @Override
    public List<Credit> selectCreditList(Credit credit)
    {
        return creditMapper.selectCreditList(credit);
    }

    /**
     * 新增平台信用管理
     *
     * @param credit 平台信用管理
     * @return 结果
     */
    @Override
    public int insertCredit(Credit credit)
    {
        return creditMapper.insertCredit(credit);
    }

    /**
     * 修改平台信用管理
     *
     * @param credit 平台信用管理
     * @return 结果
     */
    @Override
    public int updateCredit(Credit credit)
    {
        credit.setUpdateTime(DateUtils.getNowDate());
        return creditMapper.updateCredit(credit);
    }

    /**
     * 批量删除平台信用管理
     *
     * @param comIds 需要删除的平台信用管理主键
     * @return 结果
     */
    @Override
    public int deleteCreditByComIds(Long[] comIds)
    {
        return creditMapper.deleteCreditByComIds(comIds);
    }

    /**
     * 删除平台信用管理信息
     *
     * @param comId 平台信用管理主键
     * @return 结果
     */
    @Override
    public int deleteCreditByComId(Long comId)
    {
        return creditMapper.deleteCreditByComId(comId);
    }
}
