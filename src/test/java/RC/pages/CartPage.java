package RC.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class CartPage extends PageObject {

    @FindBy(className = "dataRow")
    List<WebElementFacade> productsInCart;

    @FindBy(css = ".cartNavigationDiv #checkoutSecurelyAndPuchBtn")
    WebElementFacade checkoutFooterButton;

    By stockNumber = By.className("textTitle");

    public List<String> getStockNumbersFromCart() {
        List<String> productStockNumbers = null;
        productStockNumbers = productsInCart.stream().map(p -> p.find(stockNumber).getText()).collect(Collectors.toList());
        return productStockNumbers;
    }

    public void clickCheckoutSecurely() {
        checkoutFooterButton.shouldBeEnabled();
        checkoutFooterButton.click();
    }
}
