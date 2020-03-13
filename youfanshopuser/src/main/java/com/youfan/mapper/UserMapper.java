package com.youfan.mapper;

import com.youfan.model.User;
import com.youfan.vo.UserVo;

import java.util.List;

public interface UserMapper {

    public void deleteUserById(int id);

    public void insertUserInfo(User user);

    public void updateUser(User user);

    public User findByUserid(int id);

    public List<User> queryUserByVo(UserVo userVo);
}
