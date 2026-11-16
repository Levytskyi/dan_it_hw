package aqa_hw_8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPagePasswordFieldTest extends BaseTest {

    @Test
    public void verifyPasswordFieldTypeChanging() {
        String password = "Password111@";
        String expectedPasswordFieldTypeAfterClick = "text";
        String expectedPasswordFieldTypeBeforeClick = "password";

        HomePage homePage = new HomePage();
        homePage.userPageClick();

        LoginPage loginPage = new LoginPage();
        loginPage.enterPassword(password);
        String actualPasswordFieldTypeBeforeClick = loginPage.getPasswordInputTypeAttribute(expectedPasswordFieldTypeBeforeClick);

        Assert.assertEquals(actualPasswordFieldTypeBeforeClick, expectedPasswordFieldTypeBeforeClick, "The actual password field type doesn't match the expected one");

        loginPage.showPasswordButtonClick();
        String actualPasswordFieldTypeAfterClick = loginPage.getPasswordInputTypeAttribute(expectedPasswordFieldTypeAfterClick);

        Assert.assertEquals(actualPasswordFieldTypeAfterClick, expectedPasswordFieldTypeAfterClick, "The actual password field type doesn't match the expected one");
    }
}
