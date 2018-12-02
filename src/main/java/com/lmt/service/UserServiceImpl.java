package com.lmt.service;

import com.lmt.dao.UserDao;
import com.lmt.entity.User;
import com.lmt.entity.NoteResult;
import com.lmt.util.NoteUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;

/**
 * Created by 张洲徽 on 2018/11/29.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public NoteResult<User> checkLogin(String name, String password) throws NoSuchAlgorithmException {
        NoteResult<User> result=new NoteResult<User>();
        User user=userDao.findByName(name);
        if(user==null){
            result.setStatus(1);
            result.setMsg("用户名不存在");
            return result;
        }
        if(!user.getCn_user_password().equals(NoteUtil.md5(password))){
            result.setStatus(2);
            result.setMsg("密码错误");
            return result;
        }
        result.setStatus(0);
        result.setMsg("登录成功");
        //14 发送用户id
        //result.setData(user.getCn_user_id());
        result.setData(user);
        return result;
    }
}
