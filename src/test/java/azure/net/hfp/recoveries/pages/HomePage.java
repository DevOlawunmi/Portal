package azure.net.hfp.recoveries.pages;

import azure.net.hfp.recoveries.common.DriverLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage (WebDriver driver)
    {
        DriverLibrary.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "username")
    private WebElement userNameField;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper/app-landing/div/div/div[2]/div/div[1]/button")
    private WebElement LBAInstructionButton;
    @FindBy (xpath = "/html/body/app-root/app-content-wrapper/app-landing/div/div/div[2]/div/div[5]/button")
    private WebElement searchCasesButton;



    public void enterUserName(String username) {
        waitForElementToBeDisplayed(userNameField);
        userNameField.clear();
        userNameField.sendKeys(username);
    }

    public void enterPassword(String userPassword) {
        waitForElementToBeDisplayed(passwordField);
        passwordField.clear();
        passwordField.sendKeys(userPassword);
    }

    public void clickOnLBAInstruction()  {
        waitForElementToBeClickable(LBAInstructionButton);
        new LBAPage(driver);
    }

    public void clickOnSearchCasesButton(){
        searchCasesButton.click();
    }


}
