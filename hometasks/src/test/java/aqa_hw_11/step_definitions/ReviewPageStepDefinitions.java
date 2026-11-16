package aqa_hw_11.step_definitions;

import aqa_hw_11.ReviewsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ReviewPageStepDefinitions {
    private ReviewsPage reviewsPage = new ReviewsPage();

    @And("User enters {string} in the store search field on the Review Page")
    public void enterStoreNameInStoreSearchField(String selectedStore) {
        reviewsPage.enterStoreNameInStoreSearchField(selectedStore);
    }

    @And("User selects the store at position {int} from the dropdown on the Review Page")
    public void selectCorrectStoreFromList(int selectedStoreIndex) {
        reviewsPage.selectCorrectOptionInStoreSearchDropList(selectedStoreIndex);
    }

    @Then("The review page for {string} is displayed")
    public void verifyTitle(String selectedStoreTitle) {
        Assert.assertTrue("The actual title doesn't contain " + selectedStoreTitle, reviewsPage.getActualStoreTitle().contains(selectedStoreTitle));
    }
}
