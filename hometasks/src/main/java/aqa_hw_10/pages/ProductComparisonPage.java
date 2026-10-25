package aqa_hw_10.pages;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$x;

public class ProductComparisonPage {

    public boolean productWithTitleIsDisplayed(String title) {
        return $x("//a[normalize-space(.) = '" + title + "']").isDisplayed();
    }
    public boolean productWithUrlIsDisplayed(String url) {
        return $x("//a[contains(@href, '" + url + "')]").shouldBe(attribute("href")).isDisplayed();
    }
}
