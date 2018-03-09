package FacebookPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class FacebookMain {

    @FindBy(css = "#userNav div[dir='ltr']")
    public SelenideElement userName;
}
