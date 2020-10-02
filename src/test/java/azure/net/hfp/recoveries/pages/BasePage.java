package azure.net.hfp.recoveries.pages;

import azure.net.hfp.recoveries.common.DriverLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverLibrary {
    public String BASE_URL = "https://recoveriesapp.h-f.co.uk/";
    @FindBy(id = "password")
    private WebElement passwordBox;
    @FindBy(id = "username")
    private WebElement userNameField;

    private String userPassword = "Fisherman02";

    public void launchBrowser() {
        driver.navigate().to(BASE_URL);
    }

    public void waitForElementToBeDisplayed(WebElement element) {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
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