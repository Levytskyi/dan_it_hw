package aqa_hw_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterSearchText(String textToSearch) {
        getWait().until(ExpectedConditions.
                        visibilityOfElementLocated(By.xpath("//input[@type='text']"))).
                sendKeys(textToSearch);
    }

    public void searchButtonClick() {
        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//button[contains(@class, 'search__btn flex')]"))).
                click();
    }

    public void userPageClick() {
        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//div[@class='user-info']"))).
                click();
    }

}
