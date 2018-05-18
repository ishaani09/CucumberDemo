package RC.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ProductDescriptionPage extends PageObject {

    @FindBy(css = ".priceQuantity input")
    WebElementFacade quantityField;

    @FindBy(className = "btn-add-to-basket")
    WebElementFacade addToCartButton;

    @FindBy(className = "cart-added")
    WebElementFacade addedToCartSection;

    @FindBy(className = "nav-view-cart")
    WebElementFacade viewCartButton;

    public void enterQuantity(String quantity) {
        quantityField.type(quantity);
    }

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public boolean isAddedToCartDisplayed() {
        return addedToCartSection.isDisplayed();
    }

    public void clickViewCart() {
        viewCartButton.click();
    }
}
