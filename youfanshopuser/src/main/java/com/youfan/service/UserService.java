package com.youfan.service;

import com.youfan.dao.UserDao;
import com.youfan.model.User;
import com.youfan.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public void insertUserInfo(User user) {
        userDao.insertUserInfo(user);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public User findByUserid(int id) {
        return userDao.findByUserid(id);
    }

    public List<User> queryUserByVo(UserVo userVo) {
        return userDao.queryUserByVo(userVo);
    }

    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }
}
