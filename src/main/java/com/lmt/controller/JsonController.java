package com.lmt.controller;

import com.lmt.entity.Cost;
import org.springframework.stereotype.Controller;

/**
 * Created by 热带雨林 on 2018/11/22.
 * 用注解向浏览器返回json
 */
@Controller
public class JsonController {

    public Cost loadCost(){
        Cost c=new Cost();
        return c;
    }
}
