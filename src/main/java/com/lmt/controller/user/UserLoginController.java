package com.lmt.controller.user;

import com.lmt.service.UserService;
import com.lmt.util.NoteResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by 张洲徽 on 2018/11/29.
 */
@Controller
@RequestMapping("/user")
public class UserLoginController {
    @Resource
    private UserService userService;

    @RequestMapping("/login.form")
    @ResponseBody
    public NoteResult execute(String name,String password){
        //System.out.println("执行execute");
        NoteResult result =userService.checkLogin(name, password);
        return result;
    }
}
