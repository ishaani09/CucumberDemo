package RC.stepDefs;

import RC.steps.ProductDescriptionSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ProductDescriptionDefs {

    @Steps
    ProductDescriptionSteps productDescriptionSteps;

    @And("^I add \"([^\"]*)\" of the product to cart from pdp page$")
    public void iAddOfTheProductToCartFromPdpPage(String quantity) throws Throwable {
        productDescriptionSteps.addProductToCart(quantity);
    }

    @And("^I view the cart$")
    public void iViewTheCart() throws Throwable {
       productDescriptionSteps.viewTheCart();
    }
}
