package com.youfan.dao;

import com.youfan.mapper.UserMapper;
import com.youfan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    @Autowired
    UserMapper userMapper;

    public User findUserInfo() {
        return userMapper.findUserInfo();
    }
    public void inseruserInfo(User user) {
        userMapper.inseruserInfo(user);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public User findByUserid(int id) {
        return userMapper.findByUserid(id);
    }
}
