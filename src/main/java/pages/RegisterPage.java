package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegisterPage extends AbstractPage {

    @FindBy(id = "email")
    WebElementFacade emailInput;

    @FindBy(id = "username")
    WebElementFacade usernameInput;

    @FindBy(id = "password")
    WebElementFacade passwordInput;

    @FindBy(id = "firstName")
    WebElementFacade firstNameInput;

    @FindBy(id = "lastName")
    WebElementFacade lastNameInput;

    public WebElementFacade getUsernameInput() {
        return usernameInput;
    }

    public WebElementFacade getPasswordInput() {
        return passwordInput;
    }

    public WebElementFacade getEmailInput() {
        return emailInput;
    }

    public RegisterPage setEmailInput(WebElementFacade emailInput) {
        this.emailInput = emailInput;
        return this;
    }

    public WebElementFacade getFirstNameInput() {
        return firstNameInput;
    }

    public RegisterPage setFirstNameInput(WebElementFacade firstNameInput) {
        this.firstNameInput = firstNameInput;
        return this;
    }

    public WebElementFacade getLastNameInput() {
        return lastNameInput;
    }

    public RegisterPage setLastNameInput(WebElementFacade lastNameInput) {
        this.lastNameInput = lastNameInput;
        return this;
    }

    public WebElementFacade getSignUpButton() {
        return signUpButton;
    }

    @FindBy(css = "[value=\"Sign Up\"]")
    WebElementFacade signUpButton;
}