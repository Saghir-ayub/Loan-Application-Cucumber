package Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Resources/Features",
        glue = {"StepDefinitions"},
        tags = "@LoggingInFeature",
        plugin = {"pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-reports/Cucumber-test-results.html"})
public class Runner {
}
