package junit.test_assert_class;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by 张洲徽 on 2018/12/28.
 */
public class TestRunner1 {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJunit1.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
