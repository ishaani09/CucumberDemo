package RC.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.joda.time.Seconds;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://uk.rs-online.com/web/")
public class HomePage extends PageObject {

    @FindBy(className = "rslogo")
    WebElementFacade rsLogo;

    @FindBy(css = "a[title='Log In']")
    WebElementFacade loginLink;

    @FindBy(className = "welcome")
    WebElementFacade welcomeMessage;

    @FindBy(id = "searchTerm")
    WebElementFacade searchTextbox;

    @FindBy(id = "btnSearch")
    WebElementFacade searchButton;

    public void clickLoginLink() {
        loginLink.click();
    }

    @WhenPageOpens
    public void waitForPageToLoad(){
        rsLogo.withTimeoutOf(5, TimeUnit.SECONDS);
    }

    public boolean isUserLoggedIn() {
        return welcomeMessage.isDisplayed();
    }

    public void enterSearchText(String stockNumber) {
        searchTextbox.type(stockNumber);
    }

    public void clickSearchButton() {
        searchButton.click();
    }
}
