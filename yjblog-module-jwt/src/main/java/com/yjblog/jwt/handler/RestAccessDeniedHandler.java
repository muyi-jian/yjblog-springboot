package com.yjblog.jwt.handler;

import com.yjblog.common.utils.Response;
import com.yjblog.common.enums.ResponseCodeEnum;
import com.yjblog.jwt.util.ResultUtil;
import io.jsonwebtoken.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 木白
 * @date 2024/5/20
 * @description 登录成功访问收保护的资源，但是权限不够
 */
@Slf4j
@Component
public class RestAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException, java.io.IOException {
        log.warn("登录成功访问收保护的资源，但是权限不够: ", accessDeniedException);
        // 预留，后面引入多角色时会用到
        ResultUtil.fail(response, Response.fail(ResponseCodeEnum.FORBIDDEN));
        // 预留，后面引入多角色时会用到
    }
}
