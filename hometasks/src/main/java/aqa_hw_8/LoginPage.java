package aqa_hw_8;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private final Duration TIMEOUT = Duration.ofSeconds(5);
    private final SelenideElement passwordInput = $x("//div[@class='login-form__field login-form__field-password']/input[@class='field m_b-5']");

    public void enterPassword(String password) {
        passwordInput.
                shouldBe(visible, TIMEOUT).
                setValue(password);
    }

    public void showPasswordButtonClick() {
        $x("//button[@class='password__button']").
                shouldBe(clickable, TIMEOUT).
                click();
    }

    public String getPasswordInputTypeAttribute(String type) {
        return passwordInput.
                shouldHave(attribute("type", type), TIMEOUT).
                getAttribute("type");
    }

}
