package cn.mymories.monika.service.impl;

import cn.mymories.monika.mbg.mapper.ProjectMapper;
import cn.mymories.monika.mbg.mapper.TeamMapper;
import cn.mymories.monika.mbg.mapper.UserMapper;
import cn.mymories.monika.mbg.mapper.UserTeamMapper;
import cn.mymories.monika.mbg.model.*;
import cn.mymories.monika.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamMapper teamMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProjectMapper projectMapper;

    @Resource
    private UserTeamMapper userTeamMapper;

    /**
     * 获取当前登录用户所在团队信息
     * 1、根据用户ID获取所在团队及其创建者列表
     * 2、根据团队ID查询团队成员列表
     * 3、根据团队ID查询项目列表
     * @param userId
     * @return
     */
    @Override
    public List<Team> listJoinedTeam(String userId) {

//        获取当前登录用户ID
//        String id = ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();

//        1、根据用户ID获取所在团队及其创建者列表
        List<Team> teamList = teamMapper.listJoinedTeamAndCreator(userId);

        for (Team team : teamList) {
            String teamId = team.getId();

//        2、根据团队ID查询团队成员列表
            List<User> memberList = userMapper.listMemberByTeamId(teamId);
            team.setMemberList(memberList);

//        3、根据团队ID查询项目列表
            List<Project> projectList = projectMapper.listProjectByTeamId(teamId);
            team.setProjectList(projectList);
        }
        return teamList;
    }

    /**
     * 创建团队
     * 1、在team表中插入一条记录
     * 2、在user_team表中插入创建者
     * 3、在user_team表中插入成员
     * @param team
     */
    @Override
    @Transactional
    public void createTeam(Team team) throws Exception{
        if (team.getName().equals("")
                || team.getDescription().equals("")
                || team.getMemberList().equals("")){
            throw new Exception("字段不能为空");
        }

//        1、在team表中插入一条记录
        String teamUuid = UUID.randomUUID().toString().replaceAll("-", "");
        team.setId(teamUuid);
        team.setCreateTime(new Date(System.currentTimeMillis()));
        teamMapper.insertSelective(team);

//        2、在user_team表中插入创建者
        UserTeam userTeam = new UserTeam();
        String userTeamUuid = UUID.randomUUID().toString().replaceAll("-", "");
        userTeam.setId(userTeamUuid);
        userTeam.setPkUserId(team.getCreatorId());
        userTeam.setPkTeamId(teamUuid);
        userTeam.setCreateTime(new Date(System.currentTimeMillis()));
        userTeamMapper.insertSelective(userTeam);

//        3、在user_team表中插入成员
        List<User> memberList = team.getMemberList();
        for (User member : memberList) {
            userTeam = new UserTeam();
            userTeamUuid = UUID.randomUUID().toString().replaceAll("-", "");
            userTeam.setId(userTeamUuid);
            userTeam.setPkUserId(member.getId());
            userTeam.setPkTeamId(teamUuid);
            userTeam.setCreateTime(new Date(System.currentTimeMillis()));
            userTeamMapper.insertSelective(userTeam);
        }

    }

    @Override
    public Team listTeamDetail(String teamId) {
        Team team = teamMapper.selectById(teamId);
        List<User> memberVoList = userMapper.listMemberByTeamId(teamId);
        team.setMemberList(memberVoList);
        return team;
    }

    /**
     * 删除团队
     * 1、查找此团队的项目，若存在，则设置project表的删除时间
     * 2、查找此团队的成员，若存在，则设置user_team表的删除时间
     * 3、设置team表的删除时间
     * @param teamId
     */
    @Override
    public void deleteTeam(String teamId) {
//        1、查找此团队的项目，若存在，则设置project表的删除时间
        List<Project> projectList = projectMapper.selectProjectIdByTeamId(teamId);
        if (!projectList.isEmpty()){
//            不为空，设置project表的删除时间
            for (Project project : projectList) {
                project.setDeleteTime(new Date(System.currentTimeMillis()));
                projectMapper.updateByPrimaryKeySelective(project);
            }
        }

//        2、查找此团队的成员，若存在，则设置user_team表的删除时间
        List<UserTeam> userTeamList = userTeamMapper.selectByTeamId(teamId);
        for (UserTeam userTeam : userTeamList) {
            System.out.println(userTeam.getPkUserId());
        }
        System.out.println("hhh");
        if (!userTeamList.isEmpty()){
//            不为空，设置user_team表的删除时间
            userTeamMapper.updateDeleteTimeByTeamId(teamId);
        }

//        3、设置team表的删除时间
        teamMapper.updateDeleteTimeById(teamId);
    }


}
