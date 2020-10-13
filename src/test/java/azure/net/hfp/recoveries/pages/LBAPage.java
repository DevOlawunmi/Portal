package azure.net.hfp.recoveries.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public void clickOnNextButton1(){
        waitForElementToBeDisplayed(nextButton1);
        nextButton1.click();
    }
}
