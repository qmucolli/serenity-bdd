package steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import dto.RoleTransport;
import dto.RoleType;
import dto.UserTransport;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.io.IOException;

public class SmartApiUserSteps extends ScenarioSteps {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Step("Create user with credentials {0} & {1} & {2} & {3} & {4}")
    public void createUser(String email,
                           String username,
                           String firstName,
                           String lastName,
                           String password,
                           RoleType type) throws IOException {
        RoleTransport role = new RoleTransport(type);
//        Uncomment if theScenarioRes missing role check is wanted
//        UserTransport user = new UserTransport(email, username, firstName, lastName, password, null);

        UserTransport user = new UserTransport(email, username, firstName, lastName, password, role);
        String userAsJson = objectMapper.writeValueAsString(user);
        SerenityRest.rest()
                .contentType(ContentType.JSON)
                .body(userAsJson)
                .when()
                .post("http://localhost:8080/facility/api/users")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Step("Login user with credentials {0} & {1}")
    public void login(String username,
                        String password) {
        String userJson = "{" +
                "\nusername: " + username +
                "\npassword: " + password +
                "\n}";

        SerenityRest.rest()
                .contentType(ContentType.JSON)
                .body(userJson)
                .when()
                .post("http://localhost:8080/facility/api/auth")
                .then()
                .assertThat()
                .statusCode(200);
    }
}
