package azure.net.hfp.recoveries.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FullInstructionPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"formly_6_appInput_reference_3\"]")
    private WebElement referenceField;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/p[1]")
    private WebElement pageTitle;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/formly-form/formly-field/app-card-wrapper/div/div[2]/formly-group/formly-field[5]/app-static-select-field/div/mat-form-field")
    private WebElement zurichSystemField;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement nextButton1;
    @FindBy(xpath = "//*[@id=\"formly_19_appStaticSelect_policyholderTitle_1\"]")
    private WebElement policyholderTitleField;
    @FindBy(xpath = "//*[@id=\"formly_19_appInput_policyholderFirstName_2\"]")
    private WebElement policyholderFirstNameField;
    @FindBy(xpath = "//*[@id=\"formly_19_appInput_policyholderLastName_3\"]")
    private WebElement policyholderLastNameField;
    @FindBy(xpath = "//*[@id=\"formly_19_appInput_outlayAmount_4\"]")
    private WebElement outlayField;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement nextButtonTwo;
    @FindBy(xpath = "//*[@id=\"formly_26_appStaticSelect_title_0\"]")
    private WebElement thirdPartyTitleField;
    @FindBy(xpath = "//*[@id=\"formly_26_appInput_firstName_1\"]")
    private WebElement thirdPartyFirstNameField;
    @FindBy(xpath = "//*[@id=\"formly_26_appInput_lastName_2\"]")
    private WebElement thirdPartyLastNameField;
    @FindBy(xpath = "//*[@id=\"formly_28_appRadio_isTPVInsured_0_0\"]")
    private WebElement TPVInsuredYes;
    @FindBy(xpath = "//*[@id=\"formly_28_appRadio_isTPDAddress_1_1\"]")
    private WebElement TPAddressNo;
    @FindBy(xpath = "//*[@id=\"formly_44_appRadio_haveGotDetails_0_1\"]")
    private WebElement TP_VRNDetailsNo;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement nextButton3;
    @FindBy(xpath = "//*[@id=\"formly_56_appSelect_name_0\"]")
    private WebElement TPIField;
    @FindBy(xpath = "//*[@id=\"formly_62_appInput_streetNumberOrBuildingName_0\"]")
    private WebElement TPIStreetNumberField;
    @FindBy(xpath = "//*[@id=\"formly_62_appInput_postalCode_1\"]")
    private WebElement TPIPostcodeField;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/formly-form/formly-field[1]/app-card-wrapper/div/div[2]/formly-group/formly-field[3]/formly-group/formly-field/formly-group/formly-field[3]/app-button-wrapper/div[1]/div/button")
    private WebElement getTPIPostcodeButton;
    @FindBy(xpath = "//*[@id=\"formly_68_appInput_reference_3\"]")
    private WebElement TPIReferenceField;
    @FindBy(xpath = "//*[@id=\"formly_68_appInput_email_4\"]")
    private WebElement TPIEmailField;
    @FindBy(xpath = "//*[@id=\"formly_68_appRadio_ripe_5_0\"]")
    private WebElement ripeInsurerButtonNo;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement nextStep4Button;
    @FindBy(xpath = "//*[@id=\"formly_72_appRadio_haveGotDetails_0_1\"]")
    private WebElement doYouKnowInsuredVehicleDetailsNo;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement nextStep5Button;
    @FindBy(xpath = "//*[@id=\"formly_85_appInput_streetNumberOrBuildingName_0\"]")
    private WebElement policyholderStreetNumberField;
    @FindBy(xpath = "//*[@id=\"formly_85_appInput_postalCode_1\"]")
    private WebElement policyholderPostcodeField;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/formly-form/formly-field/app-card-wrapper/div/div[2]/formly-group/formly-field[1]/formly-group/formly-field[3]/app-button-wrapper/div[1]/div/button")
    private WebElement addressLookupButton;
    @FindBy(xpath = "//*[@id=\"formly_91_appInput_policyholderPhone_1\"]")
    private WebElement policyholderPhoneField;
    @FindBy(xpath = "//*[@id=\"formly_91_appInput_policyholderEmail_2\"]")
    private WebElement policyholderEmailField;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement nextStep6Button;
    @FindBy(xpath = "//*[@id=\"formly_94_appRadio_isPolicyholderDriver_0_0\"]")
    private WebElement isPolicyholderDriverYes;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement nextStep7Button;
    @FindBy(xpath = "//*[@id=\"formly_114_appRadio_isThirdPartyDriver_0_0\"]")
    private WebElement isThirdPartyDriverYes;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement nextStep8Button;
    @FindBy(xpath = "//*[@id=\"formly_134_appInput_accidentLocation_0\"]")
    private WebElement accidentLocationField;
    @FindBy(xpath = "//*[@id=\"formly_134_appTextArea_accidentCircumstances_1\"]")
    private WebElement accidentCircumstancesField;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement nextStep9Button;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/button")
    private WebElement submitButton;


    public FullInstructionPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterZurichReference(String reference) {
        referenceField.sendKeys(reference);

    }

    public void isFullInstructionPageDisplayed(String instruction) {
        Assert.assertTrue(pageTitle.isDisplayed());

    }

    public void isCorrectURLDisplayedForFullInstruction(String instruction) {
        driver.getCurrentUrl().contains(instruction.toLowerCase());
    }

    public void selectZurichSystem() {
        zurichSystemField.click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mat-option-12\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void clickOnNextStep() {
        nextButton1.click();

    }

    public void selectPolicyholderTitle() {
        policyholderTitleField.click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"formly_19_appStaticSelect_policyholderTitle_1\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void enterPolicyholderFirstName(String firstName) {
        policyholderFirstNameField.sendKeys(firstName);
    }

    public void enterPolicyholderLastName(String lastName) {
        policyholderLastNameField.sendKeys(lastName);
    }

    public void enterOutlayAmount(String outlay) {
        outlayField.sendKeys(outlay);

    }

    public void clickOnNextStepTwo() {
        nextButtonTwo.click();
    }

    public void selectThirdPartyTitle() {
        thirdPartyTitleField.click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"formly_26_appStaticSelect_title_0\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();

    }

    public void enterThirdPartyFirstName(String thirdPartyFirstName) {
        thirdPartyFirstNameField.sendKeys(thirdPartyFirstName);

    }

    public void enterThirdPartyLastName(String thirdPartyFirstName) {
        thirdPartyLastNameField.sendKeys(thirdPartyFirstName);

    }

    public void selectIsTPVInsuredYes() {
        TPVInsuredYes.click();
    }

    public void selectTPAddressNo() {
        TPAddressNo.click();
    }

    public void selectTP_VRNDetailsNo() {
        TP_VRNDetailsNo.click();
    }

    public void clickOnNextStepThree() {
        nextButton3.click();

    }

    public void enterTPI(String thirdPartyInsurer) {
        TPIField.sendKeys(thirdPartyInsurer);
        driver.findElement(By.xpath("//*[@id=\"mat-option-556\"]/span[contains(.,'ACE')]")).click();

    }

    public void enterTPIStreetNumber(String streetNo) {
        TPIStreetNumberField.sendKeys(streetNo);

    }

    public void enterThirdPartyPostcode(String postcode) {
        TPIPostcodeField.sendKeys(postcode);

    }

    public void lookUpTPIAddress() {
        getTPIPostcodeButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void enterTPIReference(String reference) {
        TPIReferenceField.sendKeys(reference);
    }

    public void enterTPIEmail(String email) {
        TPIEmailField.sendKeys(email);
    }

    public void selectNoToRipeInsurer() {
        ripeInsurerButtonNo.click();
    }

    public void clickOnNextStepFour() {
        nextStep4Button.click();
    }

    public void setDoYouKnowInsuredVehicleDetailsNo() {
        doYouKnowInsuredVehicleDetailsNo.click();
    }

    public void clickOnNextStepFive() {
        nextStep5Button.click();
    }

    public void enterPolicyholderStreetNumber(String streetNumber) {
        policyholderStreetNumberField.sendKeys(streetNumber);
    }

    public void enterPolicyholderPostcode(String postcode) {
        policyholderPostcodeField.sendKeys(postcode);
    }

    public void lookUpPolicyholderAddress() {
        addressLookupButton.click();
    }

    public void enterPolicyholderPhone(String phone) {
        policyholderPhoneField.sendKeys(phone);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void enterPolicyholderEmail(String email) {
        policyholderEmailField.sendKeys(email);
    }

    public void clickOnNextStepSix() {
        nextStep6Button.click();
    }

    public void selectYesToPolicyholderDriving() {
        isPolicyholderDriverYes.click();
    }

    public void clickOnNextStepSeven() {
        nextStep7Button.click();
    }

    public void selectYesToThirdPartyDriving() {
        isThirdPartyDriverYes.click();
    }

    public void clickOnNextStepEight() {
        nextStep8Button.click();
    }

    public void enterAccidentLocation(String location) {
        accidentLocationField.sendKeys(location);
    }

    public void enterAccidentCircumstances(String circumstances) {
        accidentCircumstancesField.sendKeys(circumstances);

    }

    public void clickOnNextStepNine() {
        nextStep9Button.click();
    }

    public void clickOnSubmitButton(){
        submitButton.click();
    }
}