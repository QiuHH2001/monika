package cn.mymories.monika.service.impl;
import cn.mymories.monika.mbg.model.UserExample;
import cn.mymories.monika.mbg.mapper.UserMapper;
import cn.mymories.monika.mbg.model.User;
import cn.mymories.monika.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByUserName(String userName) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(userName);
        List<User> userList = userMapper.selectByExample(example);
        return userList.get(0);
    }

    @Override
    public User findUserByToken(String token) {
        User user = userMapper.findUserByToken(token);
        return user;
    }
}
