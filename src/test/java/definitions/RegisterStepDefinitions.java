package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.RegisterSteps;

public class RegisterStepDefinitions {

    @Steps
    RegisterSteps registerSteps;

    @Given("^User is registered$")
    public void userIsRegistered() {
        registerSteps.register();
    }

    @Then("^User should see Login page$")
    public void userShouldSeeLogin() {

    }
}
