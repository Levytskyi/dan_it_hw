package aqa_hw_8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductMemoryOptionCanChangeTest extends BaseTest {

    @Test
    public void verifyProductMemoryCanChanged() {
        String productToFind = "Mac Mini";
        String titlePartBeforeChanging = "256GB";
        String titlePartAfterChanging = "512GB";

        HomePage homePage = new HomePage();
        homePage.enterSearchText(productToFind);
        homePage.searchButtonClick();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.firstElementClick();

        ProductDetailPage productDetailPage = new ProductDetailPage();
        productDetailPage.ssdCapacityOptionButtonClick();
        String titleBeforeChanging = productDetailPage.getMainTitleContain(titlePartBeforeChanging);

        productDetailPage.selectSsd512Gb();
        String titleAfterChanging = productDetailPage.getMainTitleContain(titlePartAfterChanging);

        Assert.assertNotEquals(titleAfterChanging, titleBeforeChanging, "The title hasn't changed!");
        Assert.assertTrue(titleAfterChanging.contains(titlePartAfterChanging), "The title doesn't contain " + titlePartAfterChanging);
    }
}
