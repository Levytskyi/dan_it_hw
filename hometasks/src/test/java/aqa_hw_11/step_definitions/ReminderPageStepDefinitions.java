package aqa_hw_11.step_definitions;

import aqa_hw_11.ReminderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ReminderPageStepDefinitions {
    private ReminderPage reminderPage = new ReminderPage();

    @And("User enters {string} in the email field on the Reminder Page")
    public void enterEmailInEmailField(String email) {
        reminderPage.enterEmailInEmailField(email);
    }

    @And("User clicks the send button on the Reminder Page")
    public void clickOnSendButton() {
        reminderPage.clickOnSendButton();
    }

    @Then("an error message is displayed on the Reminder Page")
    public void verifyErrorMessageIsDisplayed() {
        Assert.assertTrue("Error message was not displayed", reminderPage.errorMessageIsDisplayed());
    }
}
