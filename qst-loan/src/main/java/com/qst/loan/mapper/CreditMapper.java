package com.qst.loan.mapper;

import com.qst.loan.domain.Credit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author:Allen
 * @create: 2023-08-28 14:41
 * @Description: 平台信用管理Mapper接口
 */
@Mapper
public interface CreditMapper {
    /*从平台信用列表中，查询出已经有的企业id*/
    public List<Integer> selectAllComIds();

    /**
     * 查询平台信用管理
     *
     * @param comId 平台信用管理主键
     * @return 平台信用管理
     */
    public Credit selectCreditByComId(Long comId);

    /**
     * 查询平台信用管理列表
     *
     * @param credit 平台信用管理
     * @return 平台信用管理集合
     */
    public List<Credit> selectCreditList(Credit credit);

    /**
     * 新增平台信用管理
     *
     * @param credit 平台信用管理
     * @return 结果
     */
    public int insertCredit(Credit credit);

    /**
     * 修改平台信用管理
     *
     * @param credit 平台信用管理
     * @return 结果
     */
    public int updateCredit(Credit credit);

    /**
     * 删除平台信用管理
     *
     * @param comId 平台信用管理主键
     * @return 结果
     */
    public int deleteCreditByComId(Long comId);

    /**
     * 批量删除平台信用管理
     *
     * @param comIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCreditByComIds(Long[] comIds);
}
