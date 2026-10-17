package aqa_hw_9.tests;

import aqa_hw_9.HomePage;
import aqa_hw_9.ProductListingPage;
import aqa_hw_9.ProductDetailPage;
import aqa_hw_9.base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OneClickOrderTest extends BaseTest {

    @Test
    @Epic("Internet store")
    @Feature("One click order")
    @Story("One click order final message")
    @Description("Verify that a success message appears after filled form has been submitted")
    @Link(name = "About the Store", url = "https://g-store.com.ua/pro-magazin-ua/")
    @Issue("JIRA-78554")
    public void verifyOneClickOrderSuccessMessagePresent() {
        String name = "name";
        String phoneNumber = "7777777777";
        String expectedSuccessMessage = "успішно оформлено";

        HomePage homePage = new HomePage();
        homePage.openProductCatalogButtonClick();
        homePage.iphoneCategoryClick();

        ProductListingPage productListingPage = new ProductListingPage();
        productListingPage.firstProductClick();

        ProductDetailPage productDetailPage = new ProductDetailPage();
        productDetailPage.oneClickOrderButtonClick();

        productDetailPage.enterNameIntoOneClickOrderForm(name);
        productDetailPage.enterPhoneNumberIntoOneClickOrderForm(phoneNumber);
        productDetailPage.checkoutButtonIntoOneClickFormClick();

        String actualSuccessMessage = productDetailPage.getSuccessMessage();

        Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage), "The current message doesn't contain " + expectedSuccessMessage);
    }
}
