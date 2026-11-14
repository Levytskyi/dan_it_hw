package aqa_hw_3.hw_task_2;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://hotline.ua/");

            WebElement computersSectionButton = driver.findElement(By.cssSelector("[href='/ua/computer/'][data-tracking-id='index-5']"));
            computersSectionButton.click();
            sleep(5000);

            WebElement accessoriesSectionButton = driver.findElement(By.cssSelector("[href='/ua/computer/#kompyuternaya-periferiya']"));
            accessoriesSectionButton.click();
            sleep(5000);

            WebElement webcamSectionButton = driver.findElement(By.cssSelector("a.section-navigation__link[href='/ua/computer/web-kamery/']"));
            webcamSectionButton.click();
            sleep(5000);

            WebElement webcamTitle = driver.findElement(By.cssSelector("[class='catalog-title__main']"));

            Assert.assertEquals("Веб-камери", webcamTitle.getText());
            Assert.assertTrue(driver.getCurrentUrl().contains("ua/computer/web-kamery/"));
        } catch (AssertionFailedError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
