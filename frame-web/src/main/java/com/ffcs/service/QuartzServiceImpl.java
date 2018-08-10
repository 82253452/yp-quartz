package com.ffcs.service;

import com.ffcs.quartz.QuartzMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by admin on 2018/8/8.
 */
@Service("quartzService")
@com.alibaba.dubbo.config.annotation.Service
public class QuartzServiceImpl implements QuartzService {
    public static final int TIME = 1797;

    @Autowired
    private QuartzMethod quartzMethod;


    public int add(String name) {
        return quartzMethod.addJob(name, QuartzExecuteService.class, "data", "gameCountDown", TIME);
    }

    public int delete(String name) {
        return quartzMethod.closeJob(name, "gameCountDown");
    }

    public int pause(String name) {
        return quartzMethod.pauseJob(name, "gameCountDown");
    }

    public void resumeJob(String name) {
        quartzMethod.resumeJob(name, "gameCountDown", TIME);
    }

    public Date getStartTime(String name) {
        return quartzMethod.getJobStartTime(name, "gameCountDown");
    }

    @Override
    public Date getJobNextEndTime(String name) {
        return quartzMethod.getJobNextEndTime(name, "gameCountDown");
    }
}
