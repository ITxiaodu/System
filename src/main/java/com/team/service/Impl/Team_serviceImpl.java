package com.team.service.Impl;

import com.team.dao.Team_dao;
import com.team.pojo.Team;
import com.team.service.Team_service;
import com.team.util.SearchInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Team_serviceImpl implements Team_service{
    @Resource
    Team_dao team_dao;

    @Override
    public List<Team> getAllTeam(SearchInfo info){
        return team_dao.getAllTeam(info);
    }

    @Override
    public int getTeamCount(){
        return getTeamCount();
    }

    @Override
    public int insert(Team team){
        return insert(team);
    }

    @Override
    public int delTeam(String TeamName){
        return delTeam(TeamName);
    }

    @Override
    public List<Team> getTeamForName(String TeamName){
        return getTeamForName(TeamName);
    }

    @Override
    public int updateTeam(Team team){
        return updateTeam(team);
    }
}
