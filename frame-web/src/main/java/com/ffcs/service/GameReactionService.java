package com.ffcs.service;

import com.ffcs.entity.GameReaction;
import com.ffcs.entity.SysUserInfo;
import com.ffcs.mapper.GameReactionMapper;
import com.ffcs.mapper.SysUserInfoMapper;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by admin on 2018/8/8.
 */
@Component
public class GameReactionService implements Job {
    @Autowired
    private GameReactionMapper gameReactionMapper;
    @Autowired
    private SysUserInfoMapper sysUserInfoMapper;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", 1);
        map.put("sidx", "times_int");
        map.put("order", "asc");
        List<GameReaction> reacList = gameReactionMapper.queryRank(map);
        Collections.sort(reacList, new Comparator<GameReaction>() {
            @Override
            public int compare(GameReaction o1, GameReaction o2) {
                return o1.getTimesInt().intValue() - o2.getTimesInt().intValue();
            }
        });
        //第1名
        Integer userId = reacList.get(0).getUserid();
        SysUserInfo SysUserInfo = sysUserInfoMapper.selectByPrimaryKey(userId);
        if (SysUserInfo != null) {
            SysUserInfo.setBonusPonits(SysUserInfo.getBonusPonits() + 100000);
            sysUserInfoMapper.updateByPrimaryKey(SysUserInfo);
        }
        //第2名
        Integer userId2 = reacList.get(1).getUserid();
        SysUserInfo SysUserInfo2 = sysUserInfoMapper.selectByPrimaryKey(userId2);
        if (SysUserInfo2 != null) {
            SysUserInfo2.setBonusPonits(SysUserInfo2.getBonusPonits() + 80000);
            sysUserInfoMapper.updateByPrimaryKey(SysUserInfo2);
        }
        //第3名
        Integer userId3 = reacList.get(2).getUserid();
        SysUserInfo SysUserInfo3 = sysUserInfoMapper.selectByPrimaryKey(userId3);
        if (SysUserInfo3 != null) {
            SysUserInfo3.setBonusPonits(SysUserInfo3.getBonusPonits() + 50000);
            sysUserInfoMapper.updateByPrimaryKey(SysUserInfo3);
        }
    }
}
