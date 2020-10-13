package azure.net.hfp.recoveries.common;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.NoSuchElementException;

public class SuccessfulClick implements ExpectedCondition<Boolean> {
    private WebElement element;

    public SuccessfulClick(WebElement element) { //WebElement element
        this.element = element;
    }

    @Override
    public Boolean apply(WebDriver driver) {
        try {
            element.click();
            return true;
        } catch (ElementClickInterceptedException | StaleElementReferenceException | NoSuchElementException e) {
            return false;
        }
    }
}
