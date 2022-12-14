package SuiteRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Resources/Features",
        glue = {"StepDefinitions"},
        tags = "@AccessDeniedFeature",
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class AllureRunner {
}
