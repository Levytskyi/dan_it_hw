package aqa_hw_4.test_6;

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
        driver.manage().window().maximize();

        WebElement burgerMenu = driver.findElement(By.xpath("//div[@class='button-menu-main ']"));
        burgerMenu.click();
        sleep(5000);

        WebElement menuFirstItem = driver.findElement(By.xpath("//a[@data-id='10']"));
        menuFirstItem.click();
        sleep(5000);

        WebElement categoryFirstElement = driver.findElement(By.xpath("(//div[@class='section-navigation__item content'])[1]"));
        categoryFirstElement.click();
        sleep(5000);

        WebElement firstItemToCompare = driver.findElement(By.xpath("(//button[@class='compare-button'])[1]"));
        firstItemToCompare.click();
        sleep(5000);

        WebElement secondItemToCompare = driver.findElement(By.xpath("(//button[@class='compare-button'])[2]"));
        secondItemToCompare.click();
        sleep(5000);

        WebElement compareButton = driver.findElement(By.xpath("//div[@data-tracking-id='global-16']"));
        compareButton.click();
        sleep(5000);

        WebElement openComparing = driver.findElement(By.xpath("//div[@class='profile-sidebar__section-child-container']"));
        openComparing.click();
        sleep(5000);

        Assert.assertTrue(driver.getTitle().contains("Порівняння"));
        driver.quit();
    }
}
