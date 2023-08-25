package com.qst.loan.service.impl;

import com.qst.loan.domain.Company;
import com.qst.loan.mapper.CompanyMapper;
import com.qst.loan.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Company Service 业务层处理
 *
 * @author qst
 * @version 1.0.0
 */
@Service
public class CompanyServiceImpl implements ICompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public List<Integer> selectAllComIds() {
        return companyMapper.selectAllComIds();
    }

    @Override
    public Company selectCompanyByComId(Long comId) {
        return companyMapper.selectCompanyByComId(comId);
    }

    @Override
    public List<Company> selectCompanyList(Company company) {
        return companyMapper.selectCompanyList(company);
    }

    @Override
    public int insertCompany(Company company) {
        company.setComStatus("3");
        return companyMapper.insertCompany(company);
    }

    @Override
    public int updateCompany(Company company) {
        return companyMapper.updateCompany(company);
    }

    @Override
    public int deleteCompanyByComIds(Long[] comIds) {
        return companyMapper.deleteCompanyByComIds(comIds);
    }

    @Override
    public int deleteCompanyByComId(Long comId) {
        return companyMapper.deleteCompanyByComId(comId);
    }

    @Override
    public List<Company> selectCompanyName() {
        return companyMapper.selectCompanyName();
    }

    @Override
    public void updateCompanyStatus(String coId) {
        companyMapper.updateCompanyStatus(coId);
    }

    @Override
    public List<Company> selectCompanyNameAutonym() {
        return companyMapper.selectCompanyNameAutonym();
    }

    @Override
    public int selectCompanyCount() {
        return companyMapper.selectCompanyCount();
    }
}