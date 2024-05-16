package com.yjblog.web.controller;

import com.yjblog.common.aspect.ApiOperationLog;
import com.yjblog.common.utils.Response;
import com.yjblog.web.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 木白
 * @date 2024/5/15
 * @description
 */
@RestController
@Slf4j
public class TestController {

    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response  test(@RequestBody  @Validated User user ){
        // 是否存在校验错误

        // 手动抛异常，入参是前面定义好的异常码枚举，返参统一交给全局异常处理器搞定
        // throw new BizException(ResponseCodeEnum.PRODUCT_NOT_FOUND);
        // 返参
        // return Response.success();
        // 主动定义一个运行时异常，分母不能为零

        return Response.success();
    }

}
