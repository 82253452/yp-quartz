package com.ffcs.quartz;

import org.quartz.*;
import org.quartz.core.jmx.JobDetailSupport;
import org.quartz.impl.triggers.SimpleTriggerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.quartz.DailyTimeIntervalTrigger.REPEAT_INDEFINITELY;

@Component
public class QuartzMethod {
    @Autowired
    private Scheduler scheduler;

    public int addJob(String jobName, Class<? extends Job> job, Object data, String jobGroupName, int seconds) {
        try {
            // 判断任务是否存在
            JobKey jobKey = JobKey.jobKey(jobName, jobGroupName);
            if (scheduler.checkExists(jobKey)) {
                return 1;
            }
            // 创建一个JobDetail实例，指定SimpleJob
            Map<String, Object> JobDetailmap = new HashMap<String, Object>();
            JobDetailmap.put("name", jobName);// 设置任务名字
            JobDetailmap.put("group", jobGroupName);// 设置任务组
            JobDetailmap.put("jobClass", job.getCanonicalName());// 指定执行类
            // Task.class.getCanonicalName()
            JobDetail jobDetail = JobDetailSupport.newJobDetail(JobDetailmap);
            // 添加数据内容
            jobDetail.getJobDataMap().put("data", data);// 传输的上下文
            // 通过SimpleTrigger定义调度规则：马上启动，每2秒运行一次，共运行100次 等。。。。
            SimpleTriggerImpl simpleTrigger = new SimpleTriggerImpl();
            simpleTrigger.setName(jobName);
            simpleTrigger.setGroup(jobGroupName);
            // 什么时候开始执行
            simpleTrigger.setStartTime(new Date(new Date().getTime() + 1000 * seconds));
            // 间隔时间
            simpleTrigger.setRepeatInterval(1000 * seconds);
            // 最多执行次数 默认执行一次
            simpleTrigger.setRepeatCount(REPEAT_INDEFINITELY);
            // 通过SchedulerFactory获取一个调度器实例
            scheduler.scheduleJob(jobDetail, simpleTrigger);//  注册并进行调度
            scheduler.start();// ⑤调度启动
            return 0;// 添加成功
        } catch (Exception e) {
            // e.printStackTrace();
            return 2;// 操作异常
        }
    }

    public int addJob(String jobName, Class<? extends Job> job, Object data, String jobGroupName, String cronExpression) {
        try {
            // 判断任务是否存在
            JobKey jobKey = JobKey.jobKey(jobName, jobGroupName);
            if (scheduler.checkExists(jobKey)) {
                return 1;
            }
            //构建job信息
            JobDetail jobDetail = JobBuilder.newJob(job).withIdentity(jobName, jobGroupName).build();

            //表达式调度构建器(即任务执行的时间)
            CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cronExpression);

            //按新的cronExpression表达式构建一个新的trigger
            CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(jobName, jobGroupName)
                    .withSchedule(scheduleBuilder).build();
            scheduler.scheduleJob(jobDetail, trigger);
            return 0;
        } catch (SchedulerException e) {
            return 2;
        }
    }

    /**
     * 关闭任务调度
     *
     * @param jobName 任务名称
     * @return 0 关闭成功 1： 关闭失败 2：操作异常
     */
    public int closeJob(String jobName, String jobGorupName) {
        // 关闭任务调度
        try {
            JobKey jobKey = JobKey.jobKey(jobName, jobGorupName);
            return scheduler.deleteJob(jobKey) == true ? 0 : 1;
        } catch (SchedulerException e) {
            // e.printStackTrace();
            return 2;
        }
    }

    /**
     * 获取任务调度开始时间
     *
     * @param jobName 任务名称
     * @return Date
     */
    public Date getJobStartTime(String jobName, String jobGorupName) {
        try {
            TriggerKey triggerKey = new TriggerKey(jobName, jobGorupName);
            return scheduler.getTriggerState(triggerKey) == Trigger.TriggerState.PAUSED ? null : scheduler.getTrigger(triggerKey).getPreviousFireTime();
        } catch (SchedulerException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取任务调度下次结束时间
     *
     * @param jobName 任务名称
     * @return Date
     */
    public Date getJobNextEndTime(String jobName, String jobGorupName) {
        try {
            TriggerKey triggerKey = new TriggerKey(jobName, jobGorupName);
            return scheduler.getTriggerState(triggerKey) == Trigger.TriggerState.PAUSED ? null : scheduler.getTrigger(triggerKey).getNextFireTime();
        } catch (SchedulerException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 暂停任务调度
     *
     * @param jobName 任务名称
     * @return 0 关闭成功 1： 关闭失败 2：操作异常
     */
    public int pauseJob(String jobName, String jobGorupName) {
        // 暂停任务调度
        try {
            JobKey jobKey = JobKey.jobKey(jobName, jobGorupName);
            scheduler.pauseJob(jobKey);
            return 1;
        } catch (SchedulerException e) {
            // e.printStackTrace();
            return 2;
        }
    }

    /**
     * 从数据库中找到已经存在的job，并重新开户调度
     */
    public void resumeJob(String jobName, String jobGorupName, int seconds) {
        try {

            TriggerKey triggerKey = TriggerKey.triggerKey(jobName, jobGorupName);
            SimpleTriggerImpl trigger = (SimpleTriggerImpl) scheduler.getTrigger(triggerKey);
            trigger.setStartTime(new Date(new Date().getTime() + 1000 * seconds));
            trigger.setRepeatInterval(1000 * seconds);
            trigger.setRepeatCount(REPEAT_INDEFINITELY);
            trigger.setNextFireTime(new Date(new Date().getTime() + 1000 * seconds));
            Date d = scheduler.rescheduleJob(triggerKey, trigger);
            JobKey jobKey = JobKey.jobKey(jobName, jobGorupName);
            scheduler.resumeJob(jobKey);
        } catch (SchedulerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 从数据库中找到已经存在的job，并重新开户调度
     */
    public void resumeJob() {
        try {
            scheduler.start();
        } catch (SchedulerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
