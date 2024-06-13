package com.yjblog.web.service;

import com.yjblog.common.utils.Response;
import com.yjblog.web.model.vo.tag.FindTagArticlePageListReqVO;

/**
 * @author 木白
 * @date 2024/6/12
 * @description
 */
public interface TagService {
    /**
     * 获取标签列表
     * @return
     */
    Response findTagList();
    /**
     * 获取标签下文章分页列表
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);

}
