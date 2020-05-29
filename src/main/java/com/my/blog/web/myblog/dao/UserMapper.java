package com.my.blog.web.myblog.dao;

import com.my.blog.web.myblog.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getUserById(Integer id);
}
