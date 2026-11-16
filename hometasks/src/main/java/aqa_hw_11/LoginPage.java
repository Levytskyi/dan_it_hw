package aqa_hw_11;

import java.time.Duration;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public void clickOnRemindPasswordButton() {
        $("div.m_b-15 a").shouldBe(clickable).click();
    }

    public void enterPhoneNumberInPhoneNumberField(String phoneNumber) {
        $("[type='text']").shouldBe(exist).setValue(phoneNumber);
    }

    public void enterPasswordInPasswordField(String password) {
        $("[type='password']").shouldBe(exist).setValue(password);
    }

    public void clickOnSubmitButton() {
        $("[type='submit']").shouldBe(clickable, Duration.ofSeconds(10)).click();
    }

    public boolean passwordFieldErrorMessageIsDisplayed() {
        return $("div.login-form__field-password div.error").isDisplayed();
    }

    public String getValueFromPasswordField() {
        return $("[type='password']").getValue();
    }
}
