package RC.steps;

import RC.pages.HomePage;
import RC.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomePageSteps {

    HomePage homePage;
    LoginPage loginPage;

    @Step
    public void openHomePage() {
        homePage.open();
    }

    @Step
    public void goToLoginSection() {
        homePage.clickLoginLink();
        Assert.assertTrue("Log in page is not displayed ", loginPage.isLoginSectionDisplayed() );
    }

    @Step
    public void searchFor(String stockNumber) {
        homePage.enterSearchText(stockNumber);
        homePage.clickSearchButton();
    }

    @Step
    public void addProductFromQuickOrderSection(String stockNumber, String quantity) {
        homePage.enterStockNumberOneInQOSection(stockNumber);
        homePage.enterQuantityOneInQOSection(quantity);
        homePage.clickAddToCartButtonInQOSection();
    }

    public void searchForText(String searchText) {
        homePage.selectSearchText(searchText);
    }
}
