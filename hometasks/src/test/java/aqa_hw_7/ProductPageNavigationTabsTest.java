package aqa_hw_7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageNavigationTabsTest extends BaseTest {

    @Test
    public void verifyProductNavigationTabsCanSwitch() {
        String productToFind = "Marshall";
        String expectedPartClassAttribute = "active";
        String expectedAboutProductTitle = "Опис";

        HomePage homePage = new HomePage(getDriver());
        homePage.enterSearchText(productToFind);
        homePage.searchButtonClick();

        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        searchResultPage.firstProductClick();

        ProductDetailPage productDetailPage = new ProductDetailPage(getDriver());
        productDetailPage.aboutProductTabClick();

        String aboutProductTabClassAttribute = productDetailPage.getProductTabClassAttribute();
        String actualAboutProductTitle = productDetailPage.getAboutProductTabTitleText();

        Assert.assertTrue(aboutProductTabClassAttribute.contains(expectedPartClassAttribute), "The about product tab doesn't active");
        Assert.assertEquals(actualAboutProductTitle.toLowerCase().trim(), expectedAboutProductTitle.toLowerCase().trim(), "Titles don't match");

    }
}
