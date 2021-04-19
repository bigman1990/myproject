package com.example.demo.service.impl;

import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public Object getAllUserInfo() {

        return userInfoMapper.getAllUserInfo();
    }
}
