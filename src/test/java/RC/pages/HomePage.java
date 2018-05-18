package RC.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.joda.time.Seconds;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

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

    @FindBy(css = ".quickOrder div:nth-child(2) input:nth-child(1)")
    WebElementFacade qoStockOneField;

    @FindBy(css = ".quickOrder div:nth-child(2) input:nth-child(2)")
    WebElementFacade qoQuantityOneField;

    @FindBy(id = "quickOrderBtn")
    WebElementFacade qoAddToCartButton;

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

    public void enterStockNumberOneInQOSection(String stockNumber) {
        qoStockOneField.type(stockNumber);
    }

    public void enterQuantityOneInQOSection(String quantity) {
        qoQuantityOneField.type(quantity);
    }

    public void clickAddToCartButtonInQOSection() {
        qoAddToCartButton.click();
    }

    public void selectSearchText(String searchText) {
        searchTextbox.type(searchText);
        WebDriver driver = ((WebDriverFacade) getDriver()).getProxiedDriver();
        RemoteWebElement suggestionList = (RemoteWebElement) driver.findElement(By.id("txtHintBox"));
        suggestionList.findElement(By.className("advItemContainer")).click();


    }
}
