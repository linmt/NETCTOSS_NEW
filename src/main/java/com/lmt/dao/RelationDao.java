package com.lmt.dao;

import com.lmt.annotation.MybatisDao;
import com.lmt.entity.User;

/**
 * Created by 热带雨林 on 2018/12/22.
 */
@MybatisDao
public interface RelationDao {
    public User findUserAndBooks(String userId);
    public User findUserAndBooks2(String userId);
}
