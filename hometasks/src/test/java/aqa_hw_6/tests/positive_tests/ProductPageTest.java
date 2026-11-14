package aqa_hw_6.tests.positive_tests;

import aqa_hw_6.listeners.TestListener;
import aqa_hw_6.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class ProductPageTest extends BaseTest {
    @Test
    public void verifyProductColorChangeSection() {
        String white = "Білий";
        String black = "Чорний";
        String errorMessage = "The actual product color doesn't match the expected one";

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//div[@class='button-menu-main ']"))).
                click();

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//a[normalize-space(.)='Бренди']"))).
                click();

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//a[@class='brands-filter__item link' and normalize-space(.)='Z']"))).
                click();

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//div[@id='Z']//a[@class='link link--black' and normalize-space(.)='Zalman']"))).
                click();

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//div[@class='list-item__title-container m_b-5']/a[@data-tracking-id='catalog-10' and normalize-space(.)='Zalman Chronix V2 White']"))).
                click();

        By productColorLocator = By.xpath("//div[@class='similar-colors-products__section']/*/b");

        WebElement productCurrentColor = getWait().
                until(ExpectedConditions.
                        visibilityOfElementLocated(productColorLocator));

        Assert.assertEquals(productCurrentColor.getText(), white, errorMessage);

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//img[@alt='Чорний фото']"))).
                click();

        getWait().until(ExpectedConditions.
                textToBePresentInElementLocated(productColorLocator, black));

        productCurrentColor = getDriver().findElement(productColorLocator);

        Assert.assertEquals(productCurrentColor.getText(), black, errorMessage);
    }

    @Test
    public void verifyProductShareLinkMatchWithActual() {
        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//a[@class='categories-section__link link--black' and normalize-space(.)='Авто і Мото']"))).
                click();

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//a[@class='link--black' and normalize-space(.)='Техдопомога']"))).
                click();

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//img[@alt='фото Каністри, лійки']"))).
                click();

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//div[@class='list-item__title-container m_b-5']/a[normalize-space(.)='2E JCM5H']"))).
                click();

        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//div[@class='action-button flex action-button--share']"))).
                click();

        WebElement shareModalWindow = getWait().
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.xpath("//div[@class='modal modal--center']")));

        Assert.assertTrue(shareModalWindow.isDisplayed());

        WebElement shareModalWindowInput = getWait().
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.xpath("//input[@class='share-link__input field']")));

        String expectedUrl = getDriver().getCurrentUrl();
        String actualUrl = shareModalWindowInput.getDomProperty("value");

        Assert.assertEquals(actualUrl, expectedUrl, "Share URL doesn't match the current page URL");
    }
}
