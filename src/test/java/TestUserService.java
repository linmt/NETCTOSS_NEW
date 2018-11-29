import com.lmt.entity.User;
import com.lmt.service.UserService;
import com.lmt.util.NoteResult;

import javax.annotation.Resource;

/**
 * Created by 张洲徽 on 2018/11/29.
 */
public class TestUserService extends BaseJunit4Test {
    @Resource
    private UserService userService;

    @org.junit.Test
    //测试用户名不存在
    public void test1( ) {
        NoteResult<User> noteResult=userService.checkLogin("dog","123");
        System.out.println(noteResult.getStatus()+"  "+noteResult.getMsg()+"  "+noteResult.getData());
    }

    @org.junit.Test
    //测试密码错误
    public void test2( ) {
        NoteResult<User> noteResult=userService.checkLogin("cat","1234");
        System.out.println(noteResult.getStatus()+"  "+noteResult.getMsg()+"  "+noteResult.getData());
    }

    @org.junit.Test
    //测试用户名、密码正确
    public void test3( ) {
        NoteResult<User> noteResult=userService.checkLogin("cat","123");
        System.out.println(noteResult.getStatus()+"  "+noteResult.getMsg()+"  "+noteResult.getData());
    }
}
