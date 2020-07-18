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
                .header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0IiwiZXhwIjoxNTkyOTQ3NTUwfQ.ye-Xz-jgAB8eaADkUft3TM4CFTEL-s-AXfKuFjig4QoCp2OlTC-mzV2oqa5Xf-ESa0wOI6W20txrY75nkxlPtw")
                .body("{\n" +
                        "\t\"specialisation\":\"CARDIO\",\n" +
                        "\t\"rooms\":[\n" +
                        "\t  {\n" +
                        "\t    \"name\":\"test\"\n" +
                        "\t  },\n" +
                        "\t  {\n" +
                        "\t    \"name\":\"test2\"\n" +
                        "\t  }\n" +
                        "\t],\n" +
                        "\t\"staff\": []\n" +
                        "}")
                .when()
                .post("http://localhost:8080/facility/api/department")
                .then()
                .assertThat()
                .statusCode(200);
    }
}
