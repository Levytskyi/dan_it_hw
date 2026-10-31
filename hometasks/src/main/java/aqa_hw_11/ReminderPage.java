package aqa_hw_11;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class ReminderPage {

    public void enterEmailInEmailField(String email) {
        $("input.field").shouldBe(exist).setValue(email);
    }

    public void clickOnSendButton() {
        $("button.btn").shouldBe(clickable).click();
    }

    public boolean errorMessageIsDisplayed() {
        return $("div.error").isDisplayed();
    }
}
