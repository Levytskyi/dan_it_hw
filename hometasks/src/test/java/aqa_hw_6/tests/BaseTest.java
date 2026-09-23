package aqa_hw_6.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
}
