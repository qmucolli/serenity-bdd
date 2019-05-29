package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.SignUpSteps;

/**
 * Created by Ardit Podrimaj
 */

public class SignUpStepDefinitions {

    @Steps
    SignUpSteps signUpSteps;

    @Given("^user is on home page$")
    public void userIsOnHomePage() {
        signUpSteps.verifyUserIsOnHomePage();
    }

    @When("^user registers a new account$")
    public void userRegisterANewAccount() {
        signUpSteps.clickRegisterButton();
        signUpSteps.typeFirstName("First");
        signUpSteps.typeLastName("Last");
        signUpSteps.typeEmail("test@email.com");
        signUpSteps.typePassword("1233456abcdA.,");
        signUpSteps.showPassword();
        signUpSteps.createAccount();
    }
}