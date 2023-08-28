package com.qst.loan.mapper;

import java.util.List;
import com.qst.loan.domain.Level;
import org.apache.ibatis.annotations.Mapper;

/**
 * 等级 Mapper
 *
 * @author ljx
 * @version 1.0.0
 */
@Mapper
public interface LevelMapper
{
    /**
     * 查询等级设置
     *
     * @param levelId 等级设置主键
     * @return 等级设置
     */
    public Level selectLevelByLevelId(Long levelId);

    /**
     * 查询等级设置列表
     *
     * @param level 等级设置
     * @return 等级设置集合
     */
    public List<Level> selectLevelList(Level level);

    /**
     * 新增等级设置
     *
     * @param level 等级设置
     * @return 结果
     */
    public int insertLevel(Level level);

    /**
     * 修改等级设置
     *
     * @param level 等级设置
     * @return 结果
     */
    public int updateLevel(Level level);

    /**
     * 删除等级设置
     *
     * @param levelId 等级设置主键
     * @return 结果
     */
    public int deleteLevelByLevelId(Long levelId);

    /**
     * 批量删除等级设置
     *
     * @param levelIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteLevelByLevelIds(Long[] levelIds);
}