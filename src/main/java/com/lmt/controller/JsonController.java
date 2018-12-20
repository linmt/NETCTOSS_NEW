package com.lmt.controller;

import com.lmt.entity.UserTestJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 用注解向浏览器返回json案例，文件1
 */
@Controller
public class JsonController {
    @RequestMapping("/json1.form")
    @ResponseBody  //调用json
    public UserTestJson loadUser(){
        UserTestJson u=new UserTestJson(1,"Tom",20);
        //制造一个异常，测试AOP
        Integer.valueOf("ad");
        return u;
    }
    @RequestMapping("/json2.form")
    @ResponseBody
    public List<UserTestJson> loadUsers(){
        List<UserTestJson> users=new ArrayList<UserTestJson>();
        UserTestJson u1=new UserTestJson(1,"Tom",20);
        UserTestJson u2=new UserTestJson(2,"David",23);
        users.add(u1);
        users.add(u2);
        return users;
    }
}
