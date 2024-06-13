package com.yjblog.web.service;

import com.yjblog.common.utils.Response;
import com.yjblog.web.model.vo.category.FindCategoryArticlePageListReqVO;

/**
 * @author 木白
 * @date 2024/6/12
 * @description
 */
public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList();
    /**
     * 获取分类下文章分页数据
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);
}
