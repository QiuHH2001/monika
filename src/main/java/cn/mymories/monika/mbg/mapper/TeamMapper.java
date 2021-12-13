package cn.mymories.monika.mbg.mapper;

import cn.mymories.monika.mbg.model.Team;
import cn.mymories.monika.mbg.model.TeamExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TeamMapper {
    long countByExample(TeamExample example);

    int deleteByExample(TeamExample example);

    int deleteByPrimaryKey(String id);

    int insert(Team record);

    int insertSelective(Team record);

    List<Team> selectByExample(TeamExample example);

    Team selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);

    List<Team> listJoinedTeamAndCreator(String userId);

    void updateTeamDetailByTeamId(String id, String name, String description);

    void updateDeleteTimeById(String teamId);

    Team selectById(String teamId);
}