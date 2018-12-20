import com.lmt.controller.JsonController;
import com.lmt.entity.UserTestJson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 张洲徽 on 2018/12/20.
 */
public class TestLoggerBean extends BaseJunit4Test {
    @org.junit.Test
    public void test( ){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        JsonController js=ac.getBean(JsonController.class);
        UserTestJson u=js.loadUser();
        System.out.println(u);
    }
}
