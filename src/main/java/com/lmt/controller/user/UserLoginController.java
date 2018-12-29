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
        //com.lmt.service.UserServiceImpl@e57bde6
        System.out.println(userService);
        //com.lmt.service.UserServiceImpl$$EnhancerBySpringCGLIB$$b8e90bb7
        System.out.println(userService.getClass().getName());
        return result;
    }
}
