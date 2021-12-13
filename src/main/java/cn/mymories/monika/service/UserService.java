package cn.mymories.monika.service;

import cn.mymories.monika.mbg.model.User;

public interface UserService {
    /**
     * 根据当前登录用户的用户名查找用户
     * @param userName
     * @return
     */
    User findUserByUserName(String userName);

    /**
     * 根据token获取当前调用接口的用户
     * @param token
     * @return
     */
    User findUserByToken(String token);
}
