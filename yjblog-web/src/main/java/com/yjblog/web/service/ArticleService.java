package com.yjblog.web.service;

import com.yjblog.common.utils.Response;
import com.yjblog.web.model.vo.article.FindArticleDetailReqVO;
import com.yjblog.web.model.vo.article.FindIndexArticlePageListReqVO;

/**
 * @author 木白
 * @date 2024/6/12
 * @description
 */
public interface ArticleService {
    /**
     * 获取首页文章分页数据
     * @param findIndexArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);

    /**
     * 获取文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);
}
