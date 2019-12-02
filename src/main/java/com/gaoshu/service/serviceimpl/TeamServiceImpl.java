package com.gaoshu.service.serviceimpl;

import com.gaoshu.mapper.TeamMapper;
import com.gaoshu.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamMapper tm;

    //查询球队信息
    public List<Team> selectTeams(){
        

        return tm.selectAll();
    }
}
