import com.lmt.controller.JsonController;
import com.lmt.entity.UserTestJson;

import javax.annotation.Resource;

/**
 * Created by 张洲徽 on 2018/12/20.
 */
public class TestLoggerBean extends BaseJunit4Test {
    //测试注入参数，BaseJunit4Test加了注解：@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
    @Resource
    JsonController js;

    @org.junit.Test
    public void test( ){
//        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        JsonController js=ac.getBean(JsonController.class);
        UserTestJson u=js.loadUser();
        System.out.println(u);
    }
}
