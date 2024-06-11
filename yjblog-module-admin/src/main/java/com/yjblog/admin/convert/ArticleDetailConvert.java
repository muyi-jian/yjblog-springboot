package com.yjblog.admin.convert;

import com.yjblog.admin.model.vo.article.FindArticleDetailRspVO;
import com.yjblog.common.domain.dos.ArticleDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author 木白
 * @date 2024/6/10
 * @description
 */
@Mapper
public interface ArticleDetailConvert {
    /**
     * 初始化 convert 实例
     */
    ArticleDetailConvert INSTANCE = Mappers.getMapper(ArticleDetailConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindArticleDetailRspVO convertDO2VO(ArticleDO bean);

}