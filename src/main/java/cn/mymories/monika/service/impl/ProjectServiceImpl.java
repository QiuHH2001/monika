package cn.mymories.monika.service.impl;

import cn.mymories.monika.mbg.mapper.ProjectMapper;
import cn.mymories.monika.mbg.model.Project;
import cn.mymories.monika.service.ProjectService;
import cn.mymories.monika.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Autowired
    private TeamService teamService;

    /**
     * 创建项目
     * 1、获取当前登录用户，即为创建者
     * 2、在project表中插入一条记录
     * @param project
     * @throws Exception
     */
    @Override
    @Transactional
    public void createProject(Project project) throws Exception {
        if (project.getName().equals("")
        || project.getDescription().equals("")){
            throw new Exception("字段不能为空");
        }

        String projectUuid = UUID.randomUUID().toString().replaceAll("-", "");
        project.setId(projectUuid);
//        测试，用户bbb创建的项目，后期改成当前登录用户的ID
        project.setPkCreatorId("h435g");
        project.setCreateTime(new Date(System.currentTimeMillis()));
        projectMapper.insertSelective(project);

    }

    /**
     * 删除项目
     * 修改记录的delete_time字段
     * @param projectId
     */
    @Override
    @Transactional
    public void deleteProjectById(String projectId) {
        Project project = new Project();
        project.setId(projectId);
        project.setDeleteTime(new Date(System.currentTimeMillis()));
        projectMapper.updateByPrimaryKeySelective(project);
    }
}
