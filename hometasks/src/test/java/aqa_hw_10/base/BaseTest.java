package aqa_hw_10.base;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static aqa_hw_10.controllers.TestRailController.publishResults;


public class BaseTest {
    protected int testCaseId;

    @BeforeMethod
    public void beforeMethod() {
        Selenide.open("https://g-store.com.ua/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        Selenide.closeWebDriver();
    }

    @AfterMethod
    public void publishResultsToTestRail(ITestResult testResult) {
        if(testResult.getStatus() == ITestResult.SUCCESS) {
            publishResults(1, testCaseId);
        } else {
            publishResults(5, testCaseId);
        }
    }
}
