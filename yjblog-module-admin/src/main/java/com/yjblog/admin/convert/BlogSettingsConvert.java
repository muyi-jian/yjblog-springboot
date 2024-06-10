package com.yjblog.admin.convert;

import com.yjblog.admin.model.vo.blogsettings.FindBlogSettingsRspVO;
import com.yjblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.yjblog.common.domain.dos.BlogSettingsDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author 木白
 * @date 2024/6/5
 * @description
 */
@Mapper
public interface BlogSettingsConvert {
    /**
     * 初始化 convert 实例
     */
    BlogSettingsConvert INSTANCE = Mappers.getMapper(BlogSettingsConvert.class);

    /**
     * 将 VO 转化为 DO
     * @param bean
     * @return
     */
    BlogSettingsDO convertVO2DO(UpdateBlogSettingsReqVO bean);
    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindBlogSettingsRspVO convertDO2VO(BlogSettingsDO bean);
}
