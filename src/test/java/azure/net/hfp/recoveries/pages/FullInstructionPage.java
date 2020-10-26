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
    @FindBy (xpath = "//*[@id=\"formly_12_appStaticSelect_bacs_4\"]")
    private WebElement zurichSystemField;

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
        driver.findElement(By.xpath("//*[@id=\"formly_24_appStaticSelect_bacs_4\"]")).click();
        String winHandleBefore = driver.getWindowHandle();
        driver.switchTo().window(winHandleBefore);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"formly_12_appStaticSelect_bacs_4\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

}
