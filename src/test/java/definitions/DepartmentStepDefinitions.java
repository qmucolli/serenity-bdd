package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.DepartmentApiSteps;

public class DepartmentStepDefinitions {

    @Steps
    private DepartmentApiSteps departmentApiSteps;

    @Given("^I create a department with the specialisation of \"([^\"]*)\"$")
    public void iCreateADepartmentWithTheSpecialisationOf(String specialisation) throws Throwable {
        departmentApiSteps.createDepartment(specialisation);
    }

    @Then("^\"([^\"]*)\" Department should be created$")
    public void departmentShouldBeCreated(String specialisation) {
    }
}
