package aqa_hw_10.pages;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductListingPage {

    public void selectExactProductOfList (int index) {
        int newIndex = index - 1;
        $$("[class='order-0']").get(newIndex).shouldBe(clickable).click();
    }

    public void clickOnComparePageButton() {
        $("a.oct-fixed-bar-item-compare").click();
    }

    public void addProductToCompareList(int index) {
        int newIndex = index - 1;
        $$("button.compare").get(newIndex).hover().shouldBe(visible).click();
    }

    public String getExactProductTitle(int index) {
        int newIndex = index - 1;
        return $$("div.rm-module-title").get(newIndex).shouldBe(visible).getText();
    }
}
