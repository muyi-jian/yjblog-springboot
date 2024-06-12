package com.yjblog.web.convert;

import com.yjblog.common.domain.dos.ArticleDO;
import com.yjblog.web.model.vo.article.FindIndexArticlePageListRspVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


/**
 * @author 木白
 * @date 2024/6/12
 * @description
 */
@Mapper
public interface ArticleConvert {
    /**
     * 初始化 convert 实例
     */
    ArticleConvert INSTANCE = Mappers.getMapper(ArticleConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    @Mapping(target = "createDate", expression = "java(java.time.LocalDate.from(bean.getCreateTime()))")
    FindIndexArticlePageListRspVO convertDO2VO(ArticleDO bean);

}
