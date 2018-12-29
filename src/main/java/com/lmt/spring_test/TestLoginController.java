package com.lmt.spring_test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lmt.controller.user.UserLoginController;
import com.lmt.entity.NoteResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.annotation.Resource;

/**
 * Created by 张洲徽 on 2018/12/29.
 */
//基于什么运行
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestLoginController {
    @Resource
    UserLoginController controller;

    private MockMvc mock;

    @Before
    public void init(){
        mock= MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void test() throws Exception {
        //创建请求
        MockHttpServletRequestBuilder request=MockMvcRequestBuilders.post("/user/login.form");
        //给请求添加参数
        request.param("name","wsf").param("password","1234");
        MvcResult result=mock.perform(request).andReturn();
        //获取响应结果的内容
        String result_str=result.getResponse().getContentAsString();
        //System.out.println(result_str);
        //为了运行断言，将json字符串转为对象
        ObjectMapper mapper=new ObjectMapper();
        NoteResult noteResult=mapper.readValue(result_str, NoteResult.class);
        Assert.assertEquals(0,noteResult.getStatus());
    }

    @Test
    public void test2() throws Exception {
        //创建请求
        MockHttpServletRequestBuilder request=MockMvcRequestBuilders.post("/user/login.form");
        //给请求添加参数
        request.param("name","wsf").param("password","12345");
        MvcResult result=mock.perform(request).andReturn();
        //获取响应结果的内容
        String result_str=result.getResponse().getContentAsString();
        //System.out.println(result_str);
        //为了运行断言，将json字符串转为对象
        ObjectMapper mapper=new ObjectMapper();
        NoteResult noteResult=mapper.readValue(result_str, NoteResult.class);
        Assert.assertEquals(2,noteResult.getStatus());
    }

    @Test
    public void test3() throws Exception {
        //创建请求
        MockHttpServletRequestBuilder request=MockMvcRequestBuilders.post("/user/login.form");
        //给请求添加参数
        request.param("name","wsf2").param("password","1234");
        MvcResult result=mock.perform(request).andReturn();
        //获取响应结果的内容
        String result_str=result.getResponse().getContentAsString();
        //System.out.println(result_str);
        //为了运行断言，将json字符串转为对象
        ObjectMapper mapper=new ObjectMapper();
        NoteResult noteResult=mapper.readValue(result_str, NoteResult.class);
        Assert.assertEquals(1,noteResult.getStatus());
    }
}
