package com.qst.loan.mapper;

import com.qst.loan.domain.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Company Mapper接口
 *
 * @author qst
 * @version 1.0.0
 */
@Mapper
public interface CompanyMapper {
    /**
     * 查询所有的企业id
     */
    public List<Integer> selectAllComIds();

    /**
     * 查询
     *
     * @param comId 主键
     * @return 查询结果
     */
    public Company selectCompanyByComId(Long comId);

    /**
     * 查询列表
     *
     * @param company 企业
     * @return 列表
     */
    public List<Company> selectCompanyList(Company company);

    /**
     * 新增
     *
     * @param company 企业
     * @return 执行结果
     */
    public int insertCompany(Company company);

    /**
     * 修改
     *
     * @param company 企业
     * @return 执行结果
     */
    public int updateCompany(Company company);

    /**
     * 删除
     *
     * @param comId 主键
     * @return 执行结果
     */
    public int deleteCompanyByComId(Long comId);

    /**
     * 批量删除
     *
     * @param comIds 需要删除的数据主键集合
     * @return 执行结果
     */
    public int deleteCompanyByComIds(Long[] comIds);

    /**
     * 查询未实名企业
     */
    List<Company> selectCompanyName();

    /**
     * 实名企业修改状态
     */
    void updateCompanyStatus(String coId);

    /**
     * 查询已实名企业
     */
    List<Company> selectCompanyNameAutonym();

    /**
     * 查询企业数量
     */
    int selectCompanyCount();
}