import GooglePages.GooglePage;
import org.junit.Test;

import GooglePages.SearchPage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.matchesText;
import static com.codeborne.selenide.Condition.text;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void basicGoogleTest() {
        GooglePage page = new GooglePage();
        SearchPage results = page.searchFor("selenide");
        results.results.shouldHave(sizeGreaterThan(1));
        results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }

    @Test
    public void selectGooglePageTest() {
        GooglePage page = new GooglePage();

        SearchPage results = page.searchFor("selenide");
        results.results.shouldHave(sizeGreaterThan(1));
        results.getPage(3).click();
        results.results.shouldHave(sizeGreaterThan(1));
        results.resultStats.shouldHave(matchesText("Page 3"));
    }
}
