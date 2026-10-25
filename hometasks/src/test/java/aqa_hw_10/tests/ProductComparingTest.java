package aqa_hw_10.tests;

import aqa_hw_10.pages.ProductComparisonPage;
import aqa_hw_10.pages.HomePage;
import aqa_hw_10.pages.ProductListingPage;
import aqa_hw_10.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductComparingTest extends BaseTest {

    @Test
    public void verifySelectedProductsAreAddedToComparison() {
        testCaseId = 3;

        String productToSearch = "EcoFlow";
        int firstSelectedProductIndex = 1;
        int secondSelectedProductIndex = 3;

        HomePage homePage = new HomePage();
        homePage.enterProductNameIntoSearchField(productToSearch);
        homePage.clickOnSearchButton();

        ProductListingPage productListingPage = new ProductListingPage();
        productListingPage.addProductToCompareList(firstSelectedProductIndex);
        productListingPage.addProductToCompareList(secondSelectedProductIndex);

        String firstProductExpectedTitle = productListingPage.getExactProductTitle(firstSelectedProductIndex);
        String secondProductExpectedTitle = productListingPage.getExactProductTitle(secondSelectedProductIndex);
        productListingPage.clickOnComparePageButton();

        ProductComparisonPage productComparisonPage = new ProductComparisonPage();
        boolean firstProductTitleIsDisplayed = productComparisonPage.productWithTitleIsDisplayed(firstProductExpectedTitle);
        boolean secondProductTitleIsDisplayed = productComparisonPage.productWithTitleIsDisplayed(secondProductExpectedTitle);

        Assert.assertTrue(firstProductTitleIsDisplayed, firstProductExpectedTitle + " - isn't displayed");
        Assert.assertTrue(secondProductTitleIsDisplayed, secondProductExpectedTitle + " - isn't displayed");
    }
}
