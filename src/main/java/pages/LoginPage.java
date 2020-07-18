package pages;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginPage extends AbstractPage {

    @FindBy(id = "username")
    WebElementFacade usernameInput;

    @FindBy(id = "password")
    WebElementFacade passwordInput;

    public WebElementFacade getUsernameInput() {
        return usernameInput;
    }

    public WebElementFacade getPasswordInput() {
        return passwordInput;
    }

    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    @FindBy(css = "[value=\"Login\"]")
    WebElementFacade loginButton;
}