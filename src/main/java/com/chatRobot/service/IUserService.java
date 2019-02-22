package com.chatRobot.service;

import com.chatRobot.model.User;

public interface IUserService {

    User selectUser(long userId);

    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}