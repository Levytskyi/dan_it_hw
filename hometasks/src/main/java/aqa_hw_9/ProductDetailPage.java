package aqa_hw_9;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ProductDetailPage {

    @Step("Click on the one click order button")
    public void oneClickOrderButtonClick() {
        $("#button-cart-one-click").shouldBe(clickable).click();
    }

    @Step("Enter '{name}' into name field in the one click order form")
    public void enterNameIntoOneClickOrderForm(String name) {
        $("#user_name").shouldBe(visible).setValue(name);
    }

    @Step("Enter '{phoneNumber}' into phone field in the one click order form")
    public void enterPhoneNumberIntoOneClickOrderForm(String phoneNumber) {
        $("#user_telephone").shouldBe(visible).setValue(phoneNumber);
    }

    @Step("Click on the checkout button into one click order form")
    public void checkoutButtonIntoOneClickFormClick() {
        $("#button_checkout").shouldBe(clickable).click();
    }

    @Step("Get a message from the popup that will be shown after success the one click order form submit")
    public String getSuccessMessage() {
        return $("#rm-popup-success-text").shouldBe(visible).getText();
    }

    @Step("Get a product title on the product page")
    public String getProductTitle() {
        return $("h1").shouldBe(visible).getText();
    }

    @Step("Click on the credit button on the product page")
    public void creditButtonClick() {
        $("button.csscredits").shouldBe(clickable).click();
    }

    @Step("Get title from the credit popup that will appear after the credit button click")
    public String getCreditPopupTitle() {
        return $("div.creditname").shouldBe(visible).getText();
    }

    @Step("Click on the review tab on the product page")
    public void reviewTabClick() {
        $("[href='#product_reviews']").shouldBe(clickable).click();
    }

    @Step("Click on the leave a review button on the product page")
    public void leaveReviewButtonClick() {
        $("[data-target='#rm-popup-review']").shouldBe(clickable).click();
    }

    @Step("Enter '{name}' into the name field in the review form")
    public void enterNameIntoReviewForm(String name) {
        $x("//input[@id='InputName']").shouldBe(interactable).setValue(name);
    }

    @Step("Enter '{description}' into the description field in the review form")
    public void enterDescriptionIntoReviewForm(String description) {
        $("#input-review").shouldBe(interactable).setValue(description);
    }

    @Step("Click on the submit button in the review form")
    public void submitReviewButtonClick() {
        $("#button-review").shouldBe(clickable).click();
    }

    @Step("Check that the warning alert is displayed")
    public Boolean warnAlertIsDisplayed() {
        return $("div.rm-alert-text").shouldBe(visible).isDisplayed();
    }

    @Step("Get the first alert message")
    public String getAlertFirstMessage() {
        return $$("[class='alert-text-item']").first().shouldBe(visible).getText();
    }
}
