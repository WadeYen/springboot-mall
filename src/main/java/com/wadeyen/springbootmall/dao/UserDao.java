package com.wadeyen.springbootmall.dao;

import com.wadeyen.springbootmall.dto.UserRegisterRequest;
import com.wadeyen.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
