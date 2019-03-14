package com.guli.statistics.service;

import com.guli.statistics.entity.Daily;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 网站统计日数据 服务类
 * </p>
 *
 * @author Zhang
 * @since 2019-03-13
 */
public interface DailyService extends IService<Daily> {
    void createStatisticsByDay(String day);
}
