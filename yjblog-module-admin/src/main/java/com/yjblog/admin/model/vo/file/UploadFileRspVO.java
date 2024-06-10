package com.yjblog.admin.model.vo.file;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 木白
 * @date 2024/6/5
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UploadFileRspVO {

    /**
     * 文件的访问链接
     */
    private String url;

}
