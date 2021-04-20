package com.example.demo.controller;

import com.example.base.BaseResponse;
import com.example.base.ReturnType;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 41127
 */
@RestController
@RequestMapping(path = "/userInfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(path = "/getAllUserInfo")
    public Object getAllUserInfo(){
        return new BaseResponse<>(userInfoService.getAllUserInfo(),ReturnType.SUCCESS);
    }
}
