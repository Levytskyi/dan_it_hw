package aqa_hw_7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductMemoryOptionCanChangeTest extends BaseTest {

    @Test
    public void verifyProductMemoryCanChanged() {
        String productToFind = "Mac Mini";
        String titlePartBeforeChanging = "256GB";
        String titlePartAfterChanging = "512GB";

        HomePage homePage = new HomePage(getDriver());
        homePage.enterSearchText(productToFind);
        homePage.searchButtonClick();

        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        searchResultPage.firstProductClick();

        ProductDetailPage productDetailPage = new ProductDetailPage(getDriver());
        productDetailPage.ssdCapacityOptionButtonClick();
        productDetailPage.waitMainTitleContain(titlePartBeforeChanging);
        String titleBeforeChanging = productDetailPage.getMainTitleText();

        productDetailPage.selectSsd512Gb();
        productDetailPage.waitMainTitleContain(titlePartAfterChanging);
        String titleAfterChanging = productDetailPage.getMainTitleText();

        Assert.assertNotEquals(titleAfterChanging, titleBeforeChanging, "The title hasn't changed!");
        Assert.assertTrue(titleAfterChanging.contains(titlePartAfterChanging), "The title doesn't contain " + titlePartAfterChanging);
    }
}
