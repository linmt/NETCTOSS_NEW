import com.lmt.dao.UserDao;
import com.lmt.entity.User;
import com.lmt.util.NoteUtil;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;

/**
 * Created by 张洲徽 on 2018/11/26.
 */
public class TestUserDao extends BaseJunit4Test {
    @Resource  //自动注入,默认按名称
    private UserDao userdao;
    @org.junit.Test  //标明是测试方法
    //@Ignore  //表示该方法被忽略
    public void find( ) throws NoSuchAlgorithmException {
//        User user=userdao.findByName("zhouj");
//        System.out.println(user);

        User user = new User();
        user.setCn_user_name("ddd");//用户名
        user.setCn_user_desc("demo");//昵称
        String md5_password = NoteUtil.md5("1234");
        user.setCn_user_password(md5_password);//设置密码
        user.setCn_user_token(null);//令牌
        String userId = NoteUtil.createId();
        user.setCn_user_id(userId);//用户ID
        userdao.save(user);
    }
}
