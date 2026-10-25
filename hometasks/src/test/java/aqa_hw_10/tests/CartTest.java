package aqa_hw_10.tests;

import aqa_hw_10.pages.HomePage;
import aqa_hw_10.pages.PlaceOrderPage;
import aqa_hw_10.pages.ProductDetailPage;
import aqa_hw_10.pages.ProductListingPage;
import aqa_hw_10.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

    @Test
    public void verifyCartTotalAfterIncreasingProductQuantity() {
        testCaseId = 2;

        int selectedProductIndex = 1;

        HomePage homePage = new HomePage();
        homePage.clickOnProductCatalogButton();
        homePage.selectIpadCategoryInProductCatalog();

        ProductListingPage productListingPage = new ProductListingPage();
        productListingPage.selectExactProductOfList(selectedProductIndex);

        ProductDetailPage productDetailPage = new ProductDetailPage();
        productDetailPage.clickOnAddToCartButton();
        productDetailPage.clickOnPlaceOrderButtonInCartModalWindow();

        PlaceOrderPage placeOrderPage = new PlaceOrderPage();
        int oneProductPrice = placeOrderPage.getOneProduct$Price();
        int totalPrice = placeOrderPage.getTotal$Price();

        Assert.assertEquals(totalPrice, oneProductPrice, "The total doesn't equal " + oneProductPrice);

        placeOrderPage.increaseProductQuantity();
        int totalPriceAfterIncreasingProductQuantity = placeOrderPage.getTotal$Price(totalPrice);

        Assert.assertEquals(totalPriceAfterIncreasingProductQuantity, totalPrice + oneProductPrice, "The new total doesn't equal " + (totalPrice + oneProductPrice));
    }
}
