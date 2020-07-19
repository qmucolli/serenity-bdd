package steps;

import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Department;
import dto.SpecialisationType;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.steps.ScenarioSteps;

import java.io.IOException;

public class DepartmentApiSteps extends ScenarioSteps {

    ObjectMapper objectMapper = new ObjectMapper();

    public void createDepartment(String specialisation) throws IOException {
        Department department = new Department();
        department.setSpecialisation(SpecialisationType.valueOf(specialisation));

        SerenityRest.rest()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0aW5nIiwiZXhwIjoxNTk1MTc0NDc3fQ.kGTpepMi6CktXHw10hV8p_RbPlTcrmk3IZ_RHV12cOVyT5qVIQe9DhUoalBrtZWH7iDoofJY4IwrXblLkEh7AA")
                .body(objectMapper.writeValueAsString(department))
                .when()
                .post("http://localhost:8080/facility/api/departments")
                .then()
                .assertThat()
                .statusCode(200);
    }
}
