package junit.base_test;

import com.lmt.junit.base_test.MessageUtil;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by 张洲徽 on 2018/12/28.
 */
public class TestJunit {
//    String message = "Hello World";
//    MessageUtil messageUtil = new MessageUtil(message);
//
//    @Test
//    public void testPrintMessage() {
//        assertEquals(message,messageUtil.printMessage());
//    }

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        message = "New Word";
        assertEquals(message,messageUtil.printMessage());
    }
}
