package com.qst.loan.mapper;

import com.qst.loan.domain.Facecheck;

import java.util.List;

/**
 * @author:Allen
 * @create: 2023-08-28 10:18
 * @Description: 人脸识别记录Mapper接口
 */
public interface FacecheckMapper {
    /**
     * 查询人脸识别记录
     *
     * @param id 人脸识别记录主键
     * @return 人脸识别记录
     */
    public Facecheck selectFacecheckById(Long id);

    /**
     * 查询人脸识别记录列表
     *
     * @param facecheck 人脸识别记录
     * @return 人脸识别记录集合
     */
    public List<Facecheck> selectFacecheckList(Facecheck facecheck);

    /**
     * 新增人脸识别记录
     *
     * @param facecheck 人脸识别记录
     * @return 结果
     */
    public int insertFacecheck(Facecheck facecheck);

    /**
     * 修改人脸识别记录
     *
     * @param facecheck 人脸识别记录
     * @return 结果
     */
    public int updateFacecheck(Facecheck facecheck);

    /**
     * 删除人脸识别记录
     *
     * @param id 人脸识别记录主键
     * @return 结果
     */
    public int deleteFacecheckById(Long id);

    /**
     * 批量删除人脸识别记录
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFacecheckByIds(Long[] ids);
}
