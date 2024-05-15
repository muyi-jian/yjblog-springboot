package com.yjblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.yjblog.*"}) // 多模块项目中，必需手动指定扫描 com.quanxiaoha.weblog 包下面的所有类
public class YjblogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(YjblogWebApplication.class, args);
    }

}
