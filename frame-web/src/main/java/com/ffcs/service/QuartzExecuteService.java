package com.ffcs.service;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by admin on 2018/8/8.
 */
@Component
public class QuartzExecuteService implements Job {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private QuartzService quartzService;
    public static final int MAXCount = 15;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        String key = jobExecutionContext.getJobDetail().getKey().getName();
        Integer count = Integer.valueOf(stringRedisTemplate.opsForHash().get("game-info-current", key).toString());
        if (count != null) {
            if (count.intValue() < MAXCount) {
                stringRedisTemplate.opsForHash().increment("game-info-current", key, 1);
            } else {
                quartzService.pause(key);
            }
        }
    }
}
