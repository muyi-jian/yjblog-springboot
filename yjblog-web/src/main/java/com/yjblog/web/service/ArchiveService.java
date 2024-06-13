package com.yjblog.web.service;

import com.yjblog.common.utils.Response;
import com.yjblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;

/**
 * @author 木白
 * @date 2024/6/13
 * @description
 */
public interface ArchiveService {
    /**
     * 获取文章归档分页数据
     * @param findArchiveArticlePageListReqVO
     * @return
     */
    Response findArchivePageList(FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO);
}
