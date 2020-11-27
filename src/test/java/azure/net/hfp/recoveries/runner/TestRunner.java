package azure.net.hfp.recoveries.runner;
/*
This class just needs annotations to understand that cucumber features would be run through it
and you can specify feature files to be picked up, the steps package location and how reports are produced
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
