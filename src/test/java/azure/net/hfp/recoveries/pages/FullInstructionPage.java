package azure.net.hfp.recoveries.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FullInstructionPage extends BasePage{
    @FindBy (xpath = "//*[@id=\"formly_6_appInput_reference_3\"]")
    private WebElement referenceField;
    @FindBy (xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/p[1]")
    private WebElement pageTitle;
    @FindBy (xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/formly-form/formly-field/app-card-wrapper/div/div[2]/formly-group/formly-field[5]/app-static-select-field/div/mat-form-field")
    private WebElement zurichSystemField;
    @FindBy (xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement nextButton1;
    @FindBy (xpath = "//*[@id=\"formly_19_appStaticSelect_policyholderTitle_1\"]")
    private WebElement policyholderTitleField;
    @FindBy (xpath = "//*[@id=\"formly_19_appInput_policyholderFirstName_2\"]")
    private WebElement policyholderFirstNameField;
    @FindBy (xpath = "//*[@id=\"formly_19_appInput_policyholderLastName_3\"]")
    private WebElement policyholderLastNameField;
    @FindBy (xpath = "//*[@id=\"formly_19_appInput_outlayAmount_4\"]")
    private WebElement outlayField;
    @FindBy (xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement nextButtonTwo;
    @FindBy (xpath = "//*[@id=\"formly_26_appStaticSelect_title_0\"]")
    private WebElement thirdPartyTitleField;
    @FindBy (xpath = "//*[@id=\"formly_26_appInput_firstName_1\"]")
    private WebElement thirdPartyFirstNameField;
    @FindBy (xpath = "//*[@id=\"formly_26_appInput_lastName_2\"]")
    private WebElement thirdPartyLastNameField;
    @FindBy (xpath = "//*[@id=\"formly_28_appRadio_isTPVInsured_0_0\"]")
    private WebElement TPVInsuredYes;
    @FindBy (xpath = "//*[@id=\"formly_28_appRadio_isTPDAddress_1_1\"]")
    private WebElement TPAddressNo;
    @FindBy (xpath = "//*[@id=\"formly_44_appRadio_haveGotDetails_0_1\"]")
    private WebElement TP_VRNDetailsNo;
    @FindBy (xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement nextButton3;
    @FindBy (xpath = "//*[@id=\"formly_56_appSelect_name_0\"]")
    private WebElement TPIField;
    @FindBy (xpath = "//*[@id=\"formly_62_appInput_streetNumberOrBuildingName_0\"]")
    private WebElement TPIStreetNumberField;

    public FullInstructionPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void enterZurichReference(String reference){
        referenceField.sendKeys(reference);

    }
    public void isFullInstructionPageDisplayed(String instruction){
        Assert.assertTrue(pageTitle.isDisplayed());

    }
    public void isCorrectURLDisplayedForFullInstruction(String instruction){
        driver.getCurrentUrl().contains(instruction.toLowerCase());
    }
    public void selectZurichSystem(){
        zurichSystemField.click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mat-option-12\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    public void clickOnNextStep(){
        nextButton1.click();

    }

    public void selectPolicyholderTitle(){
        policyholderTitleField.click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"formly_19_appStaticSelect_policyholderTitle_1\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public void enterPolicyholderFirstName(String firstName){
        policyholderFirstNameField.sendKeys(firstName);
    }

    public void enterPolicyholderLastName(String lastName){
        policyholderLastNameField.sendKeys(lastName);
    }

    public void enterOutlayAmount(String outlay){
        outlayField.sendKeys(outlay);

    }

    public void clickOnNextStepTwo(){
        nextButtonTwo.click();
    }

    public void selectThirdPartyTitle(){
        thirdPartyTitleField.click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"formly_26_appStaticSelect_title_0\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();

    }

    public void enterThirdPartyFirstName(String thirdPartyFirstName){
        thirdPartyFirstNameField.sendKeys(thirdPartyFirstName);

    }

    public void enterThirdPartyLastName(String thirdPartyFirstName){
        thirdPartyLastNameField.sendKeys(thirdPartyFirstName);

    }

    public void selectIsTPVInsuredYes(){
        TPVInsuredYes.click();
    }

    public void selectTPAddressNo(){
        TPAddressNo.click();
    }

    public void selectTP_VRNDetailsNo(){
        TP_VRNDetailsNo.click();
    }
    public void clickOnNextStepThree(){
        nextButton3.click();

    }

    public void enterTPI(String thirdPartyInsurer){
        TPIField.sendKeys(thirdPartyInsurer);
        driver.findElement(By.xpath("//*[@id=\"mat-option-556\"]/span[contains(.,'ACE')]")).click();

    }

    public void enterTPIStreetNumber(String streetNo){
        TPIStreetNumberField.sendKeys(streetNo);
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }


}
