package com.youfan.mapper;

import com.youfan.model.User;

public interface UserMapper {
    public User findUserInfo();

    public void inseruserInfo(User user);

    public void updateUser(User user);

    public User findByUserid(int id);
}
