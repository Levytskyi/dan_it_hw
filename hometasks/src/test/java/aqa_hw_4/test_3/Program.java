package aqa_hw_4.test_3;

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

        WebElement userButton = driver.findElement(By.cssSelector("[class='user-button__image flex middle-xs center-xs']"));
        userButton.click();
        sleep(5000);

        Assert.assertTrue(driver.getCurrentUrl().contains("login/"));

        driver.quit();
    }
}
