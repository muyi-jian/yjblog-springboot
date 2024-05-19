package com.yjblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 木白
 * @date 2024/5/19
 * @description Mybatis Plus 配置文件
 */
@Configuration
@MapperScan("com.yjblog.common.domain.mapper")
public class MybatisPlusConfig {
}
