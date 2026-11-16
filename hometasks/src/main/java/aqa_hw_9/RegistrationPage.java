package aqa_hw_9;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    @Step("Get '{attribute}' attribute from the email field on the registration page")
    public String getEmailInputAttribute(String attribute) {
        return $("#register_email").shouldBe(visible).getAttribute(attribute);
    }
}
