package azure.net.hfp.recoveries.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LBAPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div/div/form/div[3]/button")
    private WebElement signOnButton;
    @FindBy (xpath = "//*[@id=\"formly_6_appInput_reference_3\"]")
    private WebElement referenceField;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-lba-instruction/div/p[1]")
    private WebElement pageTitle;
    @FindBy(xpath = "//*[@id=\"formly_6_appStaticSelect_bacs_4\"]/div/div[2]/div")
    private WebElement zurichSystemField;

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
    public void selectZurichSystem(String zurichSystem)
    {
        selectByText(zurichSystemField,zurichSystem);
    }
}
