package aqa_hw_4.test_1;

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

        String testItem = "Проектори";

        WebElement itemsCatalogButton = driver.findElement(By.cssSelector("[class='button-menu-main ']"));
        itemsCatalogButton.click();

        sleep(6000);

        WebElement allCatalogsButton = driver.findElement(By.cssSelector("[data-id='5621']"));
        allCatalogsButton.click();

        sleep(6000);

        WebElement catalogsSearchInput = driver.findElement(By.cssSelector("[class='search__input']"));
        catalogsSearchInput.sendKeys(testItem);
        sleep(5000);

        WebElement catalogItem = driver.findElement(By.cssSelector("[class='catalog-sections-sub-catalog__link link link--black']"));
        catalogItem.click();
        sleep(5000);

        WebElement  categoryTitle = driver.findElement(By.cssSelector("[class='catalog-title__main']"));
        sleep(4000);

        Assert.assertEquals(testItem, categoryTitle.getText());

        driver.quit();
    }
}
