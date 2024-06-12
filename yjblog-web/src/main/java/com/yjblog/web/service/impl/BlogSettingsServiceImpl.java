package com.yjblog.web.service.impl;

import com.yjblog.common.domain.dos.BlogSettingsDO;
import com.yjblog.common.domain.mapper.BlogSettingsMapper;
import com.yjblog.common.utils.Response;
import com.yjblog.web.convert.BlogSettingsConvert;
import com.yjblog.web.model.vo.blogsettings.FindBlogSettingsDetailRspVO;
import com.yjblog.web.service.BlogSettingsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 木白
 * @date 2024/6/12
 * @description
 */
@Service
@Slf4j
public class BlogSettingsServiceImpl implements BlogSettingsService {

    @Autowired
    private BlogSettingsMapper blogSettingsMapper;

    /**
     * 获取博客设置信息
     *
     * @return
     */
    @Override
    public Response findDetail() {
        // 查询博客设置信息（约定的 ID 为 1）
        BlogSettingsDO blogSettingsDO = blogSettingsMapper.selectById(1L);
        // DO 转 VO
        FindBlogSettingsDetailRspVO vo = BlogSettingsConvert.INSTANCE.convertDO2VO(blogSettingsDO);

        return Response.success(vo);
    }
}
