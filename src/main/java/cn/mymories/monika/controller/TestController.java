package cn.mymories.monika.controller;

import cn.mymories.monika.common.api.CommonPage;
import cn.mymories.monika.common.api.CommonResult;
import cn.mymories.monika.mbg.model.Test;
import cn.mymories.monika.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * @author MintureYe
 * @project monika
 * @date 2021/11/24 14:26
 */

@Api(tags = "TestController", description = "Test表内容管理")
@Controller
@RequestMapping("/Test")
public class TestController{
    @Autowired
    private TestService demoService;

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @ApiOperation("获取所有test列表")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Test>> getBrandList() {
        return CommonResult.success(demoService.listAllTest());
    }

    @ApiOperation("添加test")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createBrand(@RequestBody Test test) {
        CommonResult commonResult;
        int count = demoService.createTest(test);
        if (count == 1) {
            commonResult = CommonResult.success(test);
            LOGGER.debug("createBrand success:{}", test);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("createBrand failed:{}", test);
        }
        return commonResult;
    }

    @ApiOperation("更新指定test信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateBrand(@PathVariable("id") Integer id, @RequestBody Test testDto, BindingResult result) {
        CommonResult commonResult;
        int count = demoService.updateTest(id, testDto);
        if (count == 1) {
            commonResult = CommonResult.success(testDto);
            LOGGER.debug("updateTest success:{}", testDto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("updateTest failed:{}", testDto);
        }
        return commonResult;
    }

    @ApiOperation("删除指定的test信息")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult deleteBrand(@PathVariable("id") Integer id) {
        int count = demoService.deleteTest(id);
        if (count == 1) {
            LOGGER.debug("deleteTest success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deleteTest failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("分页查询test列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Test>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                    @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        List<Test> testList = demoService.listTest(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(testList));
    }

    @ApiOperation("获取指定test详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Test> brand(@PathVariable("id") Integer id) {
        return CommonResult.success(demoService.getTest(id));
    }
}
