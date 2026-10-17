package aqa_hw_9;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    @Step("Click on the catalog of product categories button")
    public void openProductCatalogButtonClick() {
        $("#menu_toggle_button").shouldBe(clickable).click();
    }

    @Step("Click on the iPhone category button")
    public void iphoneCategoryClick() {
        $("img[alt='iPhone']").shouldBe(visible).click();
    }

    @Step("Enter product name on the search field and press enter button")
    public void enterSearchFieldAndClickEnterButton(String textToFind) {
        $("input[id='input_search']").shouldBe(visible).setValue(textToFind).pressEnter();
    }

    @Step("Click on the personal account button")
    public void openLoginPopupClick() {
        $("span[class='d-flex align-items-center']").shouldBe(clickable).click();
    }

    @Step("Click on the registration button")
    public void openRegistrationPageClick() {
        $("a.login-popup-register").shouldBe(clickable).click();
    }
}
