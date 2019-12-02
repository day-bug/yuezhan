package com.gaoshu.service;

import com.gaoshu.pojo.Team;

import java.util.List;

public interface TeamService {
    //查询球队信息
    public List<Team> selectTeams();
}
