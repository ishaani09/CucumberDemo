package RC.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class RSCPageObject extends PageObject {

    @FindBy(className = "acsVendorLogoSVG")
    WebElementFacade foreseePopup;

    @FindBy(className = "acsDeclineButton")
    WebElementFacade closeForeseePopup;

    public void closeForesee() {
        if (foreseePopup.isCurrentlyVisible()) {
            closeForeseePopup.waitUntilVisible();
            closeForeseePopup.click();
        }
    }

    public void scrollInToView(WebElementFacade element) {
        evaluateJavascript("arguments[0].scrollIntoView(true);", element);
    }


}
