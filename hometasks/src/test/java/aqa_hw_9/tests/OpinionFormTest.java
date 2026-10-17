package aqa_hw_9.tests;

import aqa_hw_9.HomePage;
import aqa_hw_9.ProductDetailPage;
import aqa_hw_9.ProductListingPage;
import aqa_hw_9.base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpinionFormTest extends BaseTest {

    @Test
    @Epic("Internet store")
    @Feature("Product review")
    @Story("Review field name validation")
    @Description("Verify that a warning alert appears when an invalid name is entered")
    @Link(name = "About the Store", url = "https://g-store.com.ua/pro-magazin-ua/")
    @Issue("JIRA-55554")
    public void verifyIncorrectValueAlertIsDisplayed() {
        String productToSearch = "EcoFlow DELTA 2";
        String incorrectName = "ts";
        String description = "Some description";
        String expectedErrorMessage = "Ім'я має містити від 3 до 25 символів";

        HomePage homePage = new HomePage();
        homePage.enterSearchFieldAndClickEnterButton(productToSearch);

        ProductListingPage productListingPage = new ProductListingPage();
        productListingPage.firstFoundElementClick();

        ProductDetailPage productDetailPage = new ProductDetailPage();
        productDetailPage.reviewTabClick();
        productDetailPage.leaveReviewButtonClick();
        productDetailPage.enterNameIntoReviewForm(incorrectName);
        productDetailPage.enterDescriptionIntoReviewForm(description);
        productDetailPage.submitReviewButtonClick();

        boolean warnAlertIsDisplayed = productDetailPage.warnAlertIsDisplayed();
        String actualErrorMessage = productDetailPage.getAlertFirstMessage();

        Assert.assertTrue(warnAlertIsDisplayed, "The warn alert isn't displayed");
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "The messages don't match");
    }
}
