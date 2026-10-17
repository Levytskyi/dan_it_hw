package aqa_hw_9;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class ProductListingPage {

    @Step("Wait that will be displayed 24 products and click on the first on the search result page")
    public void firstProductClick() {
       ElementsCollection products = $$("a.order-0").shouldHave(sizeGreaterThanOrEqual(24));
       products.get(0).click();
    }

    @Step("Click on the the first displayed product on the search result page")
    public void firstFoundElementClick() {
        $$("a.order-0").first().shouldBe(visible).click();
    }
}
