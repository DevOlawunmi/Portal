package azure.net.hfp.recoveries.pages;

import azure.net.hfp.recoveries.common.DriverLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    public HomePage (WebDriver driver)
    {
        DriverLibrary.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "password")
    private WebElement passwordBox;
    @FindBy(id = "username")
    private WebElement userNameField;
    @FindBy(xpath = "/html/body/app-root/app-content-wrapper/app-landing/div/div/div[2]/div/div[1]/button")
    private WebElement LBAInstructionButton;
    @FindBy(xpath = "//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div/div/form/div[3]/button")
    private WebElement signOnButton;

    public void enterUserName(String username) {
        waitForElementToBeDisplayed(userNameField);
        userNameField.clear();
        userNameField.sendKeys(username);
    }

    public void enterPassword(String userPassword) {
        waitForElementToBeDisplayed(passwordBox);
        passwordBox.clear();
        passwordBox.sendKeys(userPassword);
    }

    public void clickOnLBAInstruction(){
       new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable
               (By.xpath("/html/body/app-root/app-content-wrapper/app-landing/div/div/div[2]/div/div[1]/button"))).click();

    }
public void clickOnSignOnButton(){
        signOnButton.click();
}

}
