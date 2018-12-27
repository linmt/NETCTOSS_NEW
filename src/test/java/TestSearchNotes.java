import com.lmt.controller.note.SearchNotesController;
import com.lmt.entity.Note;
import com.lmt.entity.NoteResult;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by 张洲徽 on 2018/12/26.
 */
public class TestSearchNotes extends BaseJunit4Test {
    @org.junit.Test
    public void test( ){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        SearchNotesController snc=ac.getBean("searchNotesController", SearchNotesController.class);
        //NoteResult result=snc.execute("笔","2",1402538152753L,1402538197794L);
        //NoteResult result=snc.execute(null,null,null,null);
        NoteResult result=snc.execute("笔","2",null,null);
        List<Note> lists= (List<Note>) result.getData();
        System.out.println(lists.size());
    }

    @org.junit.Test
    public void test2( ){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        SearchNotesController snc=ac.getBean("searchNotesController", SearchNotesController.class);
        //NoteResult result=snc.execute("笔","2",1402538152753L,1402538197794L);
        //NoteResult result=snc.execute(null,null,null,null);
        NoteResult result=snc.execute("笔","1",null,null);
        List<Note> lists= (List<Note>) result.getData();
        System.out.println(lists.size());
    }

    @org.junit.Test
    public void test3( ){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        SearchNotesController snc=ac.getBean("searchNotesController", SearchNotesController.class);
        //NoteResult result=snc.execute("笔","2",1402538152753L,1402538197794L);
        //NoteResult result=snc.execute(null,null,null,null);
        NoteResult result=snc.execute("笔",null,null,null);
        List<Note> lists= (List<Note>) result.getData();
        System.out.println(lists.size());
    }
}
