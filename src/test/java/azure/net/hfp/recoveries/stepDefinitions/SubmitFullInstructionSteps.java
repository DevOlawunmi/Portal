package azure.net.hfp.recoveries.stepDefinitions;

import azure.net.hfp.recoveries.pages.BasePage;
import azure.net.hfp.recoveries.pages.FullInstructionPage;
import azure.net.hfp.recoveries.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class SubmitFullInstructionSteps extends BasePage {
    FullInstructionPage fullInstructionPage = PageFactory.initElements(driver,FullInstructionPage.class);
    HomePage homePage = PageFactory.initElements(driver,HomePage.class);



    @And("I click on Full Instruction")
    public void iClickOnFullInstruction() {
        homePage.clickOnFullInstructionButton();

    }
    @Then("Full Instruction {string} is displayed")
    public void fullInstructionIsDisplayed(String instruction) {
        fullInstructionPage.isCorrectURLDisplayedForFullInstruction(instruction);
        fullInstructionPage.isFullInstructionPageDisplayed(instruction);
    }

    @And("I select the correct Zurich system from the dropdown list FI")
    public void iSelectTheCorrectZurichSystemFromTheDropdownListFI() {
fullInstructionPage.selectZurichSystem();
    }

    @And("I enter a {string} FI")
    public void iEnterAFI(String reference) {
        fullInstructionPage.enterZurichReference(reference);
    }

    @And("I click on next step one")
    public void iClickOnNextStepOne() {
        fullInstructionPage.clickOnNextStep();
    }
    @And("I select policyholder title for full ins")
    public void iSelectPolicyholderTitleForFullIns() {
        fullInstructionPage.selectPolicyholderTitle();
    }

    @And("I enter the full ins policyholder firstName {string}")
    public void iEnterTheFullInsPolicyholderFirstName(String firstName) {
        fullInstructionPage.enterPolicyholderFirstName(firstName);
    }

    @And("I enter the full ins policyholder lastName {string}")
    public void iEnterTheFullInsPolicyholderLastName(String lastName) {
        fullInstructionPage.enterPolicyholderLastName(lastName);
    }

    @And("I enter the full ins outlay {string}")
    public void iEnterTheFullInsOutlay(String outlay) {
        fullInstructionPage.enterOutlayAmount(outlay);
    }

    @And("I click on the next step two")
    public void iClickOnTheNextStepTwo() {
        fullInstructionPage.clickOnNextStepTwo();
    }

    @And("I select full ins third Party Title")
    public void iSelectFullInsThirdPartyTitle() {
        fullInstructionPage.selectThirdPartyTitle();
    }

    @And("I enter the full ins thirdPartyFirstName {string}")
    public void iEnterTheFullInsThirdPartyFirstName(String thirdPartyFirstName) {
        fullInstructionPage.enterThirdPartyFirstName(thirdPartyFirstName);
    }

    @And("I enter the full ins thirdPartyLastName {string}")
    public void iEnterTheFullInsThirdPartyLastName(String thirdPartyLastName) {
        fullInstructionPage.enterThirdPartyLastName(thirdPartyLastName);
    }

    @And("I select Yes to question Is third party Insured full inst")
    public void iSelectYesToQuestionIsThirdPartyInsuredFullInst() {
        fullInstructionPage.selectIsTPVInsuredYes();
    }

    @And("I select No to do you know TP address full ins")
    public void iSelectNoToDoYouKnowTPAddressFullIns() {
        fullInstructionPage.selectTPAddressNo();
    }

    @And("I select No to knowing TP vehicle reg")
    public void iSelectNoToKnowingTPVehicleReg() {
        fullInstructionPage.selectTP_VRNDetailsNo();
    }

    @And("I click on the next step three")
    public void iClickOnTheNextStepThree() {
        fullInstructionPage.clickOnNextStepThree();
    }


    @And("I select TPI {string}")
    public void iSelectTPI(String thirdPartyInsurer) {
        fullInstructionPage.enterTPI(thirdPartyInsurer);

    }

    @And("I enter the TPI street {string}")
    public void iEnterTheTPIStreet(String streetNo) {
        fullInstructionPage.enterTPIStreetNumber("22");
    }
    @And("I enter the TPI {string}")
    public void iEnterTheTPI(String arg0) {
    }


    @And("I click on the address lookup")
    public void iClickOnTheAddressLookup() {
    }

    @And("I enter the insurer reference number")
    public void iEnterTheInsurerReferenceNumber() {

    }

    @And("I enter the insurer email")
    public void iEnterTheInsurerEmail() {

    }

    @And("I select no to ripe insurer")
    public void iSelectNoToRipeInsurer() {

    }

    @And("I click on next step four")
    public void iClickOnNextStepFour() {

    }

    @And("select No to knowing insured vehicle details")
    public void selectNoToKnowingInsuredVehicleDetails() {

    }

    @And("I click on next step five")
    public void iClickOnNextStepFive() {

    }

    @And("I enter policyholder street number")
    public void iEnterPolicyholderStreetNumber() {

    }

    @And("I enter policyholder postcode")
    public void iEnterPolicyholderPostcode() {

    }

    @And("I click on address lookup")
    public void iClickOnAddressLookup() {

    }

    @And("I enter policyholder's email address")
    public void iEnterPolicyholderSEmailAddress() {

    }

    @And("I click on next step six")
    public void iClickOnNextStepSix() {

    }

    @And("I answer yes to was policyholder driving?")
    public void iAnswerYesToWasPolicyholderDriving() {

    }

    @And("I click on next step seven")
    public void iClickOnNextStepSeven() {

    }

    @And("I answer yes to was third party driving?")
    public void iAnswerYesToWasThirdPartyDriving() {

    }

    @And("I click on next step eight")
    public void iClickOnNextStepEight() {

    }

    @And("I enter the accident location")
    public void iEnterTheAccidentLocation() {

    }

    @And("I enter the accident circumstances")
    public void iEnterTheAccidentCircumstances() {

    }

    @And("I click on next step nine")
    public void iClickOnNextStepNine() {

    }

    @Then("the summary page is displayed")
    public void theSummaryPageIsDisplayed() {

    }

    @And("I click on the submit full instruction button")
    public void iClickOnTheSubmitFullInstructionButton() {
    }



}