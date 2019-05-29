package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by Ardit Podrimaj
 */

@Getter
public class RegisterPage extends AbstractPage {

    @FindBy(id = "firstname")
    WebElementFacade firstNameInput;

    @FindBy(id = "lastname")
    WebElementFacade lastNameInput;

    @FindBy(id = "email")
    WebElementFacade emailInput;

    @FindBy(id = "PASSWORD")
    WebElementFacade passwordInput;

    @FindBy(css = "[aria-label=\"Show password checkbox\"]")
    WebElementFacade showPasswordCheckbox;

    @FindBy(css = "[class=\"chk-lb regular-text\"]")
    WebElementFacade showPasswordButton;

    @FindBy(id = "ppaFormSbtBtn")
    WebElementFacade createAccountButton;
}