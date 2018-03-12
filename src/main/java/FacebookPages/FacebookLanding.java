package FacebookPages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.util.Calendar;

import static com.codeborne.selenide.Selenide.*;

public class FacebookLanding {
    public FacebookLanding() {
        open("https://www.facebook.com/");
    }

    public FacebookMain loginUser(String email, String passwd) {
        $("#email").val(email).pressTab();
        $("#pass").val(passwd).pressEnter();
        return page(FacebookMain.class);
    }

    public FacebookMain submitRegistration() {
        $(By.name("websubmit")).click();
        return page(FacebookMain.class);
    }

    public void registerUser(
            String name,
            String lastName,
            String email,
            Calendar birthday,
            String sex,
            String passwd
    ) {
        $(By.name("firstname")).val(name).pressTab();
        $(By.name("lastname")).val(lastName).pressTab();
        $(By.name("reg_email__")).val(email).pressTab();
        $(By.name("reg_email_confirmation__")).should(Condition.appear).val(email).pressTab();
        $(By.name("reg_passwd__")).val(passwd).pressEnter();

        //Setup birthday
        $("#day").click();
        $("#day > option[value='"+ birthday.get(Calendar.DAY_OF_MONTH) +"']").click();

        $("#month").click();
        $("#month > option[value='"+ birthday.get(Calendar.MONTH) +"']").click();

        $("#year").click();
        $("#year > option[value='"+ birthday.get(Calendar.YEAR) +"']").click();

        //Select sex
        switch (sex) {
            case "female": $("[name='sex'][value='1']").click(); break;
            case "male": $("[name='sex'][value='2']").click(); break;
        }
    }
}
