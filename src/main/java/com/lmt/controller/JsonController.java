package com.lmt.controller;

import com.lmt.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 热带雨林 on 2018/11/22.
 * 用注解向浏览器返回json
 */
@Controller
public class JsonController {
    @RequestMapping(value="/json1.form")
    @ResponseBody  //调用json
    public User loadUser(){
        User u=new User(1,"Tom",20);
        return u;
    }
}
