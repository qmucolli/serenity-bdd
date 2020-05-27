package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dto.RoleType;
import net.thucydides.core.annotations.Steps;
import steps.SmartApiUserSteps;

public class UserDefinitions {

    @Steps
    SmartApiUserSteps apiUserSteps;

    @Given("^I create user with email \"([^\"]*)\", username \"([^\"]*)\", firstName \"([^\"]*)\", lastName \"([^\"]*)\", password \"([^\"]*)\" and roleType \"([^\"]*)\"$")
    public void iCreateUserWithEmailUsernameFirstNameLastNamePasswordAndRoleType(String email,
                                                                                 String username,
                                                                                 String firstName,
                                                                                 String lastName,
                                                                                 String password,
                                                                                 RoleType type) throws Throwable {
        apiUserSteps.createUser(email, username, firstName, lastName, password, type);
    }

    @Then("^User should be created$")
    public void userShouldBeCreated() {

    }
}
