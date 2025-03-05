package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SensitiveWords;

/**
 * 敏感词管理Mapper接口
 *
 * @author ruoyi
 * @date 2025-02-09
 */
public interface SensitiveWordsMapper
{
    /**
     * 查询敏感词管理
     *
     * @param id 敏感词管理主键
     * @return 敏感词管理
     */
    public SensitiveWords selectSensitiveWordsById(String id);

    /**
     * 查询敏感词管理列表
     *
     * @param sensitiveWords 敏感词管理
     * @return 敏感词管理集合
     */
    public List<SensitiveWords> selectSensitiveWordsList(SensitiveWords sensitiveWords);

    /**
     * 新增敏感词管理
     *
     * @param sensitiveWords 敏感词管理
     * @return 结果
     */
    public int insertSensitiveWords(SensitiveWords sensitiveWords);

    /**
     * 修改敏感词管理
     *
     * @param sensitiveWords 敏感词管理
     * @return 结果
     */
    public int updateSensitiveWords(SensitiveWords sensitiveWords);

    /**
     * 删除敏感词管理
     *
     * @param id 敏感词管理主键
     * @return 结果
     */
    public int deleteSensitiveWordsById(String id);

    /**
     * 批量删除敏感词管理
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSensitiveWordsByIds(String[] ids);
}
