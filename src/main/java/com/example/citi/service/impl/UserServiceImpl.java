package com.example.citi.service.impl;

import com.example.citi.model.UserInfo;
import com.example.citi.repository.UserRepository;
import com.example.citi.service.UserService;
import com.example.citi.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    /**
     * 登录
     * @param userInfo userInfo
     * @return int
     * @throws RuntimeException 运行时异常
     */
    @Override
    public int login(UserInfo userInfo) throws RuntimeException{
        if (userInfo.getUsername() == null || userInfo.getPassword() == null) {
            throw new RuntimeException("参数不为空");
        }
        UserInfo userInfo1 = userRepository.findByUsernameAndPassword(userInfo.getUsername(), userInfo.getPassword());
        if (userInfo1 == null) {
            throw new RuntimeException("用户名或密码错误");
        }
        CommonUtil.setId(userInfo1.getId());
        return userInfo1.getType();
    }
}
