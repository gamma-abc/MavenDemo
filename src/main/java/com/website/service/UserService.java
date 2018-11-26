package com.website.service;

import com.website.bean.User;
import com.website.dao.UserDao;

import java.util.List;

public class UserService {
    private UserDao userDao;
    public User getUserById(int userId){
        return userDao.getUserById(int userId);
    }
}
