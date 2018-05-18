package RC.stepDefs;

import RC.steps.CheckoutLoginSteps;
import RC.steps.HomePageSteps;
import RC.steps.LoginSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class LoginDefs {

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    CheckoutLoginSteps checkoutLoginSteps;

    @Given("^I login with credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iLoginWithCredentialsAnd(String username, String password) throws Throwable {
        homePageSteps.goToLoginSection();
        loginSteps.logInAsUser(username,password);
    }

    @Then("^I checkout as guest$")
    public void iCheckoutAsGuest() throws Throwable {
        checkoutLoginSteps.checkOutAsAGuest();
    }
}
