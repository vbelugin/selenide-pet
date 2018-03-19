import FacebookPages.FacebookLanding;
import FacebookPages.FacebookMain;
import com.codeborne.selenide.Condition;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import java.util.Calendar;
import java.util.TimeZone;

public class FacebookTest extends BaseTest {
    @Test
    public void facebookLoginTest() {
        FacebookLanding landingPage = new FacebookLanding();
        FacebookMain mainPage = landingPage.loginUser("YRMml.4test@gmail.com", "Password4test");
        mainPage.userName.shouldBe(Condition.matchText("Pedro Lastnamio"));
    }

    @Test
    public void facebookRegisterTest() {
        FacebookLanding landingPage = new FacebookLanding();
        Calendar birthday = Calendar.getInstance(TimeZone.getDefault());
        birthday.set(1992, Calendar.AUGUST, 13);
        String email = RandomStringUtils.randomAlphabetic(5) + ".4test@gmail.com";
        System.out.println(email);
        landingPage.registerUser("Pedro", "Lastnamio",email, birthday, "male","Password4test");

        FacebookMain mainPage = landingPage.submitRegistration();
        mainPage.userName.waitUntil(Condition.appear, 3000).shouldBe(Condition.matchText("Pedro Lastnamio"));
    }
}
