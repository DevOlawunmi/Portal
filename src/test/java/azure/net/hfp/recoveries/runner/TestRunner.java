package azure.net.hfp.recoveries.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/azure/net/hfp/recoveries/features"},
        plugin = {"pretty","json:target/report.json","de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
        glue = {"azure/net/hfp/recoveries/hook","azure/net/hfp/recoveries/stepDefinitions"}
)

public class TestRunner {
}
