package aqa_hw_4.test_4;

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
        sleep(5000);

        WebElement input = driver.findElement(By.xpath("//input[@aria-controls='autosuggest-autosuggest__results']"));
        input.sendKeys("відпарювач");
        sleep(5000);

        WebElement catalogItem = driver.findElement(By.xpath("//li[@id='autosuggest__results-item--5']"));
        catalogItem.click();
        sleep(5000);

        WebElement firstItem = driver.findElement(By.xpath("(//a[contains(@class, 'list-item__img')])[1]"));
        sleep(5000);
        firstItem.click();
        sleep(5000);

        WebElement addToWishlistButton = driver.findElement(By.xpath("//div[@class='action-button flex action-button--bookmark']"));
        addToWishlistButton.click();
        sleep(5000);

        WebElement wishlistModalWindow = driver.findElement(By.xpath("//div[@class='modal modal--center modal--no-padding']"));
        sleep(5000);

        Assert.assertTrue(wishlistModalWindow.isDisplayed());

        driver.quit();
    }
}
