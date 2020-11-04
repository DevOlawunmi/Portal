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

}
