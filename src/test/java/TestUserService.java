import com.lmt.entity.NoteResult;
import com.lmt.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;

/**
 * Created by 张洲徽 on 2018/11/29.
 */
public class TestUserService extends BaseJunit4Test {
    @Resource
    private UserService userService;
/*
    @org.junit.Test
    //测试用户名不存在
    public void test1( ) throws NoSuchAlgorithmException {
        NoteResult<User> noteResult=userService.checkLogin("dog","123");
        System.out.println(noteResult.getStatus()+"  "+noteResult.getMsg()+"  "+noteResult.getData());
    }

    @org.junit.Test
    //测试密码错误
    public void test2( ) throws NoSuchAlgorithmException {
        NoteResult<User> noteResult=userService.checkLogin("cat","1234");
        System.out.println(noteResult.getStatus()+"  "+noteResult.getMsg()+"  "+noteResult.getData());
    }

    @org.junit.Test
    //测试用户名、密码正确
    public void test3( ) throws NoSuchAlgorithmException {
        NoteResult<User> noteResult=userService.checkLogin("cat","123");
        System.out.println(noteResult.getStatus()+"  "+noteResult.getMsg()+"  "+noteResult.getData());
    }
    */

    //用于测试事务管理

    //未注入AOP时候的结果：com.lmt.service.UserServiceImpl
    /*
    @org.junit.Test
    public void test1( ) throws NoSuchAlgorithmException {
        NoteResult<String> noteResult=userService.checkLogin("dog","123");
        System.out.println(userService.getClass().getName());
    }
    */

    //注入AOP后：
    //采用cglib机制，即在xml中加入<aop:aspectj-autoproxy proxy-target-class="true"/>：
    // com.lmt.service.UserServiceImpl$$EnhancerBySpringCGLIB$$c37f5e2e
    //采用JDK自带java.reflect.Proxy API，xml配置<aop:aspectj-autoproxy/>，或者直接去掉该项：
    // com.sun.proxy.$Proxy38
    @org.junit.Test
    public void test2( ) throws NoSuchAlgorithmException {
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService us=ac.getBean("userService",UserService.class);
        NoteResult<String> noteResult=us.checkLogin("dog","123");
        System.out.println(us.getClass().getName());
    }
}
