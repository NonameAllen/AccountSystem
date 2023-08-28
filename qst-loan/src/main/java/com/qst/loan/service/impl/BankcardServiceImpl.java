package com.qst.loan.service.impl;

import com.qst.loan.domain.Bankcard;
import com.qst.loan.mapper.BankcardMapper;
import com.qst.loan.service.IBankcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:Allen
 * @create: 2023-08-28 14:11
 * @Description: 银行卡识别信息Service业务层处理
 */
@Service
public class BankcardServiceImpl implements IBankcardService {
    @Autowired
    private BankcardMapper bankcardMapper;

    /**
     * 查询银行卡识别信息
     *
     * @param id 银行卡识别信息主键
     * @return 银行卡识别信息
     */
    @Override
    public Bankcard selectBankcardById(Long id)
    {
        return bankcardMapper.selectBankcardById(id);
    }

    /**
     * 查询银行卡识别信息列表
     *
     * @param bankcard 银行卡识别信息
     * @return 银行卡识别信息
     */
    @Override
    public List<Bankcard> selectBankcardList(Bankcard bankcard)
    {
        return bankcardMapper.selectBankcardList(bankcard);
    }

    /**
     * 新增银行卡识别信息
     *
     * @param bankcard 银行卡识别信息
     * @return 结果
     */
    @Override
    public int insertBankcard(Bankcard bankcard)
    {
        return bankcardMapper.insertBankcard(bankcard);
    }

    /**
     * 修改银行卡识别信息
     *
     * @param bankcard 银行卡识别信息
     * @return 结果
     */
    @Override
    public int updateBankcard(Bankcard bankcard)
    {
        return bankcardMapper.updateBankcard(bankcard);
    }

    /**
     * 批量删除银行卡识别信息
     *
     * @param ids 需要删除的银行卡识别信息主键
     * @return 结果
     */
    @Override
    public int deleteBankcardByIds(Long[] ids)
    {
        return bankcardMapper.deleteBankcardByIds(ids);
    }

    /**
     * 删除银行卡识别信息信息
     *
     * @param id 银行卡识别信息主键
     * @return 结果
     */
    @Override
    public int deleteBankcardById(Long id)
    {
        return bankcardMapper.deleteBankcardById(id);
    }
}
