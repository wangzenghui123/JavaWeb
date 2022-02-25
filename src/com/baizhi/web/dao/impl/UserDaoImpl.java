package com.baizhi.web.dao.impl;

import com.baizhi.web.dao.BaseDao;
import com.baizhi.web.dao.UserDao;
import com.baizhi.web.entity.User;

import java.sql.Connection;
import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User queryUserById(String id, Connection conn) {

        return null;
    }

    @Override
    public int deleteUserById(String id, Connection conn) {
        return 0;
    }

    @Override
    public int insertUser(User user, Connection conn) {
        return 0;
    }

    @Override
    public int updateUserById(String id, User user, Connection conn) {
        return 0;
    }

    @Override
    public List<User> queryAllUser(Connection conn) {
        return null;
    }
}
