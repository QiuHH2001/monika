package cn.mymories.monika.mbg.mapper;

import cn.mymories.monika.mbg.model.UserTeam;
import cn.mymories.monika.mbg.model.UserTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTeamMapper {
    long countByExample(UserTeamExample example);

    int deleteByExample(UserTeamExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserTeam record);

    int insertSelective(UserTeam record);

    List<UserTeam> selectByExample(UserTeamExample example);

    UserTeam selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserTeam record, @Param("example") UserTeamExample example);

    int updateByExample(@Param("record") UserTeam record, @Param("example") UserTeamExample example);

    int updateByPrimaryKeySelective(UserTeam record);

    int updateByPrimaryKey(UserTeam record);

    List<UserTeam> selectByTeamId(String teamId);

    void updateDeleteTimeByTeamId(String teamId);
}