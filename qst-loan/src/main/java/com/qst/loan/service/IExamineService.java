package com.qst.loan.service;

import java.util.List;
import com.qst.loan.domain.Examine;

/**
 * 审批Service接口
 * 
 * @author hxy
 * @date 2023-08-25
 */
public interface IExamineService 
{
    /**
     * 查询审批
     * 
     * @param exaId 审批主键
     * @return 审批
     */
    public Examine selectExamineByExaId(Long exaId);

    /**
     * 查询审批
     *
     * @param eId 审批主键
     * @return 审批
     */
    List<Examine> selectExamineById(Long eId);

    /**
     * 查询审批列表
     * 
     * @param examine 审批
     * @return 审批集合
     */
    public List<Examine> selectExamineList(Examine examine);

    /**
     * 新增审批
     * 
     * @param examine 审批
     * @return 结果
     */
    public int insertExamine(Examine examine);

    /**
     * 修改审批
     * 
     * @param examine 审批
     * @return 结果
     */
    public int updateExamine(Examine examine);

    /**
     * 批量删除审批
     * 
     * @param exaIds 需要删除的审批主键集合
     * @return 结果
     */
    public int deleteExamineByExaIds(Long[] exaIds);

    /**
     * 删除审批信息
     * 
     * @param exaId 审批主键
     * @return 结果
     */
    public int deleteExamineByExaId(Long exaId);
}
