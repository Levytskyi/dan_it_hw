package aqa_hw_11.step_definitions;

import aqa_hw_11.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageStepDefinitions {
    private HomePage homePage = new HomePage();

    @Given("User opens Home Page")
    public void openHomePage() {
        homePage.openHomePage();
    }

    @When("User enters {string} word into search field on Home Page")
    public void enterWordToSearch(String wordToSearch) {
        homePage.enterWordToSearch(wordToSearch);
    }

    @When("User clicks the login button on the Home Page")
    public void clickOnLoginButton() {
        homePage.clickOnLoginButton();
    }

    @When("User clicks the Review Page button")
    public void clickOnReviewPageButton() {
        homePage.clickOnStoresReviewButton();
    }

    @When("User clicks on main catalog button on Home Page")
    public void clickOnMainCatalogButton() {
        homePage.clickOnMainCatalogButton();
    }

    @And("User clicks on search button on Home Page")
    public void clickOnSearchButton() {
        homePage.clickOnSearchButton();
    }

    @Then("verify main catalog menu appears on Home Page")
    public void verifyMainCatalogMenuIsDisplayed() {
        Assert.assertTrue(homePage.verifyMainCatalogMenuIsDisplayed());
    }
}
