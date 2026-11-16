package aqa_hw_10.pages;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductDetailPage {

    public void clickOnAddToCartButton() {
        $("#button-cart").shouldBe(clickable).click();
    }

    public void clickOnPlaceOrderButtonInCartModalWindow() {
        $("a[class='rm-btn dark mt-auto d-block text-center']").shouldBe(clickable).click();
    }

    public void deliveryInformationButtonClick() {
        $("[data-rel='6']").shouldBe(clickable).click();
    }

    public String getModalWindowTitle() {
        return $("#modal-agree .modal-title").shouldBe(visible).getText();
    }

    public boolean modalWindowIsDisplayed() {
        return $("#modal-agree").shouldBe(visible).isDisplayed();
    }
}
