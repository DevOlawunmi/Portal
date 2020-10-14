package azure.net.hfp.recoveries.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LBAPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div/div/form/div[3]/button")
    private WebElement signOnButton;
    @FindBy (xpath = "//*[@id=\"formly_6_appInput_reference_3\"]")
    private WebElement referenceField;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-lba-instruction/div/p[1]")
    private WebElement pageTitle;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-lba-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/formly-form/formly-field/app-card-wrapper/div/div[2]/formly-group/formly-field[5]/app-static-select-field/div/mat-form-field")
    private WebElement zurichSystemField;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-lba-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement nextButton1;
    @FindBy(id = "formly_6_appStaticSelect_bacs_4")
    private WebElement zurichList;
    @FindBy (xpath = "//*[@id=\"formly_19_appDatepicker_accidentDate_0\"]")
    private WebElement accidentDateField;
    @FindBy (xpath = "/html/body/app-root/app-content-wrapper-slim/app-lba-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/formly-form/formly-field/app-card-wrapper/div/div[2]/formly-group/formly-field[2]/app-static-select-field/div/mat-form-field")
    private WebElement policyholderTitleField;
    @FindBy (xpath = "//*[@id=\"formly_19_appInput_policyholderFirstName_2\"]")
    private WebElement policyholderFirstNameField;
    @FindBy (xpath = "//*[@id=\"formly_19_appInput_policyholderLastName_3\"]")
    private WebElement policyholderLastNameField;
    @FindBy (xpath = "//*[@id=\"formly_19_appInput_outlayAmount_4\"]")
    private WebElement outlayAmountField;
    @FindBy (xpath = "/html/body/app-root/app-content-wrapper-slim/app-lba-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/div/button")
    private WebElement getNextButton1;

    public LBAPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    public void isLBAPageDisplayed(String LBA)
    {
        Assert.assertTrue(pageTitle.isDisplayed());
    }
    public void isCorrectUrlDisplayedForLBA(String LBA)
    {
        driver.getCurrentUrl().contains(LBA.toLowerCase());
    }
    public void clickOnSignOnButton(){
        signOnButton.click();
    }
    public void enterReferenceNumber(String reference){
        referenceField.sendKeys(reference);
    }

    public void selectZurichSystem()
    {

        driver.findElement(By.xpath("/html/body/app-root/app-content-wrapper-slim/app-lba-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/formly-form/formly-field/app-card-wrapper/div/div[2]/formly-group/formly-field[5]/app-static-select-field/div/mat-form-field")).click();
        String winHandleBefore = driver.getWindowHandle();
        driver.switchTo().window(winHandleBefore);
        WebElement element = driver.findElement(By.id("formly_6_appStaticSelect_bacs_4"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();

    }

    public void enterAccidentDate(String accidentDate){
        waitForElementToBeClickable(accidentDateField);
        accidentDateField.sendKeys(accidentDate);

    }

    public void clickOnNextButton1(){
        waitForElementToBeDisplayed(nextButton1);
        nextButton1.click();
    }

    public void selectPolicyholderTitle(){
        driver.findElement(By.xpath("/html/body/app-root/app-content-wrapper-slim/app-lba-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/formly-form/formly-field/app-card-wrapper/div/div[2]/formly-group/formly-field[2]/app-static-select-field/div/mat-form-field/div/div[1]")).click();
        WebElement element2 = driver.findElement(By.xpath(
                "/html/body/app-root/app-content-wrapper-slim/app-lba-instruction/div/app-form/div/div/div[2]/div/app-form-container/form/formly-form/formly-field/app-card-wrapper/div/div[2]/formly-group/formly-field[2]/app-static-select-field/div/mat-form-field"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element2).click().perform();
    }

    public void enterPolicyholderFirstName(String firstName){
       waitForElementToBeDisplayed(policyholderFirstNameField);
        policyholderFirstNameField.sendKeys(firstName);
    }

    public void enterPolicyholderLastName(String lastName){
        policyholderLastNameField.sendKeys(lastName);

    }

    public void enterOutlayAmount(String outlay){
        outlayAmountField.sendKeys(outlay);
    }

    public void clickOnTheNextStepButton(){
        getNextButton1.click();
    }
}
