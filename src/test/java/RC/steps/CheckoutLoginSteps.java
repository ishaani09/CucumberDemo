package RC.steps;

import RC.pages.CheckoutLoginPage;
import net.thucydides.core.annotations.Step;

public class CheckoutLoginSteps {

    CheckoutLoginPage checkoutLoginPage;

    @Step
    public void checkOutAsAGuest() {
        checkoutLoginPage.switchToFrame();
        checkoutLoginPage.enterEmailAddress();

    }
}
