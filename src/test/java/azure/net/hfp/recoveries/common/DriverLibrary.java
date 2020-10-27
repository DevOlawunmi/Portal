package azure.net.hfp.recoveries.common;
/*
WebDriver is a tool for testing web applications across different browsers using different programming languages.
WebDriver allows the use of programming language of choice in designing tests.
It is not mandatory to write your Selenium code in the same language as the application.


There are seven basic elements of a Selenium test script, which apply to any test case and any application under test (AUT):
Create a WebDriver instance.
Navigate to a Web page.
Locate an HTML element on the Web page.
Perform an action on an HTML element.
Anticipate the browser response to the action.
Run tests and record test results using a test framework.
Conclude the test.
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverLibrary {
    public static WebDriver driver;
    public static WebDriverWait wait;

}
