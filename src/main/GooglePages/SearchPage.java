package GooglePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    @FindBy(css= "#ires .g")
    public ElementsCollection results;

    @FindBy(id= "resultStats")
    public SelenideElement resultStats;

    public SelenideElement getResult(int index) {
        return $("#ires .g", index);
    }

    public SelenideElement getPage(int index) {
        return $("a[aria-label='Page "+index+"']").scrollIntoView(false).should(Condition.appear);
    }
}
