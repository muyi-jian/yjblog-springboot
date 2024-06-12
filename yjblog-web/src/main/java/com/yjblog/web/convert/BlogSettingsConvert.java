package com.yjblog.web.convert;

import com.yjblog.common.domain.dos.BlogSettingsDO;
import com.yjblog.web.model.vo.blogsettings.FindBlogSettingsDetailRspVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


/**
 * @author 木白
 * @date 2024/6/12
 * @description
 */
@Mapper
public interface BlogSettingsConvert {
    /**
     * 初始化 convert 实例
     */
    BlogSettingsConvert INSTANCE = Mappers.getMapper(BlogSettingsConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindBlogSettingsDetailRspVO convertDO2VO(BlogSettingsDO bean);

}
