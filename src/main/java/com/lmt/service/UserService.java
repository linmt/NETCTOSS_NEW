package com.lmt.service;

import com.lmt.entity.User;
import com.lmt.util.NoteResult;

/**
 * Created by 张洲徽 on 2018/11/29.
 */
public interface UserService {
    public NoteResult<User> checkLogin(String name,String password);
}
