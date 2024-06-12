package com.yjblog.web.model.vo.article;

import com.yjblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * @author 木白
 * @date 2024/6/12
 * @description
 */
@Data
@Builder
@ApiModel(value = "首页查询文章分页 VO")
public class FindIndexArticlePageListReqVO extends BasePageQuery {
}
