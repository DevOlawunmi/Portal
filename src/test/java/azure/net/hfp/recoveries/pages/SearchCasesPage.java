package azure.net.hfp.recoveries.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCasesPage extends BasePage {


    @FindBy(xpath = "/html/body/app-root/app-content-wrapper-slim/app-search-cases/div[1]/p")
    private WebElement pageTitle;
    @FindBy (xpath = "//*[@id=\"formly_3_appInput_ourReference_0\"]")
    private WebElement ourReferenceField;
    @FindBy (xpath = "/html/body/app-root/app-content-wrapper-slim/app-search-cases/div[2]/app-search/div/div/app-form-container/form/div/button")
    private WebElement searchButton;
    @FindBy (xpath = "//*[@id=\"formly_3_appInput_yourReference_1\"]")
    private WebElement yourReferenceField;

        public SearchCasesPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void isSearchPageDisplayed(String Search)
    {
        Assert.assertTrue(pageTitle.isDisplayed());
    }
    public void isCorrectUrlDisplayedForSearch(String Search)
    {
        driver.getCurrentUrl().contains(Search.toLowerCase());
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public void enterOurRef(String ourReference){
            waitForElementToBeDisplayed(ourReferenceField);
            ourReferenceField.sendKeys(ourReference);
                }

    public void clickOnSearchButton(){
            searchButton.click();
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
                }

    public void enterYourRef(String yourReference){
yourReferenceField.sendKeys(yourReference);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    }

