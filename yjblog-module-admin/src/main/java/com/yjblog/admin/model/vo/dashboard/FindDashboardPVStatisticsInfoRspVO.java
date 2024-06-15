package com.yjblog.admin.model.vo.dashboard;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 木白
 * @date 2024/6/15
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "查询仪表盘文章 PV 访问量信息入参 VO")
public class FindDashboardPVStatisticsInfoRspVO {
    /**
     * 日期集合
     */
    private List<String> pvDates;

    /**
     * PV 浏览量集合
     */
    private List<Long> pvCounts;
}
