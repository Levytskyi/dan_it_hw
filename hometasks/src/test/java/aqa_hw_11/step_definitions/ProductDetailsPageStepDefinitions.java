package aqa_hw_11.step_definitions;

import aqa_hw_11.ProductDetailsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProductDetailsPageStepDefinitions extends BaseStepDefinition {
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Then("User verify product title is correct on Product Details Page")
    public void verifyProductTitle() {
        String expectedProductTitle = getValueFromMapByKey("expectedProductTitle");
        String actualProductTitle = productDetailsPage.getProductName();
        Assert.assertTrue(actualProductTitle.contains(expectedProductTitle));
    }
}
