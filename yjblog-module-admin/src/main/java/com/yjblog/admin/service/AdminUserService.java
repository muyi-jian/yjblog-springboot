package com.yjblog.admin.service;

import com.yjblog.admin.model.vo.UpdateAdminUserPasswordReqVO;
import com.yjblog.common.utils.Response;

/**
 * @author 木白
 * @date 2024/6/2
 * @description
 */
public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);
    /**
     * 获取当前登录用户信息
     * @return
     */
    Response findUserInfo();
}
