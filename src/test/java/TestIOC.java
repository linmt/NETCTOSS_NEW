import com.lmt.entity.User;

import java.lang.reflect.Method;

/**
 * Created by 张洲徽 on 2018/12/29.
 */
public class TestIOC extends BaseJunit4Test {
    @org.junit.Test
    public void test( ) throws Exception {
        //实际中是用解析xml的方式获取com.lmt.entity.User
        String className="com.lmt.entity.User";
        Class cls=Class.forName(className);
        //User user=(User)cls.newInstance();
        Object obj=cls.newInstance();

        //得到setCn_user_name方法信息
        Method method=cls.getMethod("setCn_user_name",String.class);
        //public void com.lmt.entity.User.setCn_user_name(java.lang.String)
        System.out.println(method);
        //调用方法
        method.invoke(obj,"demo");
        //检测是否设置了cn_user_name
        User user=(User)obj;
        System.out.println(user);
    }
}
