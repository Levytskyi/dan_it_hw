package aqa_hw_5.fluent_waiter_tests.test_2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Program {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        FluentWait<WebDriver> wait = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(7)).
                pollingEvery(Duration.ofSeconds(1));

        WebElement mainInput = driver.findElement(By.xpath("//input[@type='text']"));
        mainInput.sendKeys("smarthome");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='autosuggest__results-item--0']")));
        WebElement inputSuggestListItem = driver.findElement(By.xpath("//li[@id='autosuggest__results-item--0']"));
        inputSuggestListItem.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@data-tracking-id='catalog-13'])[1]")));
        WebElement firstItemPriceComperingButton = driver.findElement(By.xpath("(//a[@data-tracking-id='catalog-13'])[1]"));
        firstItemPriceComperingButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='mini-price-dynamics__wrapper']")));
        WebElement priceDynamicButton = driver.findElement(By.xpath("//div[@class='mini-price-dynamics__wrapper']"));
        priceDynamicButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal modal--center']")));
        WebElement modalWindowPriceDynamic = driver.findElement(By.xpath("//div[@class='modal modal--center']"));
        WebElement modalWindowTitle = driver.findElement(By.xpath("//div[@class='modal__title']"));

        Assert.assertTrue(modalWindowPriceDynamic.isDisplayed());
        Assert.assertEquals("Динаміка цін", modalWindowTitle.getText());

        driver.quit();
    }
}
