package com.qst.loan.service.impl;

import com.qst.loan.domain.Facecheck;
import com.qst.loan.mapper.FacecheckMapper;
import com.qst.loan.service.IFacecheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:Allen
 * @create: 2023-08-28 10:21
 * @Description: 人脸识别记录Service业务层处理
 */
@Service
public class FacecheckServiceImpl implements IFacecheckService {
    @Autowired
    private FacecheckMapper facecheckMapper;

    /**
     * 查询人脸识别记录
     *
     * @param id 人脸识别记录主键
     * @return 人脸识别记录
     */
    @Override
    public Facecheck selectFacecheckById(Long id)
    {
        return facecheckMapper.selectFacecheckById(id);
    }

    /**
     * 查询人脸识别记录列表
     *
     * @param facecheck 人脸识别记录
     * @return 人脸识别记录
     */
    @Override
    public List<Facecheck> selectFacecheckList(Facecheck facecheck)
    {
        return facecheckMapper.selectFacecheckList(facecheck);
    }

    /**
     * 新增人脸识别记录
     *
     * @param facecheck 人脸识别记录
     * @return 结果
     */
    @Override
    public int insertFacecheck(Facecheck facecheck)
    {
        return facecheckMapper.insertFacecheck(facecheck);
    }

    /**
     * 修改人脸识别记录
     *
     * @param facecheck 人脸识别记录
     * @return 结果
     */
    @Override
    public int updateFacecheck(Facecheck facecheck)
    {
        return facecheckMapper.updateFacecheck(facecheck);
    }

    /**
     * 批量删除人脸识别记录
     *
     * @param ids 需要删除的人脸识别记录主键
     * @return 结果
     */
    @Override
    public int deleteFacecheckByIds(Long[] ids)
    {
        return facecheckMapper.deleteFacecheckByIds(ids);
    }

    /**
     * 删除人脸识别记录信息
     *
     * @param id 人脸识别记录主键
     * @return 结果
     */
    @Override
    public int deleteFacecheckById(Long id)
    {
        return facecheckMapper.deleteFacecheckById(id);
    }
}
