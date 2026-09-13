package aqa_hw_5.explicit_waiter_tests.test_2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Program {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement reviewAboutShops = driver.findElement(By.xpath("//a[@data-eventlabel='services.shopReviews']"));
        reviewAboutShops.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Пошук відгуку за назвою магазину...']")));
        WebElement storesSearch = driver.findElement(By.xpath("//input[@placeholder='Пошук відгуку за назвою магазину...']"));
        storesSearch.sendKeys("rozetka.ua");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='autosuggest__results-item--0']")));
        WebElement firstElementOfDropList = driver.findElement(By.xpath("//li[@id='autosuggest__results-item--0']"));
        firstElementOfDropList.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='tabs-item flex center-xs middle-xs store-info__tab-item']")));
        WebElement aboutStoreTab = driver.findElement(By.xpath("//div[@class='tabs-item flex center-xs middle-xs store-info__tab-item']"));
        aboutStoreTab.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='gmap-static__button btn btn--graphite btn--wide']")));
        WebElement showMapButton = driver.findElement(By.xpath("//*[@class='gmap-static__button btn btn--graphite btn--wide']"));
        showMapButton.click();

        WebElement mapWindow = driver.findElement(By.xpath("//*[@class='vue-map']"));

        Assert.assertTrue(mapWindow.isDisplayed());

        driver.quit();
    }
}
