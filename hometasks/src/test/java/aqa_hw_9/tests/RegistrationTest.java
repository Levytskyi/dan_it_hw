package aqa_hw_9.tests;

import aqa_hw_9.HomePage;
import aqa_hw_9.RegistrationPage;
import aqa_hw_9.base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    @Test
    @Description("Verify that the email field has a correct attribute value")
    @Epic("Internet store")
    @Feature("Registration")
    @Story("Registration page")
    @Link(name = "About the Store", url = "https://g-store.com.ua/pro-magazin-ua/")
    @Issue("JIRA-25664")
    public void verifyEmailInputType() {
        String emailInputAttributeToCompare = "type";
        String expectedEmailInputType = "email";

        HomePage homePage = new HomePage();
        homePage.openLoginPopupClick();
        homePage.openRegistrationPageClick();

        RegistrationPage registrationPage = new RegistrationPage();
        String actualEmailInputType = registrationPage.getEmailInputAttribute(emailInputAttributeToCompare);

        Assert.assertEquals(actualEmailInputType, expectedEmailInputType, "The attributes don't match");
    }
}
