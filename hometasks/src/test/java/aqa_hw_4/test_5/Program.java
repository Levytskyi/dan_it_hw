package aqa_hw_4.test_5;

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

        String item = "Дитячі товари";

        WebElement categoryItem = driver.findElement(By.xpath("//i[@class='icon-section--categories icon-section--categories--deti']"));
        categoryItem.click();
        sleep(5000);

        WebElement currentCategoryTitle = driver.findElement(By.xpath("//h1[@class='title-page flex middle-xs section-title']"));
        String titleValue = currentCategoryTitle.getText();
        sleep(5000);

        Assert.assertTrue(titleValue.contains(item));

        driver.quit();
    }
}
