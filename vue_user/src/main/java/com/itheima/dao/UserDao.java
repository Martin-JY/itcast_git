package com.itheima.dao;

import com.itheima.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA
 * User:Martin
 * Date:2018/10/18
 * Time:21:02
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
