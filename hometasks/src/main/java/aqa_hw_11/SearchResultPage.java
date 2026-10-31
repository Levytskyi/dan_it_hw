package aqa_hw_11;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {

    public String getTitle() {
        return $("div.search__title").shouldBe(exist).getText();
    }

    public String getProductName(int productIndex) {
        ElementsCollection productNames = $$("[class='list-item__title-container m_b-5']").
                shouldHave(sizeGreaterThanOrEqual(productIndex - 1));
        return productNames.get(productIndex - 1).getText();
    }

    public void clickOnProductPicture(int productIndex) {
        ElementsCollection productPicturesElements
                = $$("div.list-item__photo").
                shouldHave(sizeGreaterThanOrEqual(productIndex - 1));
        productPicturesElements.get(productIndex - 1).click();
    }
}
