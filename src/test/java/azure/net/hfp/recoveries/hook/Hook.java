package azure.net.hfp.recoveries.hook;
/*
Each scenario is a list of steps for Cucumber to work through.
Cucumber verifies that the software conforms with the specification and generates a report indicating success or failure for each scenario.

In order for Cucumber to understand the scenarios, they must follow some basic syntax rules, called Gherkin.
Cucumber supports hooks, which are blocks of code that run before or after each scenario.
You can define them anywhere in your project or step definition layers, using the methods @Before and @After.
Cucumber Hooks allows us to better manage the code workflow and helps us to reduce the code redundancy.
We can say that it is an unseen step, which allows us to perform our scenarios or tests.
 */
import azure.net.hfp.recoveries.common.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends Browsers {

    private Scenario scenario;

    @Before
    public void setUp(Scenario scenario) {
        this.scenario = scenario;
        String defaultBrowser = "Chrome";
        launchBrowser(defaultBrowser);
    }

    @After
    public void tearDown() {
        closeBrowser();
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "screenshot.png", "failurePage");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
