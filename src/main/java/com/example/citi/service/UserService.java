package com.example.citi.service;

import com.example.citi.model.UserInfo;

public interface UserService {

    /**
     * 登录
     * @param userInfo userInfo
     * @return int
     * @throws RuntimeException 运行时异常
     */
    int login(UserInfo userInfo) throws RuntimeException;
}
