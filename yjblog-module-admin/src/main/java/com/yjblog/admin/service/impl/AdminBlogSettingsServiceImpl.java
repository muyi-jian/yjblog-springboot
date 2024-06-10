package com.yjblog.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yjblog.admin.convert.BlogSettingsConvert;
import com.yjblog.admin.model.vo.blogsettings.FindBlogSettingsRspVO;
import com.yjblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.yjblog.admin.service.AdminBlogSettingsService;
import com.yjblog.common.domain.dos.BlogSettingsDO;
import com.yjblog.common.domain.mapper.BlogSettingsMapper;
import com.yjblog.common.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 木白
 * @date 2024/6/5
 * @description
 */
@Service
public class AdminBlogSettingsServiceImpl extends ServiceImpl<BlogSettingsMapper, BlogSettingsDO> implements AdminBlogSettingsService {

    @Autowired
    private BlogSettingsMapper blogSettingsMapper;
    @Override
    public Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO) {
        // VO 转 DO
        // BlogSettingsDO blogSettingsDO = BlogSettingsDO.builder()
        //         .id(1L)
        //         .logo(updateBlogSettingsReqVO.getLogo())
        //         .name(updateBlogSettingsReqVO.getName())
        //         .author(updateBlogSettingsReqVO.getAuthor())
        //         .introduction(updateBlogSettingsReqVO.getIntroduction())
        //         .avatar(updateBlogSettingsReqVO.getAvatar())
        //         .githubHomepage(updateBlogSettingsReqVO.getGithubHomepage())
        //         .giteeHomepage(updateBlogSettingsReqVO.getGiteeHomepage())
        //         .csdnHomepage(updateBlogSettingsReqVO.getCsdnHomepage())
        //         .zhihuHomepage(updateBlogSettingsReqVO.getZhihuHomepage())
        //         .build();


        // 保存或更新（当数据库中存在 ID 为 1 的记录时，则执行更新操作，否则执行插入操作）
        // saveOrUpdate(blogSettingsDO);
        // return Response.success();
        // VO 转 DO
        BlogSettingsDO blogSettingsDO = BlogSettingsConvert.INSTANCE.convertVO2DO(updateBlogSettingsReqVO);
        blogSettingsDO.setId(1L);

        // 保存或更新（当数据库中存在 ID 为 1 的记录时，则执行更新操作，否则执行插入操作）
        saveOrUpdate(blogSettingsDO);
        return Response.success();
    }
    /**
     * 获取博客设置详情
     *
     * @return
     */
    @Override
    public Response findDetail() {
        // 查询 ID 为 1 的记录
        BlogSettingsDO blogSettingsDO = blogSettingsMapper.selectById(1L);

        // DO 转 VO
        FindBlogSettingsRspVO vo = BlogSettingsConvert.INSTANCE.convertDO2VO(blogSettingsDO);

        return Response.success(vo);
    }
}
