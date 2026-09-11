package aqa_hw_4.test_2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Program {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://hotline.ua/");

        WebElement locationButton = driver.findElement(By.cssSelector("[class='header__location-button hidden-below-xl']"));
        locationButton.click();
        sleep(5000);

        WebElement locationModalWindow = driver.findElement(By.cssSelector("[class='modal modal--center']"));
        sleep(5000);

        Assert.assertTrue(locationModalWindow.isDisplayed());

        driver.quit();
    }
}
