package steps;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiUserSteps extends ScenarioSteps {

    @Step("Create user with credentials {0} & {1} & {2}")
    public void createUser(String name, int age, int salary) {

        String requestBody = "{ \"name\":" + name +
                "\"age\":" + age +
                "\"salary\":" + salary + "}";

        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("http://dummy.restapiexample.com/create");
    }
}
