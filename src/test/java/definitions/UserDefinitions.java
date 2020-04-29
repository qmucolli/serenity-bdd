package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiUserSteps;

public class UserDefinitions {

    @Steps
    ApiUserSteps apiUserSteps;

    @Then("^User should be created$")
    public void userShouldBeCreated() {
    }

    @Given("^I create user with name \"([^\"]*)\", age \"([^\"]*)\" and Salary \"([^\"]*)\"$")
    public void iCreateUserWithNameAgeAndSalary(String name, int age, int salary) throws Throwable {
        apiUserSteps.createUser(name, age, salary);

        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
