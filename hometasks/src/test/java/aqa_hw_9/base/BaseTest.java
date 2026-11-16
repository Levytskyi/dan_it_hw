package aqa_hw_9.base;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void beforeTest() {
        Selenide.open("https://g-store.com.ua/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        Selenide.closeWebDriver();
    }
}
