package RC.stepDefs;

import RC.steps.CartSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class CartDefs {

    @Steps
    CartSteps cartSteps;

    @Then("^I should see the product \"([^\"]*)\" in the cart$")
    public void iShouldSeeTheProductInTheCart(String stockNumber) throws Throwable {
        cartSteps.checkIfTheProductIsInTheCart(stockNumber);
    }

    @And("^I proceed to checkout$")
    public void iProceedToCheckout() throws Throwable {
        cartSteps.continueToCheckout();
    }
}
