package cn.mymories.monika.mbg.mapper;

import cn.mymories.monika.mbg.model.Performance;
import cn.mymories.monika.mbg.model.PerformanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerformanceMapper {
    long countByExample(PerformanceExample example);

    int deleteByExample(PerformanceExample example);

    int deleteByPrimaryKey(String pkProjectId);

    int insert(Performance record);

    int insertSelective(Performance record);

    List<Performance> selectByExample(PerformanceExample example);

    Performance selectByPrimaryKey(String pkProjectId);

    int updateByExampleSelective(@Param("record") Performance record, @Param("example") PerformanceExample example);

    int updateByExample(@Param("record") Performance record, @Param("example") PerformanceExample example);

    int updateByPrimaryKeySelective(Performance record);

    int updateByPrimaryKey(Performance record);
}