package RC.steps;

import RC.pages.HomePage;
import RC.pages.LoginPage;
import org.junit.Assert;

public class LoginSteps {
    HomePage homePage;
    LoginPage loginPage;

    public void logInAsUser(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        Assert.assertTrue("User is not able to log in ", homePage.isUserLoggedIn());
    }
}
