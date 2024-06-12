package com.yjblog.web.model.vo.blogsettings;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 木白
 * @date 2024/6/12
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindBlogSettingsDetailRspVO {
    private String logo;
    private String name;
    private String author;
    private String introduction;
    private String avatar;
    private String githubHomepage;
    private String csdnHomepage;
    private String giteeHomepage;
    private String zhihuHomepage;
}