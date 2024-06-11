package com.yjblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.yjblog.common.domain.dos.ArticleCategoryRelDO;

/**
 * @author 木白
 * @date 2024/6/10
 * @description
 */
public interface ArticleCategoryRelMapper extends BaseMapper<ArticleCategoryRelDO> {
    /**
     * 根据文章 ID 删除关联记录
     * @param articleId
     * @return
     */
    default int deleteByArticleId(Long articleId) {
        return delete(Wrappers.<ArticleCategoryRelDO>lambdaQuery()
                .eq(ArticleCategoryRelDO::getArticleId, articleId));
    }
    /**
     * 根据文章 ID 查询
     * @param articleId
     * @return
     */
    default ArticleCategoryRelDO selectByArticleId(Long articleId) {
        return selectOne(Wrappers.<ArticleCategoryRelDO>lambdaQuery()
                .eq(ArticleCategoryRelDO::getArticleId, articleId));
    }
    /**
     * 根据分类 ID 查询
     * @param categoryId
     * @return
     */
    default ArticleCategoryRelDO selectOneByCategoryId(Long categoryId) {
        return selectOne(Wrappers.<ArticleCategoryRelDO>lambdaQuery()
                .eq(ArticleCategoryRelDO::getCategoryId, categoryId)
                .last("LIMIT 1"));
    }
}