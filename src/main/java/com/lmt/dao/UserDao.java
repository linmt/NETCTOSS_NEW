package com.lmt.dao;

import com.lmt.annotation.MybatisDao;
import com.lmt.entity.User;

/**
 * Created by 张洲徽 on 2018/11/26.
 */
@MybatisDao
public interface UserDao {
    public User findByName(String name);
    public void save(User user);
}
