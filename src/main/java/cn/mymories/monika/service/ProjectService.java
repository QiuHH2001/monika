package cn.mymories.monika.service;


import cn.mymories.monika.mbg.model.Project;

public interface ProjectService {
    /**
     * 创建项目
     * @param project
     */
    void createProject(Project project) throws Exception;

    /**
     * 删除项目
     * @param projectId
     */
    void deleteProjectById(String projectId);
}
