package com.team.dao;

import com.team.pojo.Team;
import com.team.util.SearchInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Team_dao {
    @Select("SELECT * FROM team ${where} ${limit}")
    public List<Team> getAllTeam(SearchInfo info);
    @Select("SELECT COUNT(*) FROM team")
    public int getTeamCount();
    @Insert("INSERT INTO team (teamName,CapName,capTel,teaName,status) VALUES('${teamName}','${capName}','${teaName}','${introduce}',1)")
    public int insert(Team team);
    @Delete("DELETE FROM team WHERR teamName='${teamName}'")
    public int delTeam(@Param("teamName") String teamName);
    @Select("SELECT * FROM team WHERE teamName='${teamName}'")
    public List<Team> getTeamForName(@Param("teamName") String teamName);
    @Update("UPDATE team SET teamName=#{teamName},capName=#{capName},capTel=#{capTel},teaName=#{teaName},introduce=#{introduce} WHERE teamName=#{teamName}")
    public int updateTeam(Team team);
}
