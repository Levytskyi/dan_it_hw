package aqa_hw_11.step_definitions;

import aqa_hw_11.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginPageStepDefinitions {
    private LoginPage loginPage = new LoginPage();

    @And("User clicks the password reminder button on the Login Page")
    public void clickOnRemindPasswordButton() {
        loginPage.clickOnRemindPasswordButton();
    }

    @And("User enters {string} in the password field on the Login Page")
    public void enterPasswordInPasswordField(String password) {
        loginPage.enterPasswordInPasswordField(password);
    }

    @Then("the password field on the Login Page contains {string}")
    public void verifyPasswordFieldContainsCorrectValue(String expectedValue) {
        Assert.assertEquals("The passwords don't match", expectedValue, loginPage.getValueFromPasswordField());
    }
}
