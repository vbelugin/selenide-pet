import com.codeborne.selenide.WebDriverRunner;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testcontainers.containers.BrowserWebDriverContainer;

import java.io.File;

import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;


public class BasicTest {
    @ClassRule
    public static BrowserWebDriverContainer chrome =
            new BrowserWebDriverContainer()
                    .withDesiredCapabilities(DesiredCapabilities.firefox())
                    .withRecordingMode(RECORD_ALL, new File("./build/"));
    @BeforeClass
    public static void setUp() {
        WebDriverRunner.setWebDriver(chrome.getWebDriver());
    }
}
