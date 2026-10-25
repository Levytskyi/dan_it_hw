package aqa_hw_10.tests;

import aqa_hw_10.pages.HomePage;
import aqa_hw_10.pages.ProductDetailPage;
import aqa_hw_10.pages.ProductListingPage;
import aqa_hw_10.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeliveryInformationTest extends BaseTest {

    @Test
    public void verifyDeliveryInformationWindowIsDisplayedWithExpectedTitle() {
        testCaseId = 1;

        String expectedTitle = "доставка";
        String productToSearch = "AirPods";
        int selectedProductIndex = 2;

        HomePage homePage = new HomePage();
        homePage.enterProductNameIntoSearchField(productToSearch);
        homePage.clickOnSearchButton();

        ProductListingPage productListingPage = new ProductListingPage();
        productListingPage.selectExactProductOfList(selectedProductIndex);

        ProductDetailPage productDetailPage = new ProductDetailPage();
        productDetailPage.deliveryInformationButtonClick();

        Assert.assertTrue(productDetailPage.modalWindowIsDisplayed(), "The modal window isn't displayed");

        String actualTitle = productDetailPage.getModalWindowTitle();

        Assert.assertEquals(actualTitle.toLowerCase().trim(), expectedTitle, "The titles don't match");
    }
}
