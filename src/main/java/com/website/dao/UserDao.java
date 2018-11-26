package com.website.dao;

import com.website.bean.User;

import java.util.List;

public class UserDao {
    final static String getUsername="select * from user where id=${id}";

    public List<User> getUserById(int userId){

        return
    }
}
