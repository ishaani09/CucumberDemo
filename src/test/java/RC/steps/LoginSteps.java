package RC.steps;

import RC.pages.HomePage;
import RC.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps {

    HomePage homePage;
    LoginPage loginPage;

    @Step
    public void logInAsUser(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        Assert.assertTrue("User is not able to log in ", homePage.isUserLoggedIn());
    }
}
