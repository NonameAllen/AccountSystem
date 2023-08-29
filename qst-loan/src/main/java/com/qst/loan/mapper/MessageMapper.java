package com.qst.loan.mapper;

import java.util.List;
import com.qst.loan.domain.Message;
import org.apache.ibatis.annotations.Mapper;

/**
 * 留言管理Mapper接口
 * 
 * @author hxy
 * @date 2023-08-28
 */
@Mapper
public interface MessageMapper 
{
    /**
     * 查询留言管理
     * 
     * @param mId 留言管理主键
     * @return 留言管理
     */
    public Message selectMessageByMId(Long mId);

    /**
     * 查询留言管理列表
     * 
     * @param message 留言管理
     * @return 留言管理集合
     */
    public List<Message> selectMessageList(Message message);

    /**
     * 新增留言管理
     * 
     * @param message 留言管理
     * @return 结果
     */
    public int insertMessage(Message message);

    /**
     * 修改留言管理
     * 
     * @param message 留言管理
     * @return 结果
     */
    public int updateMessage(Message message);

    /**
     * 删除留言管理
     * 
     * @param mId 留言管理主键
     * @return 结果
     */
    public int deleteMessageByMId(Long mId);

    /**
     * 批量删除留言管理
     * 
     * @param mIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMessageByMIds(Long[] mIds);
}
