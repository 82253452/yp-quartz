package com.ffcs.service;

import java.util.Date;

/**
 * Created by admin on 2018/8/8.
 */
public interface QuartzService {

    public int add(String name);

    public int delete(String name);

    public int pause(String name);

    public void resumeJob(String name);

    public Date getStartTime(String name);

    public Date getJobNextEndTime(String name);
}
