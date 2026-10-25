package aqa_hw_10.pages;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.interactable;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public void clickOnProductCatalogButton() {
        $("#menu_toggle_button").shouldBe(clickable).click();
    }

    public void selectIpadCategoryInProductCatalog() {
        $("img[alt='IPad']").shouldBe(clickable).click();
    }

    public void enterProductNameIntoSearchField(String productName) {
        $("#input_search").shouldBe(interactable).setValue(productName);
    }

    public void clickOnSearchButton() {
        $("#rm-search-button").shouldBe(clickable).click();
    }
}
