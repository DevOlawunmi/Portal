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
    private WebElement passwordBox;
    @FindBy(id = "username")
    private WebElement userNameField;

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
}