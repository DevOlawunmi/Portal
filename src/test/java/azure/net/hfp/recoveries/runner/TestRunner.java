package azure.net.hfp.recoveries.runner;
/*
This class just needs annotations to understand that cucumber features will be run through it.
I have specified in Cucumber options the feature files to be picked up (features),
the steps package location(glue) and how reports are to be produced(plugin)
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/azure/net/hfp/recoveries/features"},
        plugin = {"pretty","json:target/report.json","de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
        glue = {"azure/net/hfp/recoveries/hook","azure/net/hfp/recoveries/stepDefinitions"},
        tags = "@lba_test"



)

public class TestRunner {

}
