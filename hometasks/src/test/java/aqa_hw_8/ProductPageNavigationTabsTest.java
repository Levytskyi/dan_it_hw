package aqa_hw_8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageNavigationTabsTest extends BaseTest{

    @Test
    public void verifyProductNavigationTabsCanSwitch() {
        String productToFind = "Marshall";
        String expectedPartClassAttribute = "active";
        String expectedAboutProductTitle = "Опис";

        HomePage homePage = new HomePage();
        homePage.enterSearchText(productToFind);
        homePage.searchButtonClick();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.firstElementClick();

        ProductDetailPage productDetailPage = new ProductDetailPage();
        productDetailPage.aboutProductTabClick();

        String aboutProductClassAttribute = productDetailPage.getProductClassAttribute();
        String actualAboutProductTitle = productDetailPage.getAboutProductTitleText();

        Assert.assertTrue(aboutProductClassAttribute.contains(expectedPartClassAttribute), "The about product tab doesn't active");
        Assert.assertEquals(actualAboutProductTitle.trim(), expectedAboutProductTitle.trim(), "the titles don't match");
    }
}
