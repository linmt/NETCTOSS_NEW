package com.lmt.controller;

import com.lmt.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 用注解向浏览器返回json
 */
@Controller
public class JsonController {
    @RequestMapping("/json1.form")
    @ResponseBody  //调用json
    public User loadUser(){
        User u=new User(1,"Tom",20);
        return u;
    }
    @RequestMapping("/json2.form")
    @ResponseBody
    public List<User> loadUsers(){
        List<User> users=new ArrayList<User>();
        User u1=new User(1,"Tom",20);
        User u2=new User(2,"David",23);
        users.add(u1);
        users.add(u2);
        return users;
    }
}
