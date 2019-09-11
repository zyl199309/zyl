package com.example.citi.controller;

import com.example.citi.model.UserInfo;
import com.example.citi.service.UserService;
import com.example.citi.util.ResultUtil;
import com.example.citi.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api("用户管理")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResultVO login(@RequestBody UserInfo userInfo) {
        try {
            int result = userService.login(userInfo);
            return ResultUtil.setResultVO("1", "succeed", result);
        } catch (Exception e) {
            return ResultUtil.setResultVO("0", "failed", null);
        }
    }
}
