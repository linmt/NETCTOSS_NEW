package com.lmt.dao;

import com.lmt.entity.User;

/**
 * Created by 张洲徽 on 2018/11/26.
 */
public interface UserDao {
    public User findByName(String name);
    public void save(User user);
}
