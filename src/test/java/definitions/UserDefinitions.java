package definitions;

import cucumber.api.PendingException;
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

    @Then("^User with role should be created$")
    public void userWithRoleShouldBeCreated() {

    }

    @Given("^I login with the username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithTheUsernameAndPassword(String username, String password) {
        apiUserSteps.login(username, password);
    }

    @Then("^User should see the Homepage$")
    public void userShouldSeeTheHomepage() {
    }
}
