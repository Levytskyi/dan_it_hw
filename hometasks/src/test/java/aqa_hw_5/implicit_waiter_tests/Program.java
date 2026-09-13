package aqa_hw_5.implicit_waiter_tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Program {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        WebElement firstBannerSelector = driver.findElement(By.xpath("//button[@data-eventlabel='GREE - show']"));
        firstBannerSelector.click();

        WebElement firstBannerButton = driver.findElement(By.xpath("//img[@alt='GREE - click']"));
        firstBannerButton.click();

        WebElement returnToPreviousCategory = driver.findElement(By.xpath("//a[normalize-space(.)='Кондиціонери' and @class='breadcrumbs__link']"));
        returnToPreviousCategory.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("/kondicionery/"));

        driver.quit();
    }
}
