package azure.net.hfp.recoveries.stepDefinitions;

import azure.net.hfp.recoveries.pages.BasePage;
import azure.net.hfp.recoveries.pages.HomePage;
import azure.net.hfp.recoveries.pages.SearchCasesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class SearchCasesSteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
SearchCasesPage searchCasesPage = PageFactory.initElements(driver, SearchCasesPage.class);
    @And("I click on the Search Cases button")
    public void iClickOnTheSearchCasesButton() {
       homePage.clickOnSearchCasesButton();
    }

    @Then("Search Cases page {string} is displayed")
    public void searchCasesPageIsDisplayed(String search) {
        searchCasesPage.isCorrectUrlDisplayedForSearch(search);
        searchCasesPage.isSearchPageDisplayed(search);
    }

    @And("I enter our reference {string}")
    public void iEnterOurReference(String ourReference) {
        searchCasesPage.enterOurRef(ourReference);
        
    }

    @And("I click on search")
    public void iClickOnSearch() {
        searchCasesPage.clickOnSearchButton();
    }

    @Then("existing cases are displayed")
    public void existingCasesAreDisplayed() {
    }


    @And("I enter your reference {string}")
    public void iEnterYourReference(String yourReference) {
        searchCasesPage.enterYourRef(yourReference);
    }
}