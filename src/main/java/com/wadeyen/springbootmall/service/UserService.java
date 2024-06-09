package com.wadeyen.springbootmall.service;

import com.wadeyen.springbootmall.dto.UserRegisterRequest;
import com.wadeyen.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
