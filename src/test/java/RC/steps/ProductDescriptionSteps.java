package RC.steps;

import RC.pages.ProductDescriptionPage;
import com.oracle.tools.packager.Log;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductDescriptionSteps {

    ProductDescriptionPage productDescriptionPage;

    @Step
    public void addProductToCart(String quantity) {
        productDescriptionPage.enterQuantity(quantity);
        productDescriptionPage.clickAddToCart();
        Assert.assertTrue("Product is not added to cart ", productDescriptionPage.isAddedToCartDisplayed());
        Log.info("Product is added to Cart");
    }

    @Step
    public void viewTheCart() {
        productDescriptionPage.clickViewCart();
    }
}
