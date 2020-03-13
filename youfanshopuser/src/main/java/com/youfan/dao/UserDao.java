package com.youfan.dao;

import com.youfan.mapper.UserMapper;
import com.youfan.model.User;
import com.youfan.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDao {

    @Autowired
    UserMapper userMapper;

    public void insertUserInfo(User user) {
        userMapper.insertUserInfo(user);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public User findByUserid(int id) {
        return userMapper.findByUserid(id);
    }

    public List<User> queryUserByVo(UserVo userVo) {
        return userMapper.queryUserByVo(userVo);
    }

    public void deleteUserById(int id){
        userMapper.deleteUserById(id);
    }
}
