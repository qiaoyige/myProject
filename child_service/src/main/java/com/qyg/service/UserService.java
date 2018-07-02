package com.qyg.service;

import com.qyg.dao.UserDao;

/**
 * Created by gege on 2018/7/1.
 */
public class UserService {

    public String findById(String id){
        UserDao userDao = new UserDao();

        return userDao.selectById(id);
    }
}
