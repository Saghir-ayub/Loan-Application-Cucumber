package Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Resources/Features", glue = {"StepDefinitions"},tags = "@LoggingInFeature",plugin = {"json:target/Cucumber-reports/Cucumber.json"})
public class Runner {
}
