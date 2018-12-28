package junit.test_assert_class;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by 张洲徽 on 2018/12/28.
 */
public class TestJunit1 {
    @Test
    public void testAdd() {
        //test data
        int num= 5;
        String temp= null;
        String str= "Junit is working fine";

        //check for equality
        assertEquals("Junit is working fine", str);

        //check for false condition
        assertFalse(num > 6);

        //check for not null value
        assertNotNull(str);
    }
}
