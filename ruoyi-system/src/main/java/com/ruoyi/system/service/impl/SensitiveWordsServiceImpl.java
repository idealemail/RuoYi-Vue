package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SensitiveWordsMapper;
import com.ruoyi.system.domain.SensitiveWords;
import com.ruoyi.system.service.ISensitiveWordsService;

/**
 * 敏感词管理Service业务层处理
 *
 * @author ruoyi
 * @date 2025-02-09
 */
@Service
public class SensitiveWordsServiceImpl implements ISensitiveWordsService
{
    @Autowired
    private SensitiveWordsMapper sensitiveWordsMapper;

    /**
     * 查询敏感词管理
     *
     * @param id 敏感词管理主键
     * @return 敏感词管理
     */
    @Override
    public SensitiveWords selectSensitiveWordsById(String id)
    {
        return sensitiveWordsMapper.selectSensitiveWordsById(id);
    }

    /**
     * 查询敏感词管理列表
     *
     * @param sensitiveWords 敏感词管理
     * @return 敏感词管理
     */
    @Override
    public List<SensitiveWords> selectSensitiveWordsList(SensitiveWords sensitiveWords)
    {
        return sensitiveWordsMapper.selectSensitiveWordsList(sensitiveWords);
    }

    /**
     * 新增敏感词管理
     *
     * @param sensitiveWords 敏感词管理
     * @return 结果
     */
    @Override
    public int insertSensitiveWords(SensitiveWords sensitiveWords)
    {
        return sensitiveWordsMapper.insertSensitiveWords(sensitiveWords);
    }

    /**
     * 修改敏感词管理
     *
     * @param sensitiveWords 敏感词管理
     * @return 结果
     */
    @Override
    public int updateSensitiveWords(SensitiveWords sensitiveWords)
    {
        return sensitiveWordsMapper.updateSensitiveWords(sensitiveWords);
    }

    /**
     * 批量删除敏感词管理
     *
     * @param ids 需要删除的敏感词管理主键
     * @return 结果
     */
    @Override
    public int deleteSensitiveWordsByIds(String[] ids)
    {
        return sensitiveWordsMapper.deleteSensitiveWordsByIds(ids);
    }

    /**
     * 删除敏感词管理信息
     *
     * @param id 敏感词管理主键
     * @return 结果
     */
    @Override
    public int deleteSensitiveWordsById(String id)
    {
        return sensitiveWordsMapper.deleteSensitiveWordsById(id);
    }
}
