package com.yjblog.admin.service;

import com.yjblog.common.utils.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 木白
 * @date 2024/6/5
 * @description
 */
public interface AdminFileService {
    /**
     * 上传文件
     * @param file
     * @return
     */
    Response uploadFile(MultipartFile file);
}
