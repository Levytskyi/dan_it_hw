package aqa_hw_5.explicit_waiter_tests.test_1;

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
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));

        WebElement mainMenuButton = driver.findElement(By.xpath("//div[@class='button-menu-main ']"));
        mainMenuButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-id='1464']")));
        WebElement mainMenuItem = driver.findElement(By.xpath("//a[@data-id='1464']"));
        mainMenuItem.click();

        WebElement navigationCategoryItem = driver.findElement(By.xpath("//*[normalize-space(.)='Серії' and @class='category-navigation__item']"));
        navigationCategoryItem.click();

        WebElement categoryItemToClick = driver.findElement(By.xpath("//*[normalize-space(.)='LEGO Batman' and @class='section-navigation__link-text']"));
        categoryItemToClick.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='catalog-title__main']")));
        WebElement categoryTitle = driver.findElement(By.xpath("//*[@class='catalog-title__main']"));

        Assert.assertTrue(categoryTitle.getText().endsWith("Batman"));

        driver.quit();
    }
}
