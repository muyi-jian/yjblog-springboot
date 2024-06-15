package com.yjblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan({"com.yjblog.*"})// 多模块项目中，必需手动指定扫描 com.quanxiaoha.weblog 包下面的所有类
@EnableScheduling // 启用定时任务
public class YjblogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(YjblogWebApplication.class, args);
    }

}
