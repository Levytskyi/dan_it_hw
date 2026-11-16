package aqa_hw_11;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public void openHomePage() {
        Selenide.open("https://hotline.ua/");
    }

    public void enterWordToSearch(String wordToSearch) {
        $("input[type='text']").shouldBe(visible).setValue(wordToSearch);
    }

    public void clickOnSearchButton() {
        $("button.search__btn").shouldBe(clickable).click();
    }

    public void clickOnMainCatalogButton() {
        $("div.button-menu-main").shouldBe(clickable).click();
    }

    public boolean verifyMainCatalogMenuIsDisplayed() {
        return $("ul.menu-main__list").isDisplayed();
    }

    public void clickOnLoginButton() {
        $("[class='user-button__image flex middle-xs center-xs']").shouldBe(clickable).click();
    }

    public void clickOnStoresReviewButton() {
        $("a.shopReviews").shouldBe(clickable).click();
    }
}
