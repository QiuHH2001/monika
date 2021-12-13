package cn.mymories.monika.mbg.mapper;

import cn.mymories.monika.mbg.model.Project;
import cn.mymories.monika.mbg.model.ProjectExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProjectMapper {
    long countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int deleteByPrimaryKey(String id);

    int insert(Project record);

    int insertSelective(Project record);

    List<Project> selectByExample(ProjectExample example);

    Project selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

    List<Project> listProjectByTeamId(String teamId);

    List<Project> selectProjectIdByTeamId(String teamId);
}