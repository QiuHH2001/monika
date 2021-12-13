package cn.mymories.monika.service;

import cn.mymories.monika.mbg.model.Team;


import java.util.List;

public interface TeamService {
    /**
     * 获取当前登录用户加入的团队
     * @param userId
     * @return
     */
    List<Team> listJoinedTeam(String userId);

    /**
     * 创建团队
     * @param team
     */
    void createTeam(Team team) throws Exception;

    /**
     * 根据团队ID获取团队详细信息
     * @param teamId
     * @return
     */
    Team listTeamDetail(String teamId);


    /**
     * 根据团队ID删除团队
     * @param teamId
     */
    void deleteTeam(String teamId);
}
