package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User:Martin
 * Date:2018/10/18
 * Time:21:03
 */
public interface UserService {
    List<User> findAll();

    User findOne(Integer id);

    void update(User user);
}
