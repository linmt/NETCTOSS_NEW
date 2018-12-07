import com.lmt.entity.NoteResult;
import com.lmt.service.NoteService;

import javax.annotation.Resource;

/**
 * Created by 张洲徽 on 2018/12/7.
 */
public class TestLoadNoteDetail extends BaseJunit4Test {
    @Resource
    private NoteService noteService;

    @org.junit.Test
    public void test( ){
        NoteResult noteResult=noteService.loadNoteDetail("051538a6-0f8e-472c-8765-251a795bc88f");
        System.out.println(noteResult.getStatus()+"  "+noteResult.getMsg()+"  "+noteResult.getData());
    }
}
