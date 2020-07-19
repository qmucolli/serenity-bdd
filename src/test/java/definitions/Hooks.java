package definitions;

import cucumber.api.java.Before;
import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

public class Hooks {

    @Before
    public void setup() {
//
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//
//        getWebdriverManager().getWebdriver().manage().window().maximize();
//        getWebdriverManager().getWebdriver().get("http://localhost:4200/login");

        SerenityRest.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}