package com.ffcs.mapper;

import com.ffcs.entity.GameReaction;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface GameReactionMapper extends Mapper<GameReaction> {
    List<GameReaction> queryRank(Map<String, Object> map);
}