package com.lmt.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 张洲徽 on 2018/12/21.
 */
@Component
@Aspect
public class ExceptionBean {
    @AfterThrowing(pointcut = "within(com.lmt.service..*)",throwing = "e")
    public void after_throwing_log (Exception e){
        //模拟的异常在分享笔记处，NoteServiceImpl
        try {
            FileWriter fw=new FileWriter("C:\\Users\\张洲徽\\Desktop\\note_error.txt",true);
            PrintWriter pw=new PrintWriter(fw);
            //利用pw对象写入异常信息
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timeStr=sdf.format(new Date());
            pw.println("********************");
            pw.println("异常时间："+timeStr);
            pw.println("异常类型："+e);
            pw.println("**********异常详细信息**********");
            e.printStackTrace(pw);
            pw.close();
            fw.close();
        } catch (Exception e1) {
            System.out.println("记录异常信息失败");
            e1.printStackTrace();
        }
    }
}
