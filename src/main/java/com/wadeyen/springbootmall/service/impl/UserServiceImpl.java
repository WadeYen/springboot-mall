package com.wadeyen.springbootmall.service.impl;

import com.wadeyen.springbootmall.dao.UserDao;
import com.wadeyen.springbootmall.dto.UserRegisterRequest;
import com.wadeyen.springbootmall.model.User;
import com.wadeyen.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
