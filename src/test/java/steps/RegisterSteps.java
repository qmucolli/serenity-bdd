package steps;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPage;
import pages.RegisterPage;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegisterSteps extends ScenarioSteps {

    RegisterPage registerPage;

    public void register(){
        registerPage.getEmailInput().type("test@email.com");
        registerPage.getUsernameInput().type("testing123");
        registerPage.getPasswordInput().type("1234567");
        registerPage.getFirstNameInput().type("firstName");
        registerPage.getLastNameInput().type("lastName");
        registerPage.getSignUpButton().click();
    }
}