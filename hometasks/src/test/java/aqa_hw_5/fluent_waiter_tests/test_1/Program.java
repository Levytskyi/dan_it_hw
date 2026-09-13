package aqa_hw_5.fluent_waiter_tests.test_1;

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
                withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofSeconds(1));

        WebElement customerGuideButton = driver.findElement(By.xpath("//a[@data-tracking-id='global-24']"));
        customerGuideButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='top-search']//input[@type='text']")));
        WebElement guideSearchInput = driver.findElement(By.xpath("//div[@class='top-search']//input[@type='text']"));
        guideSearchInput.sendKeys("монітори");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='autosuggest__results-item--0']")));
        WebElement guideSearchDropListItem = driver.findElement(By.xpath("//li[@id='autosuggest__results-item--0']"));
        guideSearchDropListItem.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='catalog-guide__select-trigger']")));
        WebElement guideTopicsDropListButton = driver.findElement(By.xpath("//button[@class='catalog-guide__select-trigger']"));
        guideTopicsDropListButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='catalog-guide__select-list']")));
        WebElement guideTopicsDropList = driver.findElement(By.xpath("//div[@class='catalog-guide__select-list']"));

        Assert.assertTrue(guideTopicsDropList.isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().contains("monitory/"));

        driver.quit();
    }
}
