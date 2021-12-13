package cn.mymories.monika.service.impl;

import cn.mymories.monika.mbg.mapper.ProjectMapper;
import cn.mymories.monika.mbg.model.Project;
import cn.mymories.monika.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

//    @Override
//    @Transactional
//    public void createProject(ProjectParam projectParam) throws Exception {
//        if (projectParam.getName().equals("")
//        || projectParam.getDescription().equals("")){
//            throw new Exception("字段不能为空");
//        }
//
//        Project project = new Project();
//        String projectUuid = UUID.randomUUID().toString().replaceAll("-", "");
//        project.setId(projectUuid);
//        project.setName(projectParam.getName());
//        project.setDescription(projectParam.getDescription());
//        project.setPkTeamId(projectParam.getTeamId());
//        project.setPkCreatorId(projectParam.getCreatorId());
//        project.setCreateTime(new Date(System.currentTimeMillis()));
//        projectMapper.insertSelective(project);
//
//    }
}
