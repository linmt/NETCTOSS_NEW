package com.lmt.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by 张洲徽 on 2018/12/20.
 */
@Component
@Aspect
public class LoggerBean {

//    @Before("within(com.lmt.controller..*)")
//    public void before_log(){
//        System.out.println("before_log");
//    }
//
//    @Around("within(com.lmt.controller..*)")
//    public Object around_log(ProceedingJoinPoint p) throws Throwable{
//        //目标组件的类名
//        String className=p.getTarget().getClass().getName();
//        //调用的方法名
//        String methodName=p.getSignature().getName();
//        //当前系统时间
//        String date=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
//        //拼接日志信息
//        String msg="在"+date+"，执行了"+className+"."+methodName+"()";
//        System.out.println(msg);
//
//        //执行目标组件的方法
//        Object obj=p.proceed();
//
//        //在调用目标组件业务方法后可以做一些业务处理
//        System.out.println("执行完目标组件方法后执行的环绕通知");
//
//        return obj;
//        /*
//            before_log
//            在2018-12-20 04:39:29，执行了com.lmt.controller.JsonController.loadUser()
//            执行完目标组件方法后执行的环绕通知
//            User{id=1, name='Tom', age='20'}
//         */
//    }
//
//    @AfterThrowing(pointcut = "within(com.lmt.controller..*)",throwing = "e")
//    public void after_throwing_log (Exception e){
//        StackTraceElement[] elems=e.getStackTrace();
//        //记录异常信息
//        System.out.println("-->"+elems[0].toString());
//        /*
//            before_log
//            在2018-12-20 04:49:49，执行了com.lmt.controller.JsonController.loadUser()
//            -->java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//         */
//    }
}
