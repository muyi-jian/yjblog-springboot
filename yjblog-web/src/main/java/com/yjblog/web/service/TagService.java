package com.yjblog.web.service;

import com.yjblog.common.utils.Response;

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
}
