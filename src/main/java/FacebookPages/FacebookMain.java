package FacebookPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.open;

public class FacebookMain {
    public FacebookMain() {
        open("https://www.facebook.com/");
    }

    //Login section
    @FindBy(id= "email")
    public SelenideElement login;

    @FindBy(id= "pass")
    public SelenideElement pass;

    @FindBy(id= "loginbutton")
    public SelenideElement loginButton;

    //Registration section
    @FindBy(css= "#firstname")
    public SelenideElement firstName;

    @FindBy(css= "#lastname")
    public SelenideElement lastName;

    @FindBy(css= "#reg_email__")
    public SelenideElement regEmail;

    @FindBy(css= "#reg_passwd__")
    public SelenideElement regPass;





}
