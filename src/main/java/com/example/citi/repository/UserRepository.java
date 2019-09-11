package com.example.citi.repository;

import com.example.citi.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo, Long> {

    /**
     * 查询用户
     * @param username username
     * @param password password
     * @return UserInfo
     */
    UserInfo findByUsernameAndPassword(String username, String password);
}
