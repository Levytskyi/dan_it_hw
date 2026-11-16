package aqa_hw_6.tests.negative_tests;

import aqa_hw_6.listeners.TestListener;
import aqa_hw_6.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class ReminderFormTest extends BaseTest {
    @Test
    public void verifyErrorMessageWithIncorrectEmailFormat() {
        String incorrectEmail = "someEmail";
        String expectedErrorMessage = "Введіть коректний email або номер мобільного телефону";

        getWait().until(ExpectedConditions.
                        visibilityOfElementLocated(By.xpath("//a[@data-tracking-id='global-15']")))
                .click();

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//div[@class='m_b-15']/a[normalize-space(.)='Забули пароль?']"))).
                click();

        getWait().until(ExpectedConditions.urlContains("/reminder/"));

        getWait().until(ExpectedConditions.
                        visibilityOfElementLocated(By.xpath("//form[@class='content reminder-form']//input[@type='text']"))).
                sendKeys(incorrectEmail);

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//button[@class='btn btn--graphite reminder-form__button']"))).
                click();

        By errorContainerLocator = By.xpath("//div[@class='error m_b-5']");

        getWait().until(ExpectedConditions.
                textToBe(errorContainerLocator, expectedErrorMessage));

        String actualErrorMessage = getDriver().findElement(errorContainerLocator).getText();

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "The obtained message doesn't match the expected message");
    }
}
