package GooglePages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class GooglePage {
    public GooglePage() {
        open("https://google.com/ncr");
    }

    public SearchPage searchFor(String text) {
        $(By.name("q")).val(text).pressEnter();
        return page(SearchPage.class);
    }
}
