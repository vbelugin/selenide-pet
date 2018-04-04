package FacebookPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookMain {

    public FacebookMain() {
        PageFactory.initElements(new FirefoxDriver(), this);
    }

    @FindBy(css = "#userNav div[dir='ltr']")
    public SelenideElement userName;
}
