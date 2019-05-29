package steps;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.steps.ScenarioSteps;
import org.assertj.core.api.Assertions;
import pages.HomePage;
import pages.RegisterPage;

/**
 * Created by Ardit Podrimaj
 */

public class SignUpSteps extends ScenarioSteps {

    HomePage homePage;
    RegisterPage registerPage;

    public void verifyUserIsOnHomePage() {
        Assertions.assertThat(homePage.waitForVisibility(homePage.getSlider()).isPresent()).isTrue();
    }

    public void clickRegisterButton() {
        homePage.waitForVisibility(homePage.getRegisterButton()).click();
    }

    public void typeFirstName(String first) {
        registerPage.waitForVisibility(registerPage.getFirstNameInput()).type(first);
    }

    public void typeLastName(String last) {
        registerPage.waitForVisibility(registerPage.getLastNameInput()).type(last);
    }

    public void typeEmail(String email) {
        registerPage.waitForVisibility(registerPage.getEmailInput()).type(email);
    }

    public void typePassword(String password) {
        registerPage.waitForVisibility(registerPage.getPasswordInput()).type(password);
    }

    public void showPassword() {
        registerPage.waitForVisibility(registerPage.getShowPasswordButton()).click();
    }

    public void createAccount() {
        registerPage.waitForVisibility(registerPage.getCreateAccountButton()).click();
    }
}