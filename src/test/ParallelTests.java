import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class ParallelTests extends BaseTest {
    @Test
    public void test() {
        Class[] cls = {FacebookTest.class, GoogleSearchTest.class};

        JUnitCore.runClasses(ParallelComputer.classes(), cls);
    }
}
