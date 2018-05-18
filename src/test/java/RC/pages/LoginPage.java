package RC.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

    @FindBy(className = "loginColumnOne")
    WebElementFacade loginSection;

    @FindBy(name = "username")
    WebElementFacade usernameField;

    @FindBy(name = "j_password")
    WebElementFacade passwordField;

    @FindBy(name = "loginBtn")
    WebElementFacade loginButton;

    public boolean isLoginSectionDisplayed() {
        return loginSection.isDisplayed();
    }

    public void enterUsername(String username) {
        usernameField.type(username);
    }

    public void enterPassword(String password) {
        passwordField.type(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
