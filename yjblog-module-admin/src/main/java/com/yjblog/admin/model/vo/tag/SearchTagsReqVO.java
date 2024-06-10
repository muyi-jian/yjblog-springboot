package com.yjblog.admin.model.vo.tag;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author 木白
 * @date 2024/6/5
 * @description 标签模糊查询
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "标签模糊查询 VO")
public class SearchTagsReqVO {

    @NotBlank(message = "标签查询关键词不能为空")
    private String key;

}
