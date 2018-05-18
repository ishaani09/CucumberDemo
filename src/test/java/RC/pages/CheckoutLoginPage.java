package RC.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutLoginPage {

    @FindBy(css="iframe[id^='lpSS_']")
    WebElementFacade loginFrame;

    public void switchToFrame() {
    }

    public void enterEmailAddress() {
    }
}
