package RC.steps;

import RC.pages.CartPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import com.oracle.tools.packager.Log;

import java.util.List;

public class CartSteps {

    CartPage cartPage;

    @Step
    public void checkIfTheProductIsInTheCart(String stockNumber) {
        List<String> stockNumbers = cartPage.getStockNumbersFromCart();
        Log.info("Stock Numbers found in cart " +stockNumbers.toString());
        Assert.assertTrue("Product with stock number " + stockNumber + " is not found in the cart", stockNumbers.contains(stockNumber));
    }

    @Step
    public void continueToCheckout() {
        cartPage.clickCheckoutSecurely();
    }
}
