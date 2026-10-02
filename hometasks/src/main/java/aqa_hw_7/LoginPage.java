package aqa_hw_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    private final By PASSWORD_INPUT = By.xpath("//div[@class='login-form__field login-form__field-password']/input[@class='field m_b-5']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterPassword(String password) {
        getWait().until(ExpectedConditions.
                        visibilityOfElementLocated(PASSWORD_INPUT)).
                sendKeys(password);
    }

    public void showPasswordButtonClick() {
        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//button[@class='password__button']"))).
                click();
    }

    public String getPasswordInputTypeAttribute(String type) {
        getWait().until(ExpectedConditions.
                        attributeToBe(PASSWORD_INPUT, "type", type));
        return getDriver().findElement(PASSWORD_INPUT).getDomAttribute("type");

    }
}
