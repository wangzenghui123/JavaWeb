package com.baizhi.web.dao;

import com.baizhi.web.entity.User;

import java.sql.Connection;
import java.util.List;

public interface UserDao {
    User queryUserById(String id, Connection conn);
    int  deleteUserById(String id,Connection conn);
    int  insertUser(User user,Connection conn);
    int  updateUserById(String id,User user,Connection conn);
    List<User> queryAllUser(Connection conn);
}
