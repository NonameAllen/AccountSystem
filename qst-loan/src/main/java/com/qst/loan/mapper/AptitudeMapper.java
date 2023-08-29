package com.qst.loan.mapper;

import com.qst.loan.domain.Aptitude;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author:Allen
 * @create: 2023-08-28 09:58
 * @Description: 资质Mapper接口
 */
@Mapper
public interface AptitudeMapper {
    /**
     * 查询资质
     *
     * @param aptId 资质主键
     * @return 资质
     */
    public Aptitude selectAptitudeByAptId(Long aptId);

    /**
     * 查询资质列表
     *
     * @param aptitude 资质
     * @return 资质集合
     */
    public List<Aptitude> selectAptitudeList(Aptitude aptitude);

    /**
     * 新增资质
     *
     * @param aptitude 资质
     * @return 结果
     */
    public int insertAptitude(Aptitude aptitude);

    /**
     * 修改资质
     *
     * @param aptitude 资质
     * @return 结果
     */
    public int updateAptitude(Aptitude aptitude);

    /**
     * 删除资质
     *
     * @param aptId 资质主键
     * @return 结果
     */
    public int deleteAptitudeByAptId(Long aptId);

    /**
     * 批量删除资质
     *
     * @param aptIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAptitudeByAptIds(Long[] aptIds);

    /**
     * 审批资质数据
     * @param eId
     * @return
     */
    List<Aptitude> selectAptitudeById(Long eId);
}
