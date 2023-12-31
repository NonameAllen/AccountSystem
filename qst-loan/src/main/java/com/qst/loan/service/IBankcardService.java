package com.qst.loan.service;

import com.qst.loan.domain.Bankcard;

import java.util.List;

/**
 * @author:Allen
 * @create: 2023-08-28 14:10
 * @Description: 银行卡识别信息Service接口
 */
public interface IBankcardService {
    /**
     * 查询银行卡识别信息
     *
     * @param id 银行卡识别信息主键
     * @return 银行卡识别信息
     */
    public Bankcard selectBankcardById(Long id);

    /**
     * 查询银行卡识别信息列表
     *
     * @param bankcard 银行卡识别信息
     * @return 银行卡识别信息集合
     */
    public List<Bankcard> selectBankcardList(Bankcard bankcard);

    /**
     * 新增银行卡识别信息
     *
     * @param bankcard 银行卡识别信息
     * @return 结果
     */
    public int insertBankcard(Bankcard bankcard);

    /**
     * 修改银行卡识别信息
     *
     * @param bankcard 银行卡识别信息
     * @return 结果
     */
    public int updateBankcard(Bankcard bankcard);

    /**
     * 批量删除银行卡识别信息
     *
     * @param ids 需要删除的银行卡识别信息主键集合
     * @return 结果
     */
    public int deleteBankcardByIds(Long[] ids);

    /**
     * 删除银行卡识别信息信息
     *
     * @param id 银行卡识别信息主键
     * @return 结果
     */
    public int deleteBankcardById(Long id);
}
