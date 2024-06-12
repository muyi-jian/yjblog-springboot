package com.yjblog.web.service;

import com.yjblog.common.utils.Response;

/**
 * @author 木白
 * @date 2024/6/12
 * @description
 */
public interface BlogSettingsService {
    /**
     * 获取博客设置信息
     * @return
     */
    Response findDetail();
}
