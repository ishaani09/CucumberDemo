package RC.stepDefs;

import RC.steps.HomePageSteps;
import RC.steps.LoginSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LoginDefs {

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    LoginSteps loginSteps;

    @Given("^As a registered user I login with credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void asARegisteredUserILoginWithCredentialsAnd(String username, String password) throws Throwable {
        homePageSteps.goToLoginSection();
        loginSteps.logInAsUser(username,password);
    }


}
