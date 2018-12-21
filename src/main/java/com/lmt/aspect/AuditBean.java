package com.lmt.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by 张洲徽 on 2018/12/21.
 */
@Component
@Aspect
public class AuditBean {
    @Around("within(com.lmt.service..*)")
    public Object audit(ProceedingJoinPoint point) throws Throwable {
        Object obj=null;
        long timeStart=System.currentTimeMillis();
        obj=point.proceed();
        long timeEnd=System.currentTimeMillis();
        String str=point.getSignature().toString();
        System.out.println(str+"耗时："+(timeEnd-timeStart));
        return obj;
    }
}
