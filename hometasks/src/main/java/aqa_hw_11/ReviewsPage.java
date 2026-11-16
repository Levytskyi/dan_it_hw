package aqa_hw_11;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ReviewsPage {
    public void enterStoreNameInStoreSearchField(String storeName) {
        $("div.reviews-info__search input[type='text']").shouldBe(visible).setValue(storeName);
    }

    public void selectCorrectOptionInStoreSearchDropList(int selectedStoreIndex) {
        $$("div.autosuggest__results-container div.autosuggest__result").
                shouldHave(sizeGreaterThanOrEqual(selectedStoreIndex - 1)).
                get(selectedStoreIndex - 1).
                click();
    }

    public String getActualStoreTitle() {
        return $("h1.store-info-reviews-stat__title").shouldBe(visible).getText();
    }
}
