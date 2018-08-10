package com.ffcs.controller;

import com.ffcs.quartz.QuartzMethod;
import com.ffcs.service.GameReactionService;
import com.ffcs.service.QuartzExecuteService;
import com.ffcs.service.QuartzService;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by admin on 2018/8/8.
 */
@RestController
@RequestMapping("quartz")
public class QuartzController {
    @Autowired
    private QuartzService quartzService;
    @Autowired
    private QuartzMethod quartzMethod;

    @RequestMapping("add")
    public void test() throws SchedulerException {
        quartzMethod.addJob("rank", GameReactionService.class, "data", "gameRank", "0 28 19 ? * 5");
    }
}
