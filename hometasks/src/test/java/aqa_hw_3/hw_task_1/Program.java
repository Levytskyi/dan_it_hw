package aqa_hw_3.hw_task_1;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        String wordToFind = "iPhone";
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
            searchField.sendKeys(wordToFind);
            sleep(2000);

//        WebElement searchButton = driver.findElement(By.cssSelector("[title='Поиск']"));
//        searchButton.click();
//        sleep(5000);

            WebElement searchResultsItem = driver.findElement(By.cssSelector("[id ='autosuggest__results-item--0']"));
            searchResultsItem.click();

            sleep(7000);

            WebElement titleElement = driver.findElement(By.cssSelector("h1.catalog-title__main"));
            String pageTitleText = titleElement.getText();
            Assert.assertTrue(String.format("<%s> title doesn't contain <%s> word", pageTitleText, wordToFind), pageTitleText.contains(wordToFind));
        } catch (AssertionFailedError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
