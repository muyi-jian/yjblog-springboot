package com.yjblog.common.aspect;

import java.lang.annotation.*;

/**
 * @author 木白
 * @date 2024/5/15
 * @description
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";

}