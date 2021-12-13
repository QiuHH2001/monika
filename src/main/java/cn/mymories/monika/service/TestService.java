package cn.mymories.monika.service;

import cn.mymories.monika.mbg.model.Test;

import java.util.List;

/*
 * @author MintureYe
 * @project monika
 * @date 2021/11/24 15:07
 */

public interface TestService {
    List<Test> listAllTest();

    int createTest(Test test);

    int updateTest(Integer id, Test test);

    int deleteTest(Integer id);

    List<Test> listTest(int pageNum, int pageSize);

    Test getTest(Integer id);
}
