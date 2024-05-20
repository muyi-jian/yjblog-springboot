package com.yjblog.jwt.exception;


import org.springframework.security.core.AuthenticationException;

/**
 * @author 木白
 * @date 2024/5/20
 * @description
 */
public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}
