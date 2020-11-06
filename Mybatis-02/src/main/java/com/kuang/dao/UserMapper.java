package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 得到全部用户
    public List<User> getUserList();

    // 根据id得到用户
    User getUserById(int id);

    // insert user
    int addUser(User user);

    // modify user
    int updateUser(User user);

    // delete user
    int deleteUser(int id);
}
