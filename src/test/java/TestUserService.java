import com.lmt.entity.User;
import com.lmt.service.UserService;
import com.lmt.entity.NoteResult;

import javax.annotation.Resource;
import java.security.NoSuchAlgorithmException;

/**
 * Created by 张洲徽 on 2018/11/29.
 */
public class TestUserService extends BaseJunit4Test {
    @Resource
    private UserService userService;

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
}
