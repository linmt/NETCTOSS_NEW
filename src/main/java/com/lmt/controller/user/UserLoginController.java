package com.lmt.controller.user;

import com.lmt.entity.NoteResult;
import com.lmt.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;

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
    public NoteResult execute(@RequestParam("name") String name, @RequestParam("password")String password) throws NoSuchAlgorithmException {
        NoteResult result =userService.checkLogin(name, password);
        System.out.println(userService);
        System.out.println(userService.getClass().getName());
        return result;
        /*
            开启AOP注解扫描方式一：<aop:aspectj-autoproxy/>
            com.lmt.service.UserServiceImpl@3a0d4a07
            com.sun.proxy.$Proxy134

            开启AOP注解扫描方式一：<aop:aspectj-autoproxy proxy-target-class="true"/>
            com.lmt.service.UserServiceImpl@21c51306
            com.lmt.service.UserServiceImpl$$EnhancerBySpringCGLIB$$387dba2f
         */
    }
}
