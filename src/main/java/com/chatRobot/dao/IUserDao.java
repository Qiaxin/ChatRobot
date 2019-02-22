package com.chatRobot.dao;

import com.chatRobot.model.User;

public interface IUserDao {

    User selectUser(long id);

    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(int id);

}