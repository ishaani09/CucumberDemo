package RC.stepDefs;

import RC.steps.HomePageSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class HomePageDefs {

    @Steps
    HomePageSteps homePageSteps;

    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() throws Throwable {
        homePageSteps.openHomePage();
    }

    @And("^I search for the RS stock number \"([^\"]*)\"$")
    public void iSearchForTheRSStockNumber(String stockNumber) throws Throwable {
        homePageSteps.searchFor(stockNumber);
    }
}
