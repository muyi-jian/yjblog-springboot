package com.yjblog.web.controller;

import com.yjblog.common.aspect.ApiOperationLog;
import com.yjblog.common.utils.JsonUtil;
import com.yjblog.common.utils.Response;
import com.yjblog.web.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author 木白
 * @date 2024/5/15
 * @description
 * `@Api` : 此注解作用于 controller 之上，用于描述相关职责
 * `@ApiOperation` : 此注解作用于接口上，用于描述接口干啥的；
 */
@RestController
@Slf4j
@Api(tags = "首页模块")
public class TestController {

    @PostMapping("/admin/test")
    @ApiOperationLog(description = "测试接口")
    @ApiOperation(value = "测试接口")
    public Response  test(@RequestBody  @Validated User user ){
        // 是否存在校验错误
        // 打印入参
        log.info(JsonUtil.toJsonString(user));

        // 设置三种日期字段值
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateDate(LocalDate.now());
        user.setTime(LocalTime.now());

        // 手动抛异常，入参是前面定义好的异常码枚举，返参统一交给全局异常处理器搞定
        // throw new BizException(ResponseCodeEnum.PRODUCT_NOT_FOUND);
        // 返参
        // return Response.success();
        // 主动定义一个运行时异常，分母不能为零
        return Response.success(user);
    }

}
