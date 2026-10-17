package aqa_hw_9.tests;

import aqa_hw_9.HomePage;
import aqa_hw_9.ProductDetailPage;
import aqa_hw_9.ProductListingPage;
import aqa_hw_9.base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreditWindowTest extends BaseTest {
    @Test
    @Epic("Internet store")
    @Feature("Purchase on credit")
    @Story("Product information in the credit window")
    @Description("Verify that the title in credit window matches the selected product title")
    @Link(name = "About the Store", url = "https://g-store.com.ua/pro-magazin-ua/")
    @Issue("JIRA-955324")
    public void verifyCreditWindowTitleMatchProductTitle() {
        String productToSearch = "iPhone";

        HomePage homePage = new HomePage();
        homePage.enterSearchFieldAndClickEnterButton(productToSearch);

        ProductListingPage productListingPage = new ProductListingPage();
        productListingPage.firstProductClick();

        ProductDetailPage productDetailPage = new ProductDetailPage();
        String mainProductTitle = productDetailPage.getProductTitle();
        productDetailPage.creditButtonClick();
        String creditWindowProductTitle = productDetailPage.getCreditPopupTitle();

        Assert.assertEquals(creditWindowProductTitle, mainProductTitle, "Titles don't match");
    }
}
