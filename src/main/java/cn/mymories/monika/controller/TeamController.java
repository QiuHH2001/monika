package cn.mymories.monika.controller;

import cn.mymories.monika.common.api.CommonResult;
import cn.mymories.monika.common.api.IErrorCode;
import cn.mymories.monika.common.api.ResultCode;
import cn.mymories.monika.mbg.model.Team;
import cn.mymories.monika.mbg.model.User;
import cn.mymories.monika.service.TeamService;
import cn.mymories.monika.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Api(tags = "TeamController", description = "Team表内容管理")
@RestController
public class TeamController {

    @Autowired
    private UserService userService;

    @Autowired
    private TeamService teamService;

    @ApiOperation("获取当前登录用户的所有团队")
    @GetMapping("/getJoinedTeam")
    public CommonResult<List<Team>> getJoinedTeam(){

        String userName = "qhh";
        User user = userService.findUserByUserName(userName);
        String userId = user.getId();
        List<Team> teamList = teamService.listJoinedTeam(userId);
        return CommonResult.success(teamList);
    }

    @ApiOperation("创建团队")
    @PostMapping("/createTeam")
    public CommonResult createTeam(HttpServletRequest request, @RequestBody Team team){
        try {
//            String token = request.getHeader("token");
//            User user = userService.findUserByToken(token);
            team.setCreatorId("h435g");
            teamService.createTeam(team);
        } catch (Exception e) {
            return CommonResult.failed(ResultCode.FAILED);
        }
        return CommonResult.success(ResultCode.SUCCESS);
    }



    @ApiOperation("获取团队详细信息")
    @PostMapping("/getTeamDetail")
    public CommonResult<Team> getTeamDetail(@RequestBody String teamId){
        Team team = teamService.listTeamDetail(teamId);
        return CommonResult.success(team);
    }


    @ApiOperation("删除团队")
    @PutMapping("/deleteTeam")
    public CommonResult deleteTeam(@RequestBody String teamId){
        teamService.deleteTeam(teamId);
        return CommonResult.success(ResultCode.SUCCESS);
    }

}
