package cn.mymories.monika.service.impl;
/*
 * @author MintureYe
 * @project monika
 * @date 2021/11/24 15:24
 */

import com.github.pagehelper.PageHelper;
import cn.mymories.monika.mbg.mapper.TestMapper;
import cn.mymories.monika.mbg.model.Test;
import cn.mymories.monika.mbg.model.TestExample;
import cn.mymories.monika.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> listAllTest() {
        return testMapper.selectByExample(new TestExample());
    }

    @Override
    public int createTest(Test test) {
        return testMapper.insertSelective(test);
    }

    @Override
    public int updateTest(Integer id, Test test) {
        test.setId(id);
        return testMapper.updateByPrimaryKeySelective(test);
    }

    @Override
    public int deleteTest(Integer id) {
        return testMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Test> listTest(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return testMapper.selectByExample(new TestExample());
    }

    @Override
    public Test getTest(Integer id) {
        return testMapper.selectByPrimaryKey(id);
    }
}
