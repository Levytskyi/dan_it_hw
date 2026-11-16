package aqa_hw_6.tests.positive_tests;

import aqa_hw_6.listeners.TestListener;
import aqa_hw_6.test_providers.TestDataProvider;
import aqa_hw_6.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

@Listeners(TestListener.class)
public class SearchingAndFilteringTest extends BaseTest {
    @Test
    public void verifyProductQuantityBeforeAndAfterFiltering() {
        String itemToFind = "Nothing";
        int expectedQuantityBeforeFilter = 48;
        int expectedQuantityAfterFilter = 19;

        getWait().until(ExpectedConditions.
                        visibilityOfElementLocated(By.xpath("//input[@type='text']"))).
                sendKeys(itemToFind);

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//button[contains(@class, 'search__btn flex middle-xs')]"))).
                click();

        By elementOfList = By.xpath("//div[contains(@class, 'list-item list-item--column')]");

        List<WebElement> productsBeforeFilter = getWait().
                until(ExpectedConditions.
                        visibilityOfAllElementsLocatedBy(elementOfList));

        Assert.assertEquals(productsBeforeFilter.size(), expectedQuantityBeforeFilter, "Incorrect quantity of products before filtering");

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//div[@class='search-sidebar-catalogs__name link link--black' and contains(normalize-space(.), 'Чохли')]"))).
                click();

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//div[@data-tracking-id='catalog-5']"))).
                click();

        getWait().
                until(ExpectedConditions.
                        numberOfElementsToBe(elementOfList, expectedQuantityAfterFilter));

        List<WebElement> productsAfterFilter = getDriver().
                findElements(elementOfList);

        WebElement actualTitle = getWait().
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.xpath("//div[@class='catalog-title__main']")));

        Assert.assertTrue(actualTitle.getText().contains(itemToFind), "Incorrect title value");
        Assert.assertEquals(
                productsAfterFilter.size(),
                expectedQuantityAfterFilter,
                "Incorrect quantity of products after filtering");
    }

    @Test(dataProvider = "getSearchData", dataProviderClass = TestDataProvider.class)
    public void verifySearchResults(String itemToSearch, String expectedUrlPart) {
        getWait().until(ExpectedConditions.
                        visibilityOfElementLocated(By.xpath("//input[@type='text']"))).
                sendKeys(itemToSearch);

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//button[contains(@class, 'search__btn flex')]"))).
                click();

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("(//a[contains(@data-tracking-id, 'catalog-10')])[1]"))).
                click();
        String productTitle = getWait().
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.xpath("//h1[@class='title__main']"))).
                getText();

        Assert.assertTrue(productTitle.contains(itemToSearch), "The title doesn't contain <" + itemToSearch + ">");
        Assert.assertTrue(getDriver().getCurrentUrl().contains(expectedUrlPart), "The current URL doesn't contain <" + expectedUrlPart + ">");
    }
}
