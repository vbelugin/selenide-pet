import com.codeborne.selenide.Configuration;
import org.junit.Before;


public class BasicTest {
    @Before
    public void setBeforeTest() {
        Configuration.browser = "chrome";
    }
}
