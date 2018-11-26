import com.lmt.dao.UserDao;
import com.lmt.entity.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 张洲徽 on 2018/11/26.
 */
public class TestUserDao extends BaseJunit4Test {
    @Resource  //自动注入,默认按名称
    private UserDao userdao;
    @org.junit.Test  //标明是测试方法
    //@Ignore  //表示该方法被忽略
    public void find( ) {
        User user=userdao.findByName("");
        System.out.println(user);
    }
}
