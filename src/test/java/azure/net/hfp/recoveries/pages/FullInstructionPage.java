package azure.net.hfp.recoveries.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FullInstructionPage extends BasePage{
    @FindBy (xpath = "//*[@id=\"formly_6_appInput_reference_3\"]")
    private WebElement zurichSystemField;
    @FindBy (xpath = "/html/body/app-root/app-content-wrapper-slim/app-full-instruction/div/p[1]")
    private WebElement pageTitle;

    public FullInstructionPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void enterZurichReference(String reference){
        zurichSystemField.sendKeys(reference);

    }
    public void isFullInstructionPageDisplayed(String instruction){
        Assert.assertTrue(pageTitle.isDisplayed());

    }
    public void isCorrectURLDisplayedForFullInstruction(String instruction){
        driver.getCurrentUrl().contains(instruction.toLowerCase());
    }

}
