package com.lmt.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by 热带雨林 on 2018/11/10.
 */
//执行一个类中全部以@Demo标注的方法--2
@Retention(RetentionPolicy.RUNTIME)
//RetentionPolicy.SOURCE表示这个注解只存在于源代码中
//RetentionPolicy.CLASS表示注解保留在.class文件中，但是.class文件放到方法区后注解依然会被擦除
//RetentionPolicy.RUNTIME  .class文件被放到方法区后依然保留注解
public @interface Demo {
}
