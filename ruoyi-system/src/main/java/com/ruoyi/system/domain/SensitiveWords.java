package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 敏感词管理对象 sensitive_words
 *
 * @author ruoyi
 * @date 2025-02-09
 */
public class SensitiveWords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private String id;

    /** 敏感词 */
    @Excel(name = "敏感词")
    private String word;

    /** 敏感词类别 */
    @Excel(name = "敏感词类别")
    private String category;

    /** 敏感词级别 */
    @Excel(name = "敏感词级别")
    private Long level;

    /** 敏感词有效期（精确到小时），NULL 表示永久有效 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "敏感词有效期", readConverterExp = "精=确到小时")
    private Date expiry;

    /** 添加人 */
    @Excel(name = "添加人")
    private String addedBy;

    /** 是否生效（1：生效，0：不生效） */
    @Excel(name = "是否生效", readConverterExp = "1=：生效，0：不生效")
    private Integer isActive;

    /** 记录创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "记录创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;

    /** 记录修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")  
    @Excel(name = "记录修改时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setWord(String word)
    {
        this.word = word;
    }

    public String getWord()
    {
        return word;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getCategory()
    {
        return category;
    }
    public void setLevel(Long level)
    {
        this.level = level;
    }

    public Long getLevel()
    {
        return level;
    }
    public void setExpiry(Date expiry)
    {
        this.expiry = expiry;
    }

    public Date getExpiry()
    {
        return expiry;
    }
    public void setAddedBy(String addedBy)
    {
        this.addedBy = addedBy;
    }

    public String getAddedBy()
    {
        return addedBy;
    }
    public void setIsActive(Integer isActive)
    {
        this.isActive = isActive;
    }

    public Integer getIsActive()
    {
        return isActive;
    }
    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }
    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt()
    {
        return updatedAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("word", getWord())
                .append("category", getCategory())
                .append("level", getLevel())
                .append("expiry", getExpiry())
                .append("addedBy", getAddedBy())
                .append("isActive", getIsActive())
                .append("createdAt", getCreatedAt())
                .append("updatedAt", getUpdatedAt())
                .toString();
    }
}
