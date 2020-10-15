package azure.net.hfp.recoveries.stepDefinitions;

import azure.net.hfp.recoveries.pages.BasePage;
import azure.net.hfp.recoveries.pages.HomePage;
import azure.net.hfp.recoveries.pages.LBAPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class SubmitLBASteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LBAPage lbaPage = PageFactory.initElements(driver, LBAPage.class);
    @Given("I navigate to Recoveries portal")
    public void i_navigate_to_recoveries_portal()
    {
        homePage.launchURL();
    }

    @And("I enter my username")
    public void iEnterMyUsername()
    {
        homePage.enterUserName("Ola.ajibola@h-f.co.uk");
    }


    @Given("I enter my password")
    public void i_enter_my_password() throws InterruptedException {
        homePage.enterPassword("@Fisherman01");

    }

    @When("I enter a {string}")
    public void i_enter_a(String reference) {

        lbaPage.enterReferenceNumber(reference);

    }



    @And("I select the correct Zurich system from the dropdown list")
    public void iSelectTheCorrectZurichSystemFromTheDropdownList() {
        lbaPage.selectZurichSystem();
    }

    @When("I click on next step")
    public void i_click_on_next_step() {
      lbaPage.clickOnNextButton1();
    }

    @When("I enter the {string}")
    public void i_enter_the(String accidentDate) {
lbaPage.enterAccidentDate(accidentDate);
    }
    @And("I select third Party Title")
    public void iSelectThirdPartyTitle() {

    }
    @And("I select policyholder title")
    public void iSelectPolicyholderTitle() {
        lbaPage.selectPolicyholderTitle();
    }


    @When("I enter the policyholder firstName {string}")
    public void i_enter_the_policyholder_firstName(String firstName) {
        lbaPage.enterPolicyholderFirstName(firstName);

    }
    @When("I enter the policyholder lastName {string}")
    public void i_enter_the_policyholder_lastName(String lastName) {
        lbaPage.enterPolicyholderLastName(lastName);


    }
    @And("I enter the outlay {string}")
    public void iEnterTheOutlay(String outlay) {
        lbaPage.enterOutlayAmount(outlay);
    }

    @When("I click on the next step")
    public void i_click_on_the_next_step() {
        lbaPage.clickOnTheNextStepButton();

    }
    @And("I select thirdPartyTitle {string}")
    public void iSelectThirdPartyTitle(String arg0) {
        lbaPage.selectThirdPartyTitle();

    }

    @And("I enter the thirdPartyFirstName {string}")
    public void iEnterTheThirdPartyFirstName(String thirdPartyFirstName) {
        lbaPage.enterThirdPartyFirstName(thirdPartyFirstName);

    }

    @And("I enter the thirdPartyLastName {string}")
    public void iEnterTheThirdPartyLastName(String thirdPartyLastName) {
        lbaPage.enterThirdPartyLastName(thirdPartyLastName);
    }

    @When("I select {string}")
    public void i_select(String string) {

    }

    @When("I select Yes to question {string}")
    public void i_select_yes_to_question(String string) {
        lbaPage.selectYes();

    }

    @When("I select No to do you know TP address")
    public void i_select_no_to_do_you_know_tp_address() {
        lbaPage.selectNo();

    }

    @When("I select Yes to knowing TP vehicle reg")
    public void i_select_yes_to_knowing_tp_vehicle_reg() {
lbaPage.selectYes2();

    }

    @When("I enter {string}")
    public void i_enter(String string) {

    }
    @And("I enter the third party VRN {string}")
    public void iEnterTheThirdPartyVRN(String thirdPartyVRN) {
        lbaPage.enterVehicleVRN(thirdPartyVRN);
    }

    @And("I click on VRN Search")
    public void iClickOnVRNSearch() {
        lbaPage.lookUpVRN();
    }
    @When("I click on the next step again")
    public void i_click_on_the_next_step_again() {

    }
    @And("I enter the insurer reference {string}")
    public void iEnterTheInsurerReference(String arg0) {
    }

    @When("I select Yes to Ripe insurer")
    public void i_select_yes_to_ripe_insurer() {

    }

    @Then("the summary page is displayed")
    public void the_summary_page_is_displayed() {

    }

    @Then("I click on the submit button")
    public void i_click_on_the_submit_button() {

    }

    @Then("my submission reference is displayed")
    public void my_submission_reference_is_displayed() {


    }
    @And("I click on LBA Instruction")
    public void iClickOnLBAInstruction() throws InterruptedException {
        homePage.clickOnLBAInstruction();
    }

    @And("I click on the sign on button")
    public void iClickOnTheSignOnButton() {
        lbaPage.clickOnSignOnButton();
    }



    @Then("LBA {string} is displayed")
    public void lbaIsDisplayed(String LBA) {
        lbaPage.isCorrectUrlDisplayedForLBA(LBA);
        lbaPage.isLBAPageDisplayed(LBA);
    }



}
