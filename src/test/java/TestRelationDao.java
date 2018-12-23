import com.lmt.controller.JsonController;
import com.lmt.dao.RelationDao;
import com.lmt.entity.NoteBook;
import com.lmt.entity.User;
import com.lmt.entity.UserTestJson;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 热带雨林 on 2018/12/22.
 */
public class TestRelationDao extends BaseJunit4Test {
    private RelationDao rdao;

    @org.junit.Before
    public void init(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        rdao=ac.getBean("relationDao",RelationDao.class);
    }
/*
    @org.junit.Test
    public void test( ){
        User user=rdao.findUserAndBooks("52f9b276-38ee-447f-a3aa-0d54e7a736e4");
        System.out.println("=====用户信息=====");
        System.out.println(user.getCn_user_id()+":"+user.getCn_user_name());
        System.out.println("=====笔记本列表=====");
        for(NoteBook book:user.getBooks()){
            System.out.println(book.getCn_notebook_id()+":"+book.getCn_notebook_name());
        }
    }
*/
/*
    @org.junit.Test
    public void test2( ){
        User user=rdao.findUserAndBooks2("52f9b276-38ee-447f-a3aa-0d54e7a736e4");
        System.out.println("=====用户信息=====");
        System.out.println(user.getCn_user_id()+":"+user.getCn_user_name());
        System.out.println("=====笔记本列表=====");
        for(NoteBook book:user.getBooks()){
            System.out.println(book.getCn_notebook_id()+":"+book.getCn_notebook_name());
        }
    }
*/
/*
    @org.junit.Test
    public void test3( ){
        List<NoteBook> books=rdao.findBookAndUser();
        for(NoteBook book:books){
            System.out.println(book.getCn_notebook_id()+":"+book.getCn_notebook_name()+":"+book.getUser());
        }
    }
*/

    @org.junit.Test
    public void test4( ){
        List<NoteBook> books=rdao.findBookAndUser2();
        for(NoteBook book:books){
            System.out.println(book.getCn_notebook_id()+":"+book.getCn_notebook_name()+":"+book.getUser());
        }
    }
}
