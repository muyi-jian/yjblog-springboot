package com.yjblog.common.constant;

import java.time.format.DateTimeFormatter;

/**
 * @author 木白
 * @date 2024/6/15
 * @description
 */
public interface Constants {
    /**
     * 月-日 格式
     */
    DateTimeFormatter MONTH_DAY_FORMATTER = DateTimeFormatter.ofPattern("MM-dd");
}
