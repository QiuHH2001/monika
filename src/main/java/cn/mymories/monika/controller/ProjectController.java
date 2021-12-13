package cn.mymories.monika.controller;

import cn.mymories.monika.common.api.CommonResult;
import cn.mymories.monika.common.api.ResultCode;
import cn.mymories.monika.service.ProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "ProjectController", description = "Project表内容管理")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

//    @ApiOperation("创建项目")
//    @PostMapping("/createProject")
//    public CommonResult createProject(@RequestBody ProjectParam projectParam){
//        try {
//            projectService.createProject(projectParam);
//        }catch (Exception e){
//            return CommonResult.failed("字段不能为空");
//        }
//        return CommonResult.success(ResultCode.SUCCESS);
//    }

}
