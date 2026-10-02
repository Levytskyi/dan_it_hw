package aqa_hw_7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
