package aqa_hw_7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void firstProductClick() {
        getWait().until(ExpectedConditions.
                        elementToBeClickable(By.xpath("(//a[contains(@class, 'item-title')])[1]"))).
                click();
    }
}
