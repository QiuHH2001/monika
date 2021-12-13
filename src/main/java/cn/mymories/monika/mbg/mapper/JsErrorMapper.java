package cn.mymories.monika.mbg.mapper;

import cn.mymories.monika.mbg.model.JsError;
import cn.mymories.monika.mbg.model.JsErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JsErrorMapper {
    long countByExample(JsErrorExample example);

    int deleteByExample(JsErrorExample example);

    int deleteByPrimaryKey(String pkProjectId);

    int insert(JsError record);

    int insertSelective(JsError record);

    List<JsError> selectByExample(JsErrorExample example);

    JsError selectByPrimaryKey(String pkProjectId);

    int updateByExampleSelective(@Param("record") JsError record, @Param("example") JsErrorExample example);

    int updateByExample(@Param("record") JsError record, @Param("example") JsErrorExample example);

    int updateByPrimaryKeySelective(JsError record);

    int updateByPrimaryKey(JsError record);
}