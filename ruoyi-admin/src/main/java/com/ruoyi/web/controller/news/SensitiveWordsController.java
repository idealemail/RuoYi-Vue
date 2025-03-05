package com.ruoyi.web.controller.news;

import java.util.List;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SensitiveWords;
import com.ruoyi.system.service.ISensitiveWordsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 敏感词Controller
 *
 * @author ruoyi
 * @date 2025-02-09
 */
@RestController
@RequestMapping("/system/words")
public class SensitiveWordsController extends BaseController
{
    @Autowired
    private ISensitiveWordsService sensitiveWordsService;

    /**
     * 查询敏感词列表
     */
    @PreAuthorize("@ss.hasPermi('system:words:list')")
    @GetMapping("/list")
    public TableDataInfo list(SensitiveWords sensitiveWords)
    {
        startPage();
        List<SensitiveWords> list = sensitiveWordsService.selectSensitiveWordsList(sensitiveWords);
        return getDataTable(list);
    }

    /**
     * 导出敏感词列表
     */
    @PreAuthorize("@ss.hasPermi('system:words:export')")
    @Log(title = "敏感词", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SensitiveWords sensitiveWords)
    {
        List<SensitiveWords> list = sensitiveWordsService.selectSensitiveWordsList(sensitiveWords);
        ExcelUtil<SensitiveWords> util = new ExcelUtil<SensitiveWords>(SensitiveWords.class);
        util.exportExcel(response, list, "敏感词数据");
    }

    /**
     * 获取敏感词详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:words:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(sensitiveWordsService.selectSensitiveWordsById(id));
    }

    /**
     * 新增敏感词
     */
    @PreAuthorize("@ss.hasPermi('system:words:add')")
    @Log(title = "敏感词", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SensitiveWords sensitiveWords)
    {
        return toAjax(sensitiveWordsService.insertSensitiveWords(sensitiveWords));
    }

    /**
     * 修改敏感词
     */
    @PreAuthorize("@ss.hasPermi('system:words:edit')")
    @Log(title = "敏感词", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SensitiveWords sensitiveWords)
    {
        return toAjax(sensitiveWordsService.updateSensitiveWords(sensitiveWords));
    }

    /**
     * 删除敏感词
     */
    @PreAuthorize("@ss.hasPermi('system:words:remove')")
    @Log(title = "敏感词", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(sensitiveWordsService.deleteSensitiveWordsByIds(ids));
    }
}
