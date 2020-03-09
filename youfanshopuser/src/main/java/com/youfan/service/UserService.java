package com.youfan.service;

import com.youfan.dao.UserDao;
import com.youfan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User findUserInfo() {
        return userDao.findUserInfo();
    }

    public void inseruserInfo(User user) {
        userDao.inseruserInfo(user);
    }
}
