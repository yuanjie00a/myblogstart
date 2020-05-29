package com.my.blog.web.myblog.service.impl;

import com.my.blog.web.myblog.bean.User;
import com.my.blog.web.myblog.dao.UserMapper;
import com.my.blog.web.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User findUserById(Integer id) {
        User userById = userMapper.getUserById(id);
        return userById;
    }
}
