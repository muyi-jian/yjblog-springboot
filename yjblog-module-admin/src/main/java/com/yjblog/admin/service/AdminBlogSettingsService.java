package com.yjblog.admin.service;

import com.yjblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.yjblog.common.utils.Response;

/**
 * @author 木白
 * @date 2024/6/5
 * @description
 */
public interface AdminBlogSettingsService {
    /**
     * 更新博客设置信息
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);
    /**
     * 获取博客设置详情
     * @return
     */
    Response findDetail();
}
