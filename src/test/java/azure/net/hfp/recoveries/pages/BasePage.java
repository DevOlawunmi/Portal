package azure.net.hfp.recoveries.pages;

import azure.net.hfp.recoveries.common.DriverLibrary;
import azure.net.hfp.recoveries.common.SuccessfulClick;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class BasePage extends DriverLibrary {
    public String BASE_URL = "https://hfp-recoveries.azureedge.net/";
    public Select select;




    public void launchURL() {
        driver.navigate().to(BASE_URL);

    }


    public void waitForElementToBeDisplayed(WebElement element) {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void selectByText(WebElement element,String text)
    {
        select = new Select(element);
        //select.getFirstSelectedOption();
}

public void waitForElementToBeClickable(WebElement element){

    WebDriverWait wait10 = new WebDriverWait(driver, 10);
    wait10.until(elementToBeClickable(element));
    wait10.until(new SuccessfulClick(element));
    //WebDriverWait wait2 = new WebDriverWait(driver, 10);
     //   wait2.until((ExpectedConditions.elementToBeClickable(element)));
}
}