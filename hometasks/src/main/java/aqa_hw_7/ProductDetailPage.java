package aqa_hw_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductDetailPage extends BasePage {
    private final By MAIN_TITLE = By.xpath("//h1[@class='title__main']");
    private final By ABOUT_PRODUCT_TAB = By.xpath("//div[@data-tracking-id='product-19']");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void ssdCapacityOptionButtonClick() {
        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//div[@class='similar-colors-products__section']/span[contains(normalize-space(.), 'SSD')]"))).
                click();
    }

    public void selectSsd512Gb() {
        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//a[contains(@class, 'similar-series-products__item flex')]//b[contains(normalize-space(.), '512')]"))).
                click();
    }

    public void waitMainTitleContain(String expectedPart) {
        getWait().until(ExpectedConditions.
                textToBePresentInElementLocated(MAIN_TITLE, expectedPart));
    }

    public String getMainTitleText() {
        return getDriver().findElement(MAIN_TITLE).getText();
    }

    public void aboutProductTabClick() {
        getWait().until(ExpectedConditions.
                        elementToBeClickable(ABOUT_PRODUCT_TAB)).
                click();
    }

    public String getProductTabClassAttribute() {
        return getWait().until(ExpectedConditions.
                        visibilityOfElementLocated(ABOUT_PRODUCT_TAB)).
                getDomAttribute("class");
    }

    public String getAboutProductTabTitleText() {
        return getWait().until(ExpectedConditions.
                        visibilityOfElementLocated(By.xpath("//h2[@class='text-x-lg']"))).
                getText();
    }
}
