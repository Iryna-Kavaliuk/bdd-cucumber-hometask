package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/com/epam/ta/features",
    glue = {"stepdefinitions", "hooks"},
    tags = "@RegularTest",
    plugin = {"pretty",
        "html:target/SystemTestReports/html",
        "json:target/SystemTestReports/json/report.json",
        "junit:target/SystemTestReports/junit/report.xml"},
    dryRun = false,
    monochrome=true
)

public class GoogleCloudPricingCalculatorTest extends CommonConditions {

}
