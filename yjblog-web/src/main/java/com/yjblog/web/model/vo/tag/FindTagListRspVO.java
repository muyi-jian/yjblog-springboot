package com.yjblog.web.model.vo.tag;

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
public class FindTagListRspVO {
    private Long id;
    private String name;
}
